-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mer 23 Mars 2016 à 23:28
-- Version du serveur: 5.5.47-0ubuntu0.14.04.1
-- Version de PHP: 5.5.9-1ubuntu4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `spring`
--

-- --------------------------------------------------------

--
-- Structure de la table `Customer`
--

CREATE TABLE IF NOT EXISTS `Customer` (
  `customerId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `prenom` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(255) NOT NULL COMMENT 'commentaire',
  `createdDate` datetime NOT NULL,
  `mail` varchar(200) NOT NULL,
  `username` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `pathImg` varchar(300) NOT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `OrderCustomer`
--

CREATE TABLE IF NOT EXISTS `OrderCustomer` (
  `orderCustomerId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `customerId` bigint(20) unsigned NOT NULL,
  `orderDate` datetime NOT NULL,
  `montant` float NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`orderCustomerId`),
  KEY `customerId` (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `OrderProjet`
--

CREATE TABLE IF NOT EXISTS `OrderProjet` (
  `projetId` bigint(20) unsigned NOT NULL,
  `orderCustomerId` bigint(20) unsigned NOT NULL,
  KEY `projetId` (`projetId`),
  KEY `orderCustomerId` (`orderCustomerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Projet`
--

CREATE TABLE IF NOT EXISTS `Projet` (
  `projetId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `somme_demande` float NOT NULL,
  `date_debut` datetime NOT NULL,
  `date_fin` datetime NOT NULL,
  `description` varchar(255) NOT NULL,
  `path_img` varchar(255) NOT NULL,
  PRIMARY KEY (`projetId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `ProjetTeam`
--

CREATE TABLE IF NOT EXISTS `ProjetTeam` (
  `projetId` bigint(20) unsigned NOT NULL,
  `teamId` bigint(20) unsigned NOT NULL,
  KEY `projetId` (`projetId`),
  KEY `teamId` (`teamId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Team`
--

CREATE TABLE IF NOT EXISTS `Team` (
  `teamId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `customerId` bigint(20) unsigned NOT NULL,
  `orderDate` datetime NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `adresse` varchar(200) NOT NULL,
  `mail` varchar(50) NOT NULL,
  PRIMARY KEY (`teamId`),
  KEY `customerId` (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `OrderCustomer`
--
ALTER TABLE `OrderCustomer`
  ADD CONSTRAINT `OrderCustomer_ibfk_1` FOREIGN KEY (`customerId`) REFERENCES `Customer` (`customerId`);

--
-- Contraintes pour la table `OrderProjet`
--
ALTER TABLE `OrderProjet`
  ADD CONSTRAINT `OrderProjet_ibfk_1` FOREIGN KEY (`projetId`) REFERENCES `Projet` (`projetId`),
  ADD CONSTRAINT `OrderProjet_ibfk_2` FOREIGN KEY (`orderCustomerId`) REFERENCES `OrderCustomer` (`orderCustomerId`);

--
-- Contraintes pour la table `ProjetTeam`
--
ALTER TABLE `ProjetTeam`
  ADD CONSTRAINT `ProjetTeam_ibfk_1` FOREIGN KEY (`projetId`) REFERENCES `Projet` (`projetId`),
  ADD CONSTRAINT `ProjetTeam_ibfk_2` FOREIGN KEY (`teamId`) REFERENCES `Team` (`teamId`);

--
-- Contraintes pour la table `Team`
--
ALTER TABLE `Team`
  ADD CONSTRAINT `Team_ibfk_1` FOREIGN KEY (`customerId`) REFERENCES `Customer` (`customerId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
