package com.hitachi.frm.api.service;


import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitachi.frm.api.model.SuspiciousTranDetail;
import com.hitachi.frm.api.repository.SuspiciousRepository;

@Service
public class SuspiciousServiceImpl implements SuspiciousService {

    private final SuspiciousRepository suspiciousRepository;

    @Autowired
    public SuspiciousServiceImpl(SuspiciousRepository suspiciousRepository) {
        this.suspiciousRepository = suspiciousRepository;
    }

    @Override
    public List<SuspiciousTranDetail> getSuspicious() {
        Iterator<SuspiciousTranDetail> susIterator = suspiciousRepository.findAll().iterator();
        return IteratorUtils.toList(susIterator);
    }

	@Override
	public SuspiciousTranDetail createSuspiciousTran(SuspiciousTranDetail suspiciousTranDetail) {
		SuspiciousTranDetail suspiciousTran = suspiciousRepository.save(suspiciousTranDetail);
		return suspiciousTran;
	}
}
