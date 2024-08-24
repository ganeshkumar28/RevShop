package dao;

import java.util.List;

import entity.Buyer;
import entity.Complaints;
import entity.Retailer;

public interface AdminDaoInterface {
	List<Buyer>viewUsersDao(String string);
	List<Retailer>viewRetailerDao(String string);
	List<Buyer>manageUsersDao();
	List<Retailer>manageRetailerDao();
	List<Complaints>viewComplaintsDao();
	List<Retailer>viewRegistrationRequestsDao();
}
