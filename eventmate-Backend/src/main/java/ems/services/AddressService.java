package ems.services;

import ems.entities.Address;

public interface AddressService {
	Address saveAddress(Address address);
	Address findAddress(int id);
}
