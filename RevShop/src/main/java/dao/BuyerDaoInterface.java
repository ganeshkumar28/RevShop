package dao;

import java.util.List;

import entity.Bill;
import entity.Order;
import entity.OrderDetails;
import entity.Product;
import entity.RateReview;

public interface BuyerDaoInterface {
	Product viewProductDao();
	List<Product> browserProductsDao();
	String addProductDao();
	String removeProductDao();
	Bill checkoutDao();
	String getEmailNotifiyDao();
	List<Order> orderHistoryDao();
	RateReview rateAndReviewDao();
	String complaintDao();
	String returnProductDao();
	String saveProductFavoriteDao();
	OrderDetails generateInvoiceDao();
	String makePaymentDao();
}
