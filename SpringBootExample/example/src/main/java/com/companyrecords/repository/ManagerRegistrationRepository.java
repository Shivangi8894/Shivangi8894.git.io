package com.companyrecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companyrecords.model.Manager;

public interface ManagerRegistrationRepository extends JpaRepository<Manager, Integer> {

	public Manager findByEmail(String email);
	public Manager findByEmailAndPassword(String email, String password);
}
