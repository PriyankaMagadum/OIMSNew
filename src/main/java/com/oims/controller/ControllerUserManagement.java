package com.oims.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.oims.service.ServiceResponse;
import com.oims.config.ResponseMessage;
import com.oims.model.Usermanagement;
import com.oims.model.dto.DtoUserManagement;

@RestController
@RequestMapping("usermanagement")
public class ControllerUserManagement {
	
	@Autowired
	private ServiceResponse serviceResponse;
	
	private RestTemplate restTemplate;
	
	
	
	
	public ControllerUserManagement() {
		super();
	}




	public ControllerUserManagement(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}




	@RequestMapping(value="importdata" , method=RequestMethod.POST)
	public ResponseMessage importdata(HttpServletRequest request,@RequestBody DtoUserManagement dtoUserManagement)
	{
	
		try {
		URL u = new URL(dtoUserManagement.getUrl());
	    URLConnection uc = u.openConnection();
	    System.out.println("content type is:"+uc.getContentType());
		}
		catch(MalformedURLException e) {
			System.out.println("Mal hai boss"+e);
		}
		catch(IOException e)
		{
			System.out.println("IO hai boss"+e);
		}
		
		ResponseMessage responsemessage=null;
		ResponseEntity<Usermanagement> getResp=restTemplate.getForEntity(dtoUserManagement.getUrl(), Usermanagement.class);
		
		if (getResp.getBody() != null) {
			responsemessage = new ResponseMessage(HttpStatus.CREATED.value(), HttpStatus.CREATED,
					serviceResponse.getMessageByShortAndIsDeleted("COMPANY_GET_ALL", false), getResp.getBody());
		} else {
			System.out.println("SORRYY.............");
			responsemessage = new ResponseMessage(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST,
					serviceResponse.getMessageByShortAndIsDeleted("COMPANY_LIST_NOT_GETTING", false));
		}

		return responsemessage;
		
	}

	
}
