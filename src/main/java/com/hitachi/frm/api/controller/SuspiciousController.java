package com.hitachi.frm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hitachi.frm.api.service.SuspiciousService;

@RestController
@RequestMapping("api")
public class SuspiciousController {
	private final SuspiciousService suspiciousService;

	@Autowired
	public SuspiciousController(SuspiciousService suspiciousService) {
		this.suspiciousService = suspiciousService;
	}

	@RequestMapping(value = "/suspicious", method = RequestMethod.GET)
	public ResponseEntity<?> suspicious() {
		System.out.println("---suspicious Hit---");
		return new ResponseEntity<>(suspiciousService.getSuspicious(), HttpStatus.OK);
	}
}
