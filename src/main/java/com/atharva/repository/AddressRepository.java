package com.atharva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atharva.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
