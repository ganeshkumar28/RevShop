package utilty;

import service.AdminService;
import service.AdminServiceInterface;
import service.GlobalService;
import service.GlobalServiceInterface;
import service.RetailerService;
import service.RetailerServiceInterface;
//import service.globalService;

public class ServiceFactory {

	private ServiceFactory() {};
	public static RetailerServiceInterface createObject(String st) {
		// TODO Auto-generated method stub
		RetailerServiceInterface r = null;
//		if(st.equals("global")) {
//			r = new globalService();
//		}
		
		if(st.equals("retailer")) {
		
		r = new RetailerService();
		}
		return r;
	}
	public static AdminServiceInterface createObject1(String st) {
		AdminServiceInterface a = null;
		if(st.equals("admin")) {
			a =new AdminService();
		}
		return a;
	}
	
	public static GlobalServiceInterface createObject2(String st) {
		GlobalServiceInterface g = null;
		if(st.equals("global")) {
			g = new GlobalService();
			
		}
		return g;
	}
	

}
