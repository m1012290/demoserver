package com.hitachi.frm.api.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@IdClass(SuspiciousTranDetailPrimaryKey.class)
@Table(name = "suspicious_tran_detail")
public class SuspiciousTranDetail{
	
	@Id
	@Column(name = "rule_id")	
	//@Size(max = 6, message = "[ Rule Id - Value too long for type character varying(6). ]")
	private String ruleId;
	
	@Column(name = "tran_id")
	@Size(max = 30, message = "[Device Desc - Value too long for type character varying (30).]")
	private  String tranId;
	
	@Column(name = "tran_date")
	private  Timestamp tranDate;
	
	@Column(name = "device_id")	
	@Size(max = 30, message = "[ Device Id - Value too long for type character varying(30). ]")
	private String deviceId;
	
	@Column(name = "channel_id")	
	@Size(max = 10, message = "[ Channel Id - Value too long for type character varying(10). ]")
	private String channelId;
	
	@Column(name = "created_at")
	private  Timestamp createdAt;
	
	@Column(name = "updated_at")
	private  Timestamp updatedAt;
	
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
	
	public Timestamp gettranDate() {
		return tranDate;
	}

	public void settranDate(Timestamp tranDate) {
		this.tranDate = tranDate;
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
	
	public Timestamp getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getupdatedAt() {
		return updatedAt;
	}

	public void setupdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "SuspiciousTranDetail [ruleId=" + ruleId + ", tranId=" + tranId + ", tranDate=" + tranDate
				+ ", deviceId=" + deviceId + ", channelId=" + channelId + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
}