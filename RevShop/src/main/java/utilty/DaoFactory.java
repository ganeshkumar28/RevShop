package utilty;

import dao.AdminDao;
import dao.AdminDaoInterface;
import dao.GlobalDao;
import dao.GlobalDaoInterface;
import dao.RetailerDao;
import dao.RetailerDaoInterface;

public class DaoFactory {
	private DaoFactory() {};
	public static RetailerDaoInterface createObject(String string) {
		// TODO Auto-generated method stub
//		if(string.equals("global")) {
//			return new GlobalDao();
//		}
		if(string.equals("Dao")) {
			return new RetailerDao();
		}
		return null;
	}
	public static AdminDaoInterface createObject1(String string) {
		AdminDaoInterface adao = null;
		if(string.equals("admin")) {
			adao = new AdminDao();
		}
		return adao;
	}
	public static GlobalDaoInterface createObject2(String string) {
		GlobalDaoInterface gdao = null;
		if(string.equals("global")) {
			gdao= new GlobalDao();
		}
		return gdao;
	}

}
