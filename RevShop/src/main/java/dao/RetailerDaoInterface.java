package dao;

import java.util.List;

import entity.Order;
import entity.Product;

public interface RetailerDaoInterface {
	int registerSellerDao();
	List<Product> manageInventoryAndProductsDao();
	int addProductDao(Product product);
	List<Order> viewPlacedOrdersDao();
	String discountsDao();
	List<Product>graphicalDashboardDao();
	String getNotificationReviewSubmitDao();
	List<Product>manageInventoryLowStockDao();
}
