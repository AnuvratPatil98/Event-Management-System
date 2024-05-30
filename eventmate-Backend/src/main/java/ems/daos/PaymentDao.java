package ems.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import ems.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
