package com.hitachi.frm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hitachi.frm.api.model.TransactionDetail;
import com.hitachi.frm.api.service.TransactionDetailService;

@RestController
@RequestMapping("api")
public class TransactionDetailController {
	private TransactionDetailService transactionDetailService;
	@Autowired
	public TransactionDetailController(TransactionDetailService transactionDetailService) {
		this.transactionDetailService=transactionDetailService;
	}
	@RequestMapping(value = "/transactionDetails", method = RequestMethod.GET)
	public ResponseEntity<?> suspicious() {
		System.out.println("---suspicious Hit---");
		List<TransactionDetail> l=transactionDetailService.getTransactions();
		for (TransactionDetail TranDetail : l) {
			System.out.println("----"+TranDetail);
		}
		return new ResponseEntity<>(transactionDetailService.getTransactions(), HttpStatus.OK);
	}
}
