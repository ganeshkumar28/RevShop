package service;

import dao.GlobalDaoInterface;
import entity.Buyer;
import utilty.DaoFactory;

public class GlobalService implements GlobalServiceInterface {

	@Override
	public int signUp(Buyer buyer) {
		// TODO Auto-generated method stub
		GlobalDaoInterface gdao = DaoFactory.createObject2("global");
		return gdao.signUp(buyer);
	}
		
}
