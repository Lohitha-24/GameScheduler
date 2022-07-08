package org.cap.demo.service;

import java.util.List;

import org.cap.demo.model.Product;
import org.cap.demo.model.User;

public interface IRetailsService {

	public double findBillAmount(User user, List<Product> products);
	
}
