package com.hitachi.frm.api.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.hitachi.frm.api.model.TransactionDetail;
@Transactional
public interface TransactionRepository  extends CrudRepository<TransactionDetail, Long> {

}
