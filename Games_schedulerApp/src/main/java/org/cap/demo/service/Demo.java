package org.cap.demo.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.cap.demo.model.Product;
import org.cap.demo.model.User;
import org.cap.demo.model.UserType;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	LocalDate d1 = LocalDate.of(2012, 11, 23);
	//	System.out.println(Period.between(d1, LocalDate.now()).getYears());
		
		IRetailsService retailsService = new RetailsServiceImpl();
	
		User user=new User("Tom", "Jack", "North Avenue", "9999966666", UserType.EMPLOYEE, LocalDate.now());
		
		
		List<Product> products=new ArrayList<>();
		products.add(new Product(1, "Lenova", "Laptop", 2, 20000));
		products.add(new Product(1, "hp", "Printer", 3, 10000));
		
		double amountpayable=retailsService.findBillAmount(user, products);
		System.out.println("$"+amountpayable);
	}

}
