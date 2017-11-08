package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class ColorNameController {

	
		@RequestMapping("/nameOutput")
		public String handleOutput(HttpServletRequest request) {
			String firstName = request.getParameter("firstname");
			String lastName = request.getParameter("lastname");
			String order = request.getParameter("order");
			
			request.setAttribute("fullName", firstName + " " + lastName);
			
			if(order.equals("red")) {
				request.setAttribute("colorName", "red");
			} else if(order.equals("blue")){
				request.setAttribute("colorName", "blue");
			}if(order.equals("green")){
			request.setAttribute("colorName", "green");
			}
			return "nameOutput";
		}
	
		
		@RequestMapping ("/nameInput")
		public String handleInput(HttpServletRequest request) {
			String colorChoice = request.getParameter("colorChoice");
			String name = request.getParameter("name");
			
			return "nameInput";
 	}
	
	
}
