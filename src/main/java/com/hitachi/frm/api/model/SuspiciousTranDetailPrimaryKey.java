package com.hitachi.frm.api.model;

import java.io.Serializable;

import javax.persistence.Column;

public class SuspiciousTranDetailPrimaryKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "rule_id")
	private String ruleId;
	
	@Column(name = "tran_id")
	private String tranId;

	public String getruleId() {
		return ruleId;
	}

	public void setruleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String gettranId() {
		return tranId;
	}

	public void settranId(String tranId) {
		this.tranId = tranId;
	}
	@Override
	public int hashCode() {
		return ruleId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean ret = true;
		if (obj instanceof SuspiciousTranDetailPrimaryKey) {
			if (!((SuspiciousTranDetailPrimaryKey) obj).getruleId().equals(ruleId)
					|| !((SuspiciousTranDetailPrimaryKey) obj).gettranId().equals(tranId)) {
				ret = false;
			}
		} else {
			ret = false;
		}
		return ret;
	}
}
