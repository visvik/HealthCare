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
@Table(name="anganwadi")
public class Anganwadi {


	@Id
	@Column(name="anganwadi_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="anganwadiId",sequenceName="ANGANWADI_ID",allocationSize=1000)
	private Integer anganwadiId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	public Anganwadi() {
		super();
	}

	public Anganwadi(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Integer getAnganwadiId() {
		return anganwadiId;
	}

	public void setAnganwadiId(Integer anganwadiId) {
		this.anganwadiId = anganwadiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Anganwadi [Anganwadi Id=" + anganwadiId + ", Name=" + name
				+ ", Address=" + address + "]";
	}

	
}
