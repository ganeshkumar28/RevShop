package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Buyer;
import utilty.DatabaseConnection;

public class GlobalDao implements GlobalDaoInterface {

	@Override
	public int signUp(Buyer buyer) {
		// TODO Auto-generated method stub
		Connection con;
		int i =0;
		try {
			con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users values (?,?,?,?,?,?)");
			ps.setString(1, buyer.getName());
			ps.setString(2, buyer.getEmail());
			ps.setString(3, buyer.getPassword());
			ps.setString(4, buyer.getContact_number());
			ps.setString(5, buyer.getCity());
			ps.setString(6, buyer.getUserType());
			i = ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

}
