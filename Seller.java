package com.deloitte.Product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Seller {
	
	@Id
	int sellerId;
	String sellerName;
	int gstn;
	
	@ManyToMany(mappedBy="sellers")
	List<Product> products=new ArrayList<Product>();
	
public Seller() {
	// TODO Auto-generated constructor stub
}


		
	public Seller(int sellerId, String sellerName, int gstn) {
	super();
	this.sellerId = sellerId;
	this.sellerName = sellerName;
	this.gstn = gstn;
}



	public int getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public int getGstn() {
		return gstn;
	}
	
	public void setGstn(int gstn) {
		this.gstn = gstn;
	}
	
	
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", gstn=" + gstn + "]";
	}

	
	

}
