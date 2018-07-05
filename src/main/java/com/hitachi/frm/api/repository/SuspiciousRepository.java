package com.hitachi.frm.api.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.hitachi.frm.api.model.SuspiciousTranDetail;

@Transactional
public interface SuspiciousRepository extends CrudRepository<SuspiciousTranDetail, Long> {
}
