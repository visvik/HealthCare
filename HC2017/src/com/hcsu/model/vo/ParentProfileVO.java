package com.hcsu.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vishal.settipalli
 *
 */
public class ParentProfileVO {


	private Integer parentProfileId;
	
	private Integer aadharId;
	
	private String fatherName;
	
	private String motherName;
	
	private String address;
	
	private String phone;
	
	private String mobileNo;
	
	private Integer noOfChildren;
	
	private Integer anganwadiId;
	
	private Integer ashaId;
	
	public ParentProfileVO() {
		super();
	}

	public ParentProfileVO(Integer parentProfileId, Integer aadharId, String fatherName, String motherName, String address, String phone, String mobileNo, 
						   Integer noOfChildren, Integer anganwadiId, Integer ashaId) {
		super();
		this.parentProfileId = parentProfileId;
		this.aadharId = aadharId;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.phone = phone;
		this.mobileNo = mobileNo;
		this.noOfChildren = noOfChildren;
		this.anganwadiId = anganwadiId;
		this.ashaId = ashaId;
	}

	public Integer getParentProfileId() {
		return parentProfileId;
	}

	public void setParentProfileId(Integer parentProfileId) {
		this.parentProfileId = parentProfileId;
	}

	public Integer getAadharId() {
		return aadharId;
	}

	public void setAadharId(Integer aadharId) {
		this.aadharId = aadharId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(Integer noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public Integer getAnganwadiId() {
		return anganwadiId;
	}

	public void setAnganwadiId(Integer anganwadiId) {
		this.anganwadiId = anganwadiId;
	}

	public Integer getAshaId() {
		return ashaId;
	}

	public void setAshaId(Integer ashaId) {
		this.ashaId = ashaId;
	}

	@Override
	public String toString() {
		return "Parent [Parent Profile Id=" + parentProfileId + ", Father's Name=" + fatherName
				+ ", Mother's Name=" + motherName + "]";
	}

	
}
