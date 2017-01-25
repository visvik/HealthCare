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
@Table(name="child_profile")
public class ChildProfile {


	@Id
	@Column(name="child_profile_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="childId",sequenceName="CHILD_ID",allocationSize=1000)
	private Integer childProfileId;

	@Column(name="child_name")
	private String childName;

	@Column(name="anganwadi_id")
	private Integer anganwadiId;
	
	@Column(name="asha_id")
	private Integer ashaId;
	
	@Column(name="parent_profile_id")
	private Integer parentProfileId;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="height")
	private Integer height;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="mid_arm_Circumference")
	private Integer midArmCircumference;
	
	@Column(name="measels")
	private String measels;
	
	@Column(name="MMT")
	private String mmt;
	
	@Column(name="DPT")
	private String dpt;
	
	@Column(name="Tetanus")
	private String tetanus;
	
	@Column(name="rabies")
	private String rabies;
	
	@Column(name="influenza")
	private String influenza;
	
	@Column(name="varicella")
	private String varicella;
	
	@Column(name="mmr_booster")
	private String mmrBooster;
	
	@Column(name="socio_economic_status")
	private String socioEconomicStatus;
	
	@Column(name="health_care_registration")
	private String healthCareRegistration;
	
	@Column(name="known_illness")
	private String knownIllness;
	
	public ChildProfile() {
		super();
	}

	public ChildProfile(Integer childProfileId, String childName, Integer anganwadiId, Integer ashaId, Integer parentProfileId, Integer age,
						Integer height, Integer weight, Integer midArmCircumference, String measels, String mmt, String dpt, String tetanus,
						String rabies, String influenza, String varicella, String mmrBooster, String socialEconomicStatus, String healthCareRegistration,
						String knownIllness) {
		super();
		this.childProfileId = childProfileId;
		this.childName = childName;
		this.anganwadiId = anganwadiId;
		this.ashaId = ashaId;
		this.parentProfileId = parentProfileId;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.midArmCircumference = midArmCircumference;
		this.measels = measels;
		this.mmt = mmt;
		this.dpt = dpt;
		this.tetanus = tetanus;
		this.rabies = rabies;
		this.influenza = influenza;
		this.varicella = varicella;
		this.mmrBooster = mmrBooster;
		this.socioEconomicStatus = socialEconomicStatus;
		this.healthCareRegistration = healthCareRegistration;
		this.knownIllness = knownIllness;
	}

	public Integer getChildProfileId() {
		return childProfileId;
	}

	public void setChildProfileId(Integer childProfileId) {
		this.childProfileId = childProfileId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
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

	public Integer getParentProfileId() {
		return parentProfileId;
	}

	public void setParentProfileId(Integer parentProfileId) {
		this.parentProfileId = parentProfileId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getMidArmCircumference() {
		return midArmCircumference;
	}

	public void setMidArmCircumference(Integer midArmCircumference) {
		this.midArmCircumference = midArmCircumference;
	}

	public String getMeasels() {
		return measels;
	}

	public void setMeasels(String measels) {
		this.measels = measels;
	}

	public String getMmt() {
		return mmt;
	}

	public void setMmt(String mmt) {
		this.mmt = mmt;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public String getTetanus() {
		return tetanus;
	}

	public void setTetanus(String tetanus) {
		this.tetanus = tetanus;
	}

	public String getRabies() {
		return rabies;
	}

	public void setRabies(String rabies) {
		this.rabies = rabies;
	}

	public String getInfluenza() {
		return influenza;
	}

	public void setInfluenza(String influenza) {
		this.influenza = influenza;
	}

	public String getVaricella() {
		return varicella;
	}

	public void setVaricella(String varicella) {
		this.varicella = varicella;
	}

	public String getMmrBooster() {
		return mmrBooster;
	}

	public void setMmrBooster(String mmrBooster) {
		this.mmrBooster = mmrBooster;
	}

	public String getSocioEconomicStatus() {
		return socioEconomicStatus;
	}

	public void setSocioEconomicStatus(String socioEconomicStatus) {
		this.socioEconomicStatus = socioEconomicStatus;
	}

	public String getHealthCareRegistration() {
		return healthCareRegistration;
	}

	public void setHealthCareRegistration(String healthCareRegistration) {
		this.healthCareRegistration = healthCareRegistration;
	}

	public String getKnownIllness() {
		return knownIllness;
	}

	public void setKnownIllness(String knownIllness) {
		this.knownIllness = knownIllness;
	}

	@Override
	public String toString() {
		return "Child [Child Profile Id=" + childProfileId + ", Child's Name=" + childName
				+ ", Child's Age=" + age + "]";
	}
}
