package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the locationdetails database table.
 * 
 */
@Entity
@Table(name="locationdetails")
@NamedQuery(name="Locationdetail.findAll", query="SELECT l FROM Locationdetail l")
public class Locationdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private int locationdetailsid;
	private String buildingaddress1;
	private String buildingaddress2;
	private String buildingimage;
	private String buildingname;
	private String changedby;
	private Date createdate;
	private int facilitymanagermobilenumber;
	private String facilitymanagername;
	private String landmark;
	private String locationname;
	private Date modifydate;
	private byte status;
	private List<Floordetail> floordetails;
	private Location location;
	private Company company;
	private Usermanagement usermanagement;

	public Locationdetail() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getLocationdetailsid() {
		return this.locationdetailsid;
	}

	public void setLocationdetailsid(int locationdetailsid) {
		this.locationdetailsid = locationdetailsid;
	}


	public String getBuildingaddress1() {
		return this.buildingaddress1;
	}

	public void setBuildingaddress1(String buildingaddress1) {
		this.buildingaddress1 = buildingaddress1;
	}


	public String getBuildingaddress2() {
		return this.buildingaddress2;
	}

	public void setBuildingaddress2(String buildingaddress2) {
		this.buildingaddress2 = buildingaddress2;
	}


	public String getBuildingimage() {
		return this.buildingimage;
	}

	public void setBuildingimage(String buildingimage) {
		this.buildingimage = buildingimage;
	}


	public String getBuildingname() {
		return this.buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
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


	public int getFacilitymanagermobilenumber() {
		return this.facilitymanagermobilenumber;
	}

	public void setFacilitymanagermobilenumber(int facilitymanagermobilenumber) {
		this.facilitymanagermobilenumber = facilitymanagermobilenumber;
	}


	public String getFacilitymanagername() {
		return this.facilitymanagername;
	}

	public void setFacilitymanagername(String facilitymanagername) {
		this.facilitymanagername = facilitymanagername;
	}


	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getLocationname() {
		return this.locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}


	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}


	//bi-directional many-to-one association to Floordetail
	@OneToMany(mappedBy="locationdetail")
	public List<Floordetail> getFloordetails() {
		return this.floordetails;
	}

	public void setFloordetails(List<Floordetail> floordetails) {
		this.floordetails = floordetails;
	}

	public Floordetail addFloordetail(Floordetail floordetail) {
		getFloordetails().add(floordetail);
		floordetail.setLocationdetail(this);

		return floordetail;
	}

	public Floordetail removeFloordetail(Floordetail floordetail) {
		getFloordetails().remove(floordetail);
		floordetail.setLocationdetail(null);

		return floordetail;
	}


	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="city")
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}


	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="companyname")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	//bi-directional many-to-one association to Usermanagement
	@ManyToOne
	@JoinColumn(name="employeeid")
	public Usermanagement getUsermanagement() {
		return this.usermanagement;
	}

	public void setUsermanagement(Usermanagement usermanagement) {
		this.usermanagement = usermanagement;
	}

}