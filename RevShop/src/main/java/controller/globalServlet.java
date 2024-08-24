package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Buyer;
import service.GlobalServiceInterface;
import service.RetailerServiceInterface;
import utilty.ServiceFactory;

/**
 * Servlet implementation class globalServlet
 * HttpSession session = request.getSession();
				session.setAttribute("email", email);
				
 */
public class globalServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String taskType = request.getParameter("taskType");
		
		if(taskType.equals("Signup")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String contact_no = request.getParameter("contact_no");
			String city = request.getParameter("city");
			String userType = request.getParameter("userType");
			
			GlobalServiceInterface gservice = ServiceFactory.createObject2("global");
	
				Buyer buyer = new Buyer();
				buyer.setName(name);
				buyer.setEmail(email);
				buyer.setPassword(password);
				buyer.setContact_number(contact_no);
				buyer.setCity(city);
				buyer.setUserType(userType);
				
				int i =gservice.signUp(buyer);
				
				
				if(i>0) {
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/signup.jsp");
					rd.forward(request, response);
				}
				else {
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/signuperror.jsp");
					rd.forward(request, response);
				}
				
				
				
				
				
				
				
				

		}
	}

}
