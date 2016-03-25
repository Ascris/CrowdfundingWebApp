package action;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import dto.CustomerDTO;

@Controller
@SessionAttributes("user")
public class ConnexionAction {
	
	@Autowired
	
	@RequestMapping(value = "/connexion", method = RequestMethod.GET)
	public ModelAndView connectAction()throws IOException{
		return new ModelAndView("Home/connexion", "user-entity", new CustomerDTO());
	}
	
	@RequestMapping(value = "/deconnexion")
	public String deconnexion(SessionStatus status) throws IOException {
		status.setComplete();
		return "redirect:/";
	} 
	
	

}
