package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import service.RetailerServiceInterface;
import utilty.ServiceFactory;

/**
 * Servlet implementation class RetailerServlet
 */
public class RetailerServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String taskType = request.getParameter("taskType");
		
		if(taskType.equals("registerSeller")) {
			
		}
		if(taskType.equals("manageInventory")) {
					
				}
		
		
		if(taskType.equals("addProducts")) {
			String productName = request.getParameter("pname");
			String productPrice = request.getParameter("pprice");
			String productCategory = request.getParameter("pcategory");
			String productDescription = request.getParameter("pdescription");
			
			Product product = new Product();
			product.setName(productName);
			product.setPrice(Long.parseLong(productPrice));
			product.setCategory(productCategory);
			product.setDescription(productDescription);
				
			RetailerServiceInterface retailerService = ServiceFactory.createObject("retailer");
			int i =retailerService.addProduct(product);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			
			if(i>0) {
				out.println("<p> Product added successfully </p>");
			}else {
				out.println("<p> Something went wrong... pLease try again </p>");
			}
			out.println("</body></html>");
		}
		if(taskType.equals("placedOrder")) {
			
		}
		if(taskType.equals("discounts")) {
			
		}
		if(taskType.equals("graphicalDashboard")) {
			
		}
		if(taskType.equals("getNotificationReview")) {
			
		}
		if(taskType.equals("lowStock")) {
			
		}
	}

}
