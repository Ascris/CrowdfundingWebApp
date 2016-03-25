package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import dto.CustomerDTO;

public class MySessionAction {
	
	public static void clear(){
		Map currentSession =  ActionContext.getContext().getSession();
		currentSession.clear();
	}
	
	public static CustomerDTO getUser(){
		Map currentSession =  ActionContext.getContext().getSession();
		CustomerDTO customer=(CustomerDTO) currentSession.get("customerConnected");
		return customer;
	}
	
	public static void putUser(CustomerDTO customer){
		Map currentSession =  ActionContext.getContext().getSession();
		currentSession.put("customerConnected",customer);
	}

}
