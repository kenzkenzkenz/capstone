package com.kenzie.capstoneproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kenzie.capstoneproject.model.Address;
import com.kenzie.capstoneproject.repo.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository repo;

	public List<Address> listAllAddress() {
		return repo.findAll();

	}
	public void createAddress(Address address) {
		repo.save(address);
	}
	
	public Optional<Address> getAddressById(Integer id) {
		return repo.findById(id);
	}
	
	public void deleteAddress(Integer id) {
		repo.deleteById(id);
	}
	
	public void updateAddress(Address address, Integer id) {
		address.setStreet(address.getStreet());
		address.setCity(address.getCity());
		address.setState(address.getState());
		address.setZip(address.getZip());
		address.setCountry(address.getCountry());
		address.setIsShipping(address.getIsShipping());
		address.setIsBilling(address.getIsBilling());
		address.setPhoneNumber(address.getPhoneNumber());
		address.setUser(address.getUser());
		address.setAddressId(id);
		repo.saveAndFlush(address);
	}

}
