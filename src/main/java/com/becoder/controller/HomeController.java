package com.becoder.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.becoder.util.CommonUtil;

@RestController
public class HomeController {

	@GetMapping("/company")
	public ResponseEntity<?> getCompany() {
		List<String> company = Arrays.asList("Microsoft", "Google", "IBM", "TCS", "Wipro");
		return new ResponseEntity<>(company, HttpStatus.OK);
	}

	@GetMapping("/com")
	public ResponseEntity<?> getCompanys() {
		List<String> company = Arrays.asList("Microsoft", "Google", "IBM", "TCS", "Wipro");
		return CommonUtil.createBuildResponse(company, "success", HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getUsers() {
		List<String> company = Arrays.asList("Pavy", "Taru", "Linto", "Nairit", "Nalin");
		return CommonUtil.createBuildResponse(company, "success", HttpStatus.OK);
	}
	
	@GetMapping("/save-user")
	public ResponseEntity<?> saveUser() {
		
		try {
			// service logic
			String name="Becoder";
			name.toUpperCase();
		} catch (Exception e) {
			return CommonUtil.createBuildResponse(e.getMessage(), "failed", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return CommonUtil.createBuildResponse("saved success", "success", HttpStatus.CREATED);
	}

}
