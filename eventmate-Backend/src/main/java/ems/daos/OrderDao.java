package ems.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.entities.Customer;
import ems.entities.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
	List<Order> findByCustomer(Customer customer);
}
