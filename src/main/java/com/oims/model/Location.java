package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	private int locationid;
	private String changedby;
	private String city;
	private String country;
	private Date createdate;
	private Date modifydate;
	private String state;
	private byte status;
	private List<Locationdetail> locationdetails;

	public Location() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getLocationid() {
		return this.locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}


	public String getChangedby() {
		return this.changedby;
	}

	public void setChangedby(String changedby) {
		this.changedby = changedby;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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


	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}


	//bi-directional many-to-one association to Locationdetail
	@OneToMany(mappedBy="location")
	public List<Locationdetail> getLocationdetails() {
		return this.locationdetails;
	}

	public void setLocationdetails(List<Locationdetail> locationdetails) {
		this.locationdetails = locationdetails;
	}

	public Locationdetail addLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().add(locationdetail);
		locationdetail.setLocation(this);

		return locationdetail;
	}

	public Locationdetail removeLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().remove(locationdetail);
		locationdetail.setLocation(null);

		return locationdetail;
	}

}