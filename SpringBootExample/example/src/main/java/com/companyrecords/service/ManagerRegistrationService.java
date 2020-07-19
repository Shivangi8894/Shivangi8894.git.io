package com.companyrecords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyrecords.model.Manager;
import com.companyrecords.repository.ManagerRegistrationRepository;

@Service
public class ManagerRegistrationService 
{
	@Autowired
	private ManagerRegistrationRepository managerrepo;
	
	public Manager saveManager(Manager manager)
	{
		return managerrepo.save(manager);
	}
	
	public Manager fetchManagerByEmail(String emailId)
	{
		return managerrepo.findByEmail(emailId);
	}
	
	public Manager fetchManagerByEmailAndPassword(String emailId, String password)
	{
		return managerrepo.findByEmailAndPassword(emailId, password);
	}
}
