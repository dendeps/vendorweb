package com.deps.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deps.vendor.entities.Vendor;
import com.deps.vendor.repos.vendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private vendorRepository repository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return (List<Vendor>) repository.findAll();
	}
	
	public vendorRepository getRepository() {
		return repository;
	}

	public void setRepository(vendorRepository repository) {
		this.repository = repository;
	}

}
