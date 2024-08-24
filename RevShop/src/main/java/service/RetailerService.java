package service;

import java.util.List;

import dao.RetailerDaoInterface;
import entity.Order;
import entity.Product;
import utilty.DaoFactory;

public class RetailerService implements RetailerServiceInterface {

	@Override
	public int registerSeller() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public List<Product> manageInventoryAndProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		RetailerDaoInterface retailerDao = DaoFactory.createObject("Dao");
		return retailerDao.addProductDao(product);
	}

	@Override
	public List<Order> viewPlacedOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String discounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> graphicalDashboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationReviewSubmit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> manageInventoryLowStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
