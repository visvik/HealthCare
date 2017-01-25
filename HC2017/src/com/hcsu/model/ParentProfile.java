package com.hcsu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author vishal.settipalli
 *
 */
@Entity
@Table(name="parent_profile")
public class ParentProfile {


	@Id
	@Column(name="parent_profile_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="parentId",sequenceName="PARENT_ID",allocationSize=1000)
	private Integer parentProfileId;
	
	@Column(name="aadhar_id")
	private Integer aadharId;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="no_of_children")
	private Integer noOfChildren;
	
	public ParentProfile() {
		super();
	}

	public ParentProfile(Integer parentProfileId, Integer aadharId, String fatherName, String motherName, String address, String phone, String mobileNo, Integer noOfChildren) {
		super();
		this.parentProfileId = parentProfileId;
		this.aadharId = aadharId;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.phone = phone;
		this.mobileNo = mobileNo;
		this.noOfChildren = noOfChildren;
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

	@Override
	public String toString() {
		return "Parent [Parent Profile Id=" + parentProfileId + ", Father's Name=" + fatherName
				+ ", Mother's Name=" + motherName + "]";
	}

	
}
