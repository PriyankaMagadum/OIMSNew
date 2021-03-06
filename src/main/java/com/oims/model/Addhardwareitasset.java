package com.oims.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the addhardwareitassets database table.
 * 
 */
@Entity
@Table(name="addhardwareitassets")
@NamedQuery(name="Addhardwareitasset.findAll", query="SELECT a FROM Addhardwareitasset a")
public class Addhardwareitasset implements Serializable {
	private static final long serialVersionUID = 1L;
	private int hardwareitassetsid;
	private String changedby;
	private Date createdate;
	private Date maintenanceperiod;
	private Date modifydate;
	private String shelflife;
	private byte status;

	public Addhardwareitasset() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getHardwareitassetsid() {
		return this.hardwareitassetsid;
	}

	public void setHardwareitassetsid(int hardwareitassetsid) {
		this.hardwareitassetsid = hardwareitassetsid;
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
	public Date getMaintenanceperiod() {
		return this.maintenanceperiod;
	}

	public void setMaintenanceperiod(Date maintenanceperiod) {
		this.maintenanceperiod = maintenanceperiod;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}


	public String getShelflife() {
		return this.shelflife;
	}

	public void setShelflife(String shelflife) {
		this.shelflife = shelflife;
	}


	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}