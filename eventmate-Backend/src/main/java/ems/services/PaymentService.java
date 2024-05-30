package ems.services;

import ems.entities.Payment;

public interface PaymentService {
	Payment savePayment(Payment payment);
	Payment findPaymentById(int id);
}
