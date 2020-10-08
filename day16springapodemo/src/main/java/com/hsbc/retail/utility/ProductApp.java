package com.hsbc.retail.utility;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.retail.models.Product;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/hsbc/retail"
				+ "/resources/product-bean.xml");		
		Product product=(Product) ctx.getBean("product");
		product.setName("Laptop");
		try {
			product.setProductId(493659);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		product.setDop(LocalDate.of(2020, 4, 12));
		product.getName();
		product.getDop();
	}

}
