package com.deloitte.Product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.cfg.Configuration;
@Entity
public class Product {
       

      

	@Id
       int productId;
       String productName;
       int price;
	
       
       @OneToMany
       private List<Seller> sellers =new ArrayList<>();
	public Object setSellers;
	public Object setSelers;
       
       
       public Product() {
		// TODO Auto-generated constructor stub
	}
       
       
      
       public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	
	}



	public Seller getSeller() {
		return (Seller) sellers;
	}

	public void setSeller(Seller seller) {
		this.sellers = sellers;
	}

	public int getProductId() {
		return productId;
	}
	 
       public void setProductId(int productId) {
		this.productId = productId;
	}
	
       public String getProductName() {
		return productName;
	}
	
       public void setProductName(String productName) {
		this.productName = productName;
	}
	
       public float getPrice() {
		return price;
	}
	
       public void setPrice(int price) {
		this.price = price;
	
       }

       @Override
   	public String toString() {
   		return "Product [productId=" + productId + ", productName=" 
   	            + productName + ", price=" + price + ", sellers="+ sellers +";]";	
       
       }



	public Configuration getSellers() {
		// TODO Auto-generated method stub
		return null;
	}
       }