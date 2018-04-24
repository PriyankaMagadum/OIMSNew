package com.oims.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oims.config.ResponseMessage;
import com.oims.model.dto.Dtocompany;

@RestController
@RequestMapping("/company")
public class companyController {
	
	@RequestMapping(value="/saveOrUpdate")
	public ResponseMessage saveOrUpdatecompany(HttpServletRequest request,@RequestBody Dtocompany dtoCompany) {
		
		return null;
	}

}
