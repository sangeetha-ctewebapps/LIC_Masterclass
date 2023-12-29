package com.lic.epgs.mst.usermgmt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

@Entity
@Table(name = "UO_Admin")
public class UOAdminEntity implements Serializable {

	private static final long serialVersionUID = 9002969091803857265L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UO_ADMIN_ID")
	private Long uoAdminId;

	@Column(name = "LOCATION_TYPE")
	private String locationType;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "LOCATION_CODE")
	private String locationCode;

	@NotNull
	@Column(name = "MASTER_USER_ID")
	private Long masterUserId;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	//@UpdateTimestamp
	@Column(name = "MODIFIED_ON")
	private Date modifiedOn;

	@NotBlank
	@CreatedBy
	@Column(name = "CREATED_BY")
	private String createdBy;

	@CreationTimestamp
	@Column(name = "CREATED_ON")
	private Date createdOn;

	@NotNull
	@Column(name = "IS_ACTIVE")
	private String isActive;

	@NotNull
	@Column(name = "IS_DELETED")
	private String isDeleted;

	public Long getUoAdminId() {
		return uoAdminId;
	}

	public void setUoAdminId(Long uoAdminId) {
		this.uoAdminId = uoAdminId;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public Long getMasterUserId() {
		return masterUserId;
	}

	public void setMasterUserId(Long masterUserId) {
		this.masterUserId = masterUserId;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UOAdminEntity() {

	}

	public UOAdminEntity(Long uoAdminId, String locationType, String location, String locationCode, Long masterUserId,
			String modifiedBy, Date modifiedOn, String createdBy, Date createdOn, String isActive, String isDeleted) {
		super();
		this.uoAdminId = uoAdminId;
		this.locationType = locationType;
		this.location = location;
		this.locationCode = locationCode;
		this.masterUserId = masterUserId;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "UOAdminEntity [uoAdminId=" + uoAdminId + ", locationType=" + locationType + ", location=" + location
				+ ", locationCode=" + locationCode + ", masterUserId=" + masterUserId + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", isActive="
				+ isActive + ", isDeleted=" + isDeleted + "]";
	}

}