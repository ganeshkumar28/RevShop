package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;

/**
 * Servlet implementation class BuyerServlet
 */
public class BuyerServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String taskType = request.getParameter("taskType");
		if(taskType.equals("addProduct")) {
			
		}
		if(taskType.equals("browserProducts")) {
					
				}
		if(taskType.equals("viewProduct")) {
		
			
		}
		if(taskType.equals("removeProduct")) {
			
		}
		if(taskType.equals("checkout")) {
			
		}
		if(taskType.equals("getEmailNotifiy")) {
			
		}
		if(taskType.equals("orderHistory")) {
			
		}
		if(taskType.equals("rateAndReview")) {
			
		}
		if(taskType.equals("complaint")) {
			
		}
		if(taskType.equals("returnProduct")) {
			
		}
		if(taskType.equals("saveProductFavorite")) {
			
		}
		if(taskType.equals("generateInvoice")) {
			
		}
		if(taskType.equals("makePayment")) {
			
		}

	}

}
