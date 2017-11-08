package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderedController {
	
	@RequestMapping("/orderedNameInput")
	public String  handleInput() {
		return "orderedNameInput";
	}


	@RequestMapping("/orderedNameOutput")
	public String handleOutput(HttpServletRequest request) {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String middle = request.getParameter("middleinitial");
		String order = request.getParameter("order");
		
		if(order.equals("fml")) {
			request.setAttribute("orderedName", firstName + " " + middle +" " + lastName);	
		} else if(order.equals("fl")) {
			request.setAttribute("orderedName", firstName + " " + lastName);
		} else if(order.equals("lfm")) {
			request.setAttribute("orderedName", lastName + " " + firstName + " " + middle);
		} else if(order.equals("lf")) {
			request.setAttribute("orderedName", lastName + " " + firstName);
		}
		return "OrderedNameOutput";
	}
}
