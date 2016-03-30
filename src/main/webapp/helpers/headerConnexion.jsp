<%@ taglib prefix="s" uri="/struts-tags"%>

<s:if test="#session.customerConnected == null">
<!--  No User Connected -->
<div class="container-fluid">
	<div class="row">
		<div class="headerConnexion">
			<div class="home_left"> 
				<button onclick="window.location.href='/spring/pages/index.jsp'">HOME</button>
			</div>
			<div class="options_connexion">
				<button onclick="window.location.href='/spring/pages/editCustomer.jsp'">Sign up</button>
				<button onclick="window.location.href='/spring/pages/connectCustomer.jsp'">Sign in</button>
			</div>
		</div>
	</div>
</div>
</s:if>

<s:if test="#session.customerConnected != null">
<!--  User connected -->
<div class="container-fluid">
	<div class="row">
		<div class="headerConnexion">
			<div class="home_left"> 
				<button onclick="window.location.href='/spring/pages/index.jsp'">HOME</button>
			</div>
			<div class="options_connexion">
				<button onclick="window.location.href='/spring/editCustomerAction.action?customerId=#session.customerConnected.getCustomerId()'">Modify Profile</button>
				<button onclick="window.location.href='/spring/pages/clearConnexion'">Log out</button>
				<p>Bienvenue <s:property value="#session.customerConnected.getUsername()"/></p>
				<button onclick="window.location.href='/spring/listProjetAction'">Voir les teams</button>
				<button onclick="window.location.href='/spring/listProjetAction'">Voir les projets</button>
			</div>
		</div>
	</div>
</div>

</s:if>
