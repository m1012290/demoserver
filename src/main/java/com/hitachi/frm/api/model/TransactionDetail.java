package com.hitachi.frm.api.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@IdClass(TransactionDetailPrimaryKey.class)
@Table(name = "transaction_detail")
public class TransactionDetail{
	
	@Id
	@Column(name = "tran_id")	
	@Size(max = 30, message = "[ Tran id - Value too long for type character varying(30). ]")
	private String tranId;
	
	@Id
	@Column(name = "tran_date")	
	private Timestamp tranDate;
	
	@Column(name = "tran_amt")
	//@Size(max = 14, message = "[Tran Amt - Value too long for type number (14).]")
	private  double tranAmt;
	
	@Column(name = "acct_no")
	@Size(max = 16, message = "[ Acct No. - Value too long for type character varying(30). ]")
	private String acctNo;
	
	@Column(name = "tran_type")
	@Size(max = 20, message = "[ Tran Type - Value too long for type character varying(20). ]")
	private String tranType;
	
	@Column(name = "tran_ind")
	@Size(max = 1, message = "[ Tran Ind - Value too long for type character varying(1). ]")
	private String tranInd;
	
	@Column(name = "tran_status")
	@Size(max = 1, message = "[ Tran Ind - Value too long for type character varying(1). ]")
	private String tranStatus;
	
	@Column(name = "payee_acct")
	@Size(max = 16, message = "[ Payee Acct - Value too long for type character varying(16). ]")
	private String payeeAcct;
	
	@Column(name = "tran_remarks")
	@Size(max = 60, message = "[Tran Remarks - Value too long for type character varying(60). ]")
	private String tranRemarks;
	
	@Column(name = "inst_type")
	@Size(max = 20, message = "[Inst Type - Value too long for type character varying(20). ]")
	private String instType;
	
	@Column(name = "inst_number")
	@Size(max = 20, message = "[Inst Number - Value too long for type character varying(20). ]")
	private String instNumber;
	
	@Column(name = "inst_Date")
	private Timestamp instDate;
	
	@Column(name = "sol_id")
	@Size(max = 10, message = "[Sol Id - Value too long for type character varying(10). ]")
	private String solId;
	
	@Column(name = "device_id")
	@Size(max = 10, message = "[Device Id - Value too long for type character varying(10). ]")
	private String deviceId;
	
	@Column(name = "channel_id")
	@Size(max = 10, message = "[Channel Id - Value too long for type character varying(10). ]")
	private String channelId;
	
	@Column(name = "enter_user_id")
	@Size(max = 10, message = "[Entered User Id - Value too long for type character varying(10). ]")
	private String enterUserId;
	
	@Column(name = "posted_user_id")
	@Size(max = 10, message = "[Posted User Id - Value too long for type character varying(10). ]")
	private String postedUserId;
	
	@Column(name = "zip_code")
	@Size(max = 10, message = "[Zip Code - Value too long for type character varying(10). ]")
	private String zipCode;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "bank_id")
	@Size(max = 10, message = "[Bank Id - Value too long for type character varying(10). ]")
	private String bankId;
	
	public String gettranId() {
		return tranId;
	}

	public void settranId(String tranId) {
		this.tranId = tranId;
	}
	
	public Timestamp gettranDate() {
		return tranDate;
	}

	public void settranDate(Timestamp tranDate) {
		this.tranDate = tranDate;
	}
	
	public double gettranAmt() {
		return tranAmt;
	}

	public void settranAmt(double tranAmt) {
		this.tranAmt = tranAmt;
	}
	
	public String getacctNo() {
		return acctNo;
	}

	public void setacctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
	public String gettranType() {
		return tranType;
	}

	public void settranType(String tranType) {
		this.tranType = tranType;
	}
	
	public String gettranInd() {
		return tranType;
	}

	public void settranInd(String tranInd) {
		this.tranInd = tranInd;
	}
	
	public String gettranStatus() {
		return tranStatus;
	}

	public void settranStatus(String tranStatus) {
		this.tranStatus = tranStatus;
	}
	
	public String getpayeeAcct() {
		return payeeAcct;
	}

	public void setpayeeAcct(String payeeAcct) {
		this.payeeAcct = payeeAcct;
	}
	
	public String gettranRemarks() {
		return tranRemarks;
	}

	public void settranRemarks(String tranRemarks) {
		this.tranRemarks = tranRemarks;
	}
	
	public String getinstType() {
		return tranRemarks;
	}

	public void setinstType(String instType) {
		this.instType = instType;
	}
	
	public String getinstNumber() {
		return instNumber;
	}

	public void setinstNumber(String instNumber) {
		this.instNumber = instNumber;
	}
	
	public Timestamp getinstDate() {
		return instDate;
	}

	public void setinstDate(Timestamp instDate) {
		this.instDate = instDate;
	}
	
	public String getsolId() {
		return solId;
	}

	public void setsolId(String solId) {
		this.solId = solId;
	}
	
	public String getdeviceId() {
		return deviceId;
	}

	public void setdeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getchannelId() {
		return channelId;
	}

	public void setchannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getenterUserId() {
		return enterUserId;
	}

	public void setenterUserId(String enterUserId) {
		this.enterUserId = enterUserId;
	}
	
	public String getpostedUserId() {
		return postedUserId;
	}

	public void setpostedUserId(String postedUserId) {
		this.postedUserId = postedUserId;
	}
	
	public String getzipCode() {
		return zipCode;
	}

	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Timestamp getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getbankId() {
		return bankId;
	}

	public void setbankId(String bankId) {
		this.bankId = bankId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TransactionDetail [tranId=" + tranId + ", tranDate=" + tranDate + ", tranAmt=" + tranAmt + ", acctNo="
				+ acctNo + ", tranType=" + tranType + ", tranInd=" + tranInd + ", tranStatus=" + tranStatus
				+ ", payeeAcct=" + payeeAcct + ", tranRemarks=" + tranRemarks + ", instType=" + instType
				+ ", instNumber=" + instNumber + ", instDate=" + instDate + ", solId=" + solId + ", deviceId="
				+ deviceId + ", channelId=" + channelId + ", enterUserId=" + enterUserId + ", postedUserId="
				+ postedUserId + ", zipCode=" + zipCode + ", createdAt=" + createdAt + ", bankId=" + bankId + "]";
	}
	
}