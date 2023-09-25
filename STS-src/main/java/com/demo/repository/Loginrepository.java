package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Login;

@Repository
public interface Loginrepository extends JpaRepository<Login,String>
{

}
