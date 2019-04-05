package com.hibernate.hibernateproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// code for spring
@Controller
public class Login
{
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("Employee") Employee e,HttpServletRequest req, HttpServletResponse res) 
	{
		System.out.println("called");
		Client c = new Client();
		c.save1(e);
		return new ModelAndView("index","message","success");
		
	}
	
	
	
	
/* servlet
 * public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Called..");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		String name = request.getParameter("name");
		Client c = new Client();
		c.save1(id,name);
		pw.print("success");
		
	}
*/
}
