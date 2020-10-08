package com.hsbc.retail.models;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component

public class Product {
	
	private long productId;
	private String name;
	private LocalDate dop;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) throws Exception {
		if(productId<0)
			throw new Exception("Negative Number Not allowed");
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	

}
