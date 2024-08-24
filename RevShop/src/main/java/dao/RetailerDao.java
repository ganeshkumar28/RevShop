package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entity.Order;
import entity.Product;
import utilty.DatabaseConnection;

public class RetailerDao implements RetailerDaoInterface {

	@Override
	public int registerSellerDao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> manageInventoryAndProductsDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addProductDao(Product product) {
		// TODO Auto-generated method stub
		int i =0;
		try {
			System.out.println(product.getName());
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into product(Name,Price,Category,Description) values(?,?,?,?)");
			ps.setString(1, product.getName());
			ps.setLong(2, product.getPrice());
			ps.setString(3, product.getCategory());
			ps.setString(4,product.getDescription());
			
			i = ps.executeUpdate();
			
			//return i;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Order> viewPlacedOrdersDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String discountsDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> graphicalDashboardDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationReviewSubmitDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> manageInventoryLowStockDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
