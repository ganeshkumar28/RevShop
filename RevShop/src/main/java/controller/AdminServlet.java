package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Buyer;
import entity.Complaints;
import entity.Retailer;
import utilty.ServiceFactory;
import service.AdminServiceInterface;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String taskType = request.getParameter("taskType");
		AdminServiceInterface aservice = ServiceFactory.createObject1("admin");
		if(taskType.equals("viewUsers")) {
			
//			String userType = request.getParameter("userType");
			
//			if(userType.equals("buyer")) {
				Buyer buyer = new Buyer();
				String user = "buyer"; 
				List<Buyer> list_of_buyer = aservice.viewUsers(user);
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<style>\r\n"
						+ "table, th, td {\r\n"
						+ "  border:1px solid black;padding:5px;\r\n"
						+ "}\r\n"
						+ "</style>");
				out.println("<body>");
				out.println("<table >");
				out.println("<tr>");
				out.println("<th> Name </th>");
				out.println("<th> Email </th>");
				out.println("<th> Password </th>");
				out.println("<th> Contact Number </th>");
				out.println("<th> City </th>");
				out.println("</tr>");
				for(Buyer b:list_of_buyer) {
					
					out.println("<tr>");
					out.println("<td>"+b.getName()+"</td>");
					out.println("<td>"+b.getEmail()+"</td>");
					out.println("<td>"+b.getPassword()+"</td>");
					out.println("<td>"+b.getContact_number()+"</td>");
					out.println("<td>"+b.getCity()+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</body></html>");
//			}
		}	
			
			if(taskType.equals("viewRetailer")) {
				Retailer retailer = new Retailer();
				String user = "retailer";
				List<Retailer> list_of_retailer = aservice.viewRetailer(user);
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<style>\r\n"
						+ "table, th, td {\r\n"
						+ "  border:1px solid black;padding:5px;\r\n"
						+ "}\r\n"
						+ "</style>");
				out.println("<body>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<th> Name </th>");
				out.println("<th> Email </th>");
				out.println("<th> Password </th>");
				out.println("<th> Contact Number </th>");
				out.println("<th> City </th>");
				out.println("</tr>");
				for(Retailer r:list_of_retailer) {
					
					out.println("<tr>");
					out.println("<td>"+r.getName()+"</td>");
					out.println("<td>"+r.getEmail()+"</td>");
					out.println("<td>"+r.getPassword()+"</td>");
					out.println("<td>"+r.getContact_number()+"</td>");
					out.println("<td>"+r.getCity()+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</body></html>");
			}
		
			if(taskType.equals("viewComplaints")) {
				List<Complaints> list_of_complaints = aservice.viewComplaints();
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<html>");
				out.println("<style>\r\n"
						+ "table, th, td {\r\n"
						+ "  border:1px solid black;padding:5px;\r\n"
						+ "}\r\n"
						+ "</style>");
				out.println("<body>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<th> Name </th>");
				out.println("<th> Email </th>");
				out.println("<th> UserType </th>");
				out.println("<th> Contact Number </th>");
				out.println("<th> Complaint Subject </th>");
				out.println("<th> Complaint Description </th>");
				out.println("</tr>");
				for(Complaints c:list_of_complaints) {
					
					out.println("<tr>");
					out.println("<td>"+c.getName()+"</td>");
					out.println("<td>"+c.getEmail()+"</td>");
					out.println("<td>"+c.getContact_no()+"</td>");
					out.println("<td>"+c.getUserType()+"</td>");
					out.println("<td>"+c.getComplaint_subject()+"</td>");
					out.println("<td>"+c.getComplaint_description()+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
				out.println("</body></html>");
				
			}
			
			if(taskType.equals("manageUsers")) {
				String userStatus  = request.getParameter("userStatus");
				if(userStatus.equals("blocked")) {
					
				}
			}
		
		
		
		
	}

}
