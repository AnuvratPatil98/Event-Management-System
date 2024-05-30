package ems.services;

import java.util.List;

import ems.entities.Order;
import ems.entities.OrderDetails;

public interface OrderdetailService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Order order);
}
