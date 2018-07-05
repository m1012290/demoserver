package com.hitachi.frm.api.service;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitachi.frm.api.model.TransactionDetail;
import com.hitachi.frm.api.repository.TransactionRepository;

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService {
	
	private TransactionRepository transactionRepository;

	@Autowired
	public TransactionDetailServiceImpl(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	public List<TransactionDetail> getTransactions() {
		Iterator<TransactionDetail> trandetails = transactionRepository.findAll().iterator();
		return IteratorUtils.toList(trandetails);
	}
}
