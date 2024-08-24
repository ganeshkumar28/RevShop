package service;

import java.util.List;

import entity.Buyer;
import entity.Complaints;
import entity.Retailer;
import utilty.DaoFactory;
import dao.AdminDaoInterface;

public class AdminService implements AdminServiceInterface{

	@Override
	public List<Buyer> viewUsers(String userType) {
		// TODO Auto-generated method stub
		AdminDaoInterface adminDao = DaoFactory.createObject1("admin");
		return adminDao.viewUsersDao(userType);
	}

	@Override
	public List<Retailer> viewRetailer(String userType) {
		// TODO Auto-generated method stub
		AdminDaoInterface adminDao = DaoFactory.createObject1("admin");
		return adminDao.viewRetailerDao(userType);
	}
 
	@Override
	public List<Buyer> manageUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> manageRetailer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaints> viewComplaints() {
		// TODO Auto-generated method stub
		AdminDaoInterface adminDao = DaoFactory.createObject1("admin");
		return adminDao.viewComplaintsDao();
	}

	@Override
	public List<Retailer> viewRegistrationRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
