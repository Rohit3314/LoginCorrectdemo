package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository
public interface Custrepository extends JpaRepository<Customer,Integer>
{

}
