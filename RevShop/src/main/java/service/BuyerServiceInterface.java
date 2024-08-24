package service;

import java.util.List;

import entity.Bill;
import entity.Order;
import entity.OrderDetails;
import entity.Product;
import entity.RateReview;

public interface BuyerServiceInterface {
	
	Product viewProduct();
	List<Product> browserProducts();
	String addProduct();
	String removeProduct();
	Bill checkout();
	String getEmailNotifiy();
	List<Order> orderHistory();
	RateReview rateAndReview();
	String complaint();
	String returnProduct();
	String saveProductFavorite();
	OrderDetails generateInvoice();
	String makePayment();
	
	
	
}
