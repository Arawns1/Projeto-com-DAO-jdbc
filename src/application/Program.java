package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Department d1 = new Department(1, "Compras");
		System.out.println(d1);
		
		Seller s1 = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000, d1);
		System.out.println(s1);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		sellerDao.insert(s1);;
	}
}
