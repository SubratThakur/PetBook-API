package com.petbook.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PT_USER")
public class User implements Serializable{

	/**
	 * Serial Version Id for User
	 */
	private static final long serialVersionUID = 8659638142752209307L;
	private long userId;
    private String emailId;
    private String Name;
    private String phoneNumber;
    private String createdBy;
    private Date createdDate=new Date();
    private String updateBy;
    private Date updatedDate;
    private boolean active=false;
 
    public User() {	
    }
    
    public User(String emailId, String name, String phoneNumber, boolean active, Date createdDate) {
		super();
		this.emailId = emailId;
		Name = name;
		this.phoneNumber = phoneNumber;
		this.active = active;
		this.createdDate = createdDate;
	}
 

	@Column(name="CREATED_BY", nullable=false)
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name="CREATED_DATE", nullable=false, updatable = false)
    public Date getCreatedDate() {
        return createdDate;
    }
 
    public void setCreatedDate(Date createdDate) {
	    	this.createdDate = createdDate;
    }
 
    @Id
    @GeneratedValue
    @Column(name="ID")
    public long getUserId() {
        return userId;
    }
 
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name="EMAIL_ID", nullable=false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name="NAME", nullable=false)
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	@Column(name="PHONE_NUMBER", nullable=false)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Column(name="IS_ACTIVE", nullable=false)
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name="UPDATED_BY", nullable=true)
	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}


	@Column(name="UPDATED_DATE", nullable=true)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
 
