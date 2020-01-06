package com.deloitte.Product;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Product_seller {

	public static void main(String[]args, Object seller2) {
		SessionFactory sf=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Seller.class)
				.buildSessionFactory();
		
		
		Seller seller =new Seller(501,"ABC",201536);
		Product product=new Product(101,"Mobile",50000);
//	    Product product =new Product(101, "Samsung",5000);
//		
//		product.setSellers.add(seller);
//		product.setSelers.add(seller);

		Session ssn=sf.openSession();
				
				
       Transaction tx=ssn.beginTransaction();
       
       ssn.save(seller);
       ssn.save(product);
       tx.commit();
       ssn.close();
       
		
	}
}
