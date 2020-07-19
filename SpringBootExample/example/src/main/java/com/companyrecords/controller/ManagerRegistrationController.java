package com.companyrecords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.companyrecords.model.Manager;
import com.companyrecords.service.ManagerRegistrationService;

@RestController
public class ManagerRegistrationController 
{
	@Autowired
	private ManagerRegistrationService managerservice;
	
	
	@PostMapping("/registermanager")
	public Manager registerManager(@RequestBody Manager manager) throws Exception
	{
		String tempEmail = manager.getEmail();
		if(tempEmail != null && !"".equals(tempEmail))
		{
			Manager managerObj = managerservice.fetchManagerByEmail(tempEmail);
			if(managerObj != null)
			{
				throw new Exception("manager with" +tempEmail+ "is already exists");
			}
		}
		Manager mangerObj=null;
		mangerObj=managerservice.saveManager(manager);
		return mangerObj;
	}
	
	@PostMapping("/login")
	public Manager loginManager(@RequestBody Manager manager) throws Exception
	{
		String tempEmail = manager.getEmail();
		String tempPass = manager.getPassword();
		Manager managerObj = null;
		if(tempEmail !=null && tempPass !=null)
		{
			managerObj=managerservice.fetchManagerByEmailAndPassword(tempEmail, tempPass);
		}
		if(managerObj == null)
		{
			throw new Exception("Bad credentials");
		}
		return managerObj;
	}
}
