package ems.services;

import java.util.List;

import ems.entities.Customer;
import ems.entities.Order;

public interface OrderService {

	Order saveOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getCustomerOrders(Customer customer);
	Order findById(int id);
}
