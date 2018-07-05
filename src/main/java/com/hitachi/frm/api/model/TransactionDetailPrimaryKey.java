package com.hitachi.frm.api.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

public class TransactionDetailPrimaryKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "tran_Id")
	private String tranId;

	@Column(name = "tran_date")
	private Timestamp tranDate;

	public Timestamp gettranDate() {
		return tranDate;
	}

	public void settranDate(Timestamp tranDate) {
		this.tranDate = tranDate;
	}

	public String gettranId() {
		return tranId;
	}

	public void settranId(String tranId) {
		this.tranId = tranId;
	}

	@Override
	public int hashCode() {
		return tranId.hashCode() + tranDate.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean ret = true;
		if (obj instanceof TransactionDetailPrimaryKey) {
			if (!((TransactionDetailPrimaryKey) obj).gettranId().equals(tranId)
					|| !((TransactionDetailPrimaryKey) obj).gettranDate().equals(tranDate)) {
				ret = false;
			}
		} else {
			ret = false;
		}
		return ret;
	}
}
