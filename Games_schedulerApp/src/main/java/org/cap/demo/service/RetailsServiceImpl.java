package org.cap.demo.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.cap.demo.model.Product;
import org.cap.demo.model.User;
import org.cap.demo.model.UserType;

public class RetailsServiceImpl implements IRetailsService{

	@Override
	public double findBillAmount(User user, List<Product> products) {
double billAmount=0.0,discount=0.0,finalAmount=0.0;
		
		//find total amount of all products
		for(Product product:products) {
			billAmount+=(product.getQuantity()*product.getRate_per_qty());
			
		}
		
		
		//find discount
		if(user.getUserType()==UserType.EMPLOYEE)
			discount=0.30;
		else if(user.getUserType()==UserType.AFFILIATE)
			discount=0.10;
		else {
			  int years=Period.between(user.getRegistrationDate(),LocalDate.now()).getYears();
			  if(years>=2)
				  discount=0.05;
		}
		
		
		finalAmount=billAmount - (billAmount*discount);
		
		double additionl_discount=Math.round(finalAmount/100)*5;
		
		
		return finalAmount-additionl_discount;
	}

}
