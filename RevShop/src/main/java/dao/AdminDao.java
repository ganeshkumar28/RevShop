package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import entity.Buyer;
import entity.Complaints;
import entity.Retailer;
import utilty.DatabaseConnection;

public class AdminDao implements AdminDaoInterface {

	@Override
	public List<Buyer> viewUsersDao(String userType) {
		// TODO Auto-generated method stub
		List<Buyer> buyer_list = new ArrayList<Buyer>();
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select Name,Email,Password,Contact_Number,City from users where UserType = ?");
			ps.setString(1, userType);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String n1 = rs.getString(1);
				String n2= rs.getString(2);
				String n3 = rs.getString(3);
				String n4 = rs.getString(4);
				String n5 = rs.getString(5);
				
				Buyer buyer = new Buyer();
				
				buyer.setName(n1);
				buyer.setEmail(n2);
				buyer.setPassword(n3);
				buyer.setContact_number(n4);
				buyer.setCity(n5);
				
				buyer_list.add(buyer);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return buyer_list;
	}

	@Override
	public List<Retailer> viewRetailerDao(String userType) {
		List<Retailer> retailer_list = new ArrayList<Retailer>();
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select Name,Email,Password,Contact_Number,City from users where UserType = ?");
			ps.setString(1, userType);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String n1 = rs.getString(1);
				String n2= rs.getString(2);
				String n3 = rs.getString(3);
				String n4 = rs.getString(4);
				String n5 = rs.getString(5);
				
				Retailer retailer = new Retailer();
				
				retailer.setName(n1);
				retailer.setEmail(n2);
				retailer.setPassword(n3);
				retailer.setContact_number(n4);
				retailer.setCity(n5);
				
				retailer_list.add(retailer);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retailer_list;
	}

	@Override
	public List<Buyer> manageUsersDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> manageRetailerDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaints> viewComplaintsDao() {
		List<Complaints> complaint_list = new ArrayList<Complaints>();
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from complaints");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String n1 = rs.getString(1);
				String n2= rs.getString(2);
				String n3 = rs.getString(3);
				String n4 = rs.getString(4);
				String n5 = rs.getString(5);
				String n6 = rs.getString(6);
				
				
				Complaints complaint = new Complaints();
				
				complaint.setName(n1);
				complaint.setEmail(n2);
				complaint.setContact_no(n3);
				complaint.setUserType(n4);
				complaint.setComplaint_subject(n5);
				complaint.setComplaint_description(n6);
				
				complaint_list.add(complaint);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return complaint_list;
	}

	@Override
	public List<Retailer> viewRegistrationRequestsDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
