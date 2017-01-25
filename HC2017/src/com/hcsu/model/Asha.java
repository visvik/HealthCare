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
@Table(name="asha")
public class Asha {


	@Id
	@Column(name="asha_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="ashaId",sequenceName="ASHA_ID",allocationSize=1000)
	private Integer ashaId;
	
	@Column(name="coordinator_name")
	private String coordinatorName;
	
	@Column(name="coordinator_address")
	private String coordinatorAddress;
	
	@Column(name="coordinator_phone")
	private Integer coordinatorPhone;

	public Asha() {
		super();
	}

	public Asha(String coordinatorName, String coordinatorAddress, Integer coordinatorPhone ) {
		super();
		this.coordinatorName = coordinatorName;
		this.coordinatorAddress = coordinatorAddress;
		this.coordinatorPhone = coordinatorPhone;
	}


	public Integer getAshaId() {
		return ashaId;
	}

	public void setAshaId(Integer ashaId) {
		this.ashaId = ashaId;
	}

	public String getCoordinatorName() {
		return coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	public String getCoordinatorAddress() {
		return coordinatorAddress;
	}

	public void setCoordinatorAddress(String coordinatorAddress) {
		this.coordinatorAddress = coordinatorAddress;
	}

	public Integer getCoordinatorPhone() {
		return coordinatorPhone;
	}

	public void setCoordinatorPhone(Integer coordinatorPhone) {
		this.coordinatorPhone = coordinatorPhone;
	}

	@Override
	public String toString() {
		return "Asha [Asha Id=" + ashaId + ", Name=" + coordinatorName
				+ ", Address=" + coordinatorAddress + "]";
	}

	
}
