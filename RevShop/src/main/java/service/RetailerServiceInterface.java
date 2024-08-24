package service;

import java.util.List;

import entity.Order;
import entity.Product;

public interface RetailerServiceInterface {
	int registerSeller();
	List<Product> manageInventoryAndProducts();
	int addProduct(Product product);
	List<Order> viewPlacedOrders();
	String discounts();
	List<Product>graphicalDashboard();
	String getNotificationReviewSubmit();
	List<Product>manageInventoryLowStock();
}
