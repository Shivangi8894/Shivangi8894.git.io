package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Manager;

public interface ManagerRegistrationRepository extends JpaRepository<Manager, Integer> {

	public Manager findByEmail(String email);
	public Manager findByEmailAndPassword(String email, String password);
}
