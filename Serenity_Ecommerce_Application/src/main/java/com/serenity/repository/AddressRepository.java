package com.serenity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serenity.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
