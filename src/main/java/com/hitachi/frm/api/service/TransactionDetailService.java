package com.hitachi.frm.api.service;

import java.util.List;

import com.hitachi.frm.api.model.TransactionDetail;


public interface TransactionDetailService {
	List<TransactionDetail> getTransactions();
}