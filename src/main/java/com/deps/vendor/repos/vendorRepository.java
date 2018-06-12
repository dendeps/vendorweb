package com.deps.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deps.vendor.entities.Vendor;

public interface vendorRepository extends JpaRepository<Vendor, Integer> {

}
