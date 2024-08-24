package service;

import java.util.List;

import entity.Buyer;
import entity.Complaints;
import entity.Retailer;

public interface AdminServiceInterface {
	List<Buyer>viewUsers(String string);
	List<Retailer>viewRetailer(String string);
	List<Buyer>manageUsers();
	List<Retailer>manageRetailer();
	List<Complaints>viewComplaints();
	List<Retailer>viewRegistrationRequests();
}
