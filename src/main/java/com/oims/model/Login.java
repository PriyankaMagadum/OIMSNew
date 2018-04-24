package com.oims.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;
	private int loginid;
	private String changedby;
	private Date createdate;
	private Date modifydate;
	private String password;
	private byte status;
	private String username;

	public Login() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getLoginid() {
		return this.loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}


	public String getChangedby() {
		return this.changedby;
	}

	public void setChangedby(String changedby) {
		this.changedby = changedby;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}