package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usermanagement database table.
 * 
 */
@Entity
@NamedQuery(name="Usermanagement.findAll", query="SELECT u FROM Usermanagement u")
public class Usermanagement implements Serializable {
	private static final long serialVersionUID = 1L;
	private int usermagid;
	private String changedby;
	private String city;
	private Date createdate;
	private String depaetment;
	private String email;
	private int employeeid;
	private String firstname;
	private String lastname;
	private String location;
	private String middlename;
	private int mobileno;
	private Date modeifydate;
	private String photo;
	private byte status;
	private String usermanagementcol;
	private String url;
	private List<Locationdetail> locationdetails;

	public Usermanagement() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getUsermagid() {
		return this.usermagid;
	}

	public void setUsermagid(int usermagid) {
		this.usermagid = usermagid;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}


	public String getDepaetment() {
		return this.depaetment;
	}

	public void setDepaetment(String depaetment) {
		this.depaetment = depaetment;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public int getMobileno() {
		return this.mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getModeifydate() {
		return this.modeifydate;
	}

	public void setModeifydate(Date modeifydate) {
		this.modeifydate = modeifydate;
	}


	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}


	public String getUsermanagementcol() {
		return this.usermanagementcol;
	}

	public void setUsermanagementcol(String usermanagementcol) {
		this.usermanagementcol = usermanagementcol;
	}


	//bi-directional many-to-one association to Locationdetail
	@OneToMany(mappedBy="usermanagement")
	public List<Locationdetail> getLocationdetails() {
		return this.locationdetails;
	}

	public void setLocationdetails(List<Locationdetail> locationdetails) {
		this.locationdetails = locationdetails;
	}

	public Locationdetail addLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().add(locationdetail);
		locationdetail.setUsermanagement(this);

		return locationdetail;
	}

	public Locationdetail removeLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().remove(locationdetail);
		locationdetail.setUsermanagement(null);

		return locationdetail;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	
}
