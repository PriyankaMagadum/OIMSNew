package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	private int companyid;
	private String address1;
	private String address2;
	private int cellnumber;
	private String changedby;
	private String city;
	private String companygstnumber;
	private String companyidentificationnumber;
	private String companylogo;
	private String companyname;
	private String companypancardnumber;
	private String companyservicetaxnumber;
	private short companytype;
	private String companywebsite;
	private String country;
	private Date createdate;
	private String emailid;
	private int faxnumber;
	private String managingdirectorname;
	private Date modifydate;
	private int pincode;
	private String state;
	private byte status;
	private int telephonenumber1;
	private int telephonenumber2;
	private int yearincorporated;
	private List<Locationdetail> locationdetails;

	public Company() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}


	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public int getCellnumber() {
		return this.cellnumber;
	}

	public void setCellnumber(int cellnumber) {
		this.cellnumber = cellnumber;
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


	public String getCompanygstnumber() {
		return this.companygstnumber;
	}

	public void setCompanygstnumber(String companygstnumber) {
		this.companygstnumber = companygstnumber;
	}


	public String getCompanyidentificationnumber() {
		return this.companyidentificationnumber;
	}

	public void setCompanyidentificationnumber(String companyidentificationnumber) {
		this.companyidentificationnumber = companyidentificationnumber;
	}


	public String getCompanylogo() {
		return this.companylogo;
	}

	public void setCompanylogo(String companylogo) {
		this.companylogo = companylogo;
	}


	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getCompanypancardnumber() {
		return this.companypancardnumber;
	}

	public void setCompanypancardnumber(String companypancardnumber) {
		this.companypancardnumber = companypancardnumber;
	}


	public String getCompanyservicetaxnumber() {
		return this.companyservicetaxnumber;
	}

	public void setCompanyservicetaxnumber(String companyservicetaxnumber) {
		this.companyservicetaxnumber = companyservicetaxnumber;
	}


	public short getCompanytype() {
		return this.companytype;
	}

	public void setCompanytype(short companytype) {
		this.companytype = companytype;
	}


	public String getCompanywebsite() {
		return this.companywebsite;
	}

	public void setCompanywebsite(String companywebsite) {
		this.companywebsite = companywebsite;
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


	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public int getFaxnumber() {
		return this.faxnumber;
	}

	public void setFaxnumber(int faxnumber) {
		this.faxnumber = faxnumber;
	}


	public String getManagingdirectorname() {
		return this.managingdirectorname;
	}

	public void setManagingdirectorname(String managingdirectorname) {
		this.managingdirectorname = managingdirectorname;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}


	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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


	public int getTelephonenumber1() {
		return this.telephonenumber1;
	}

	public void setTelephonenumber1(int telephonenumber1) {
		this.telephonenumber1 = telephonenumber1;
	}


	public int getTelephonenumber2() {
		return this.telephonenumber2;
	}

	public void setTelephonenumber2(int telephonenumber2) {
		this.telephonenumber2 = telephonenumber2;
	}


	public int getYearincorporated() {
		return this.yearincorporated;
	}

	public void setYearincorporated(int yearincorporated) {
		this.yearincorporated = yearincorporated;
	}


	//bi-directional many-to-one association to Locationdetail
	@OneToMany(mappedBy="company")
	public List<Locationdetail> getLocationdetails() {
		return this.locationdetails;
	}

	public void setLocationdetails(List<Locationdetail> locationdetails) {
		this.locationdetails = locationdetails;
	}

	public Locationdetail addLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().add(locationdetail);
		locationdetail.setCompany(this);

		return locationdetail;
	}

	public Locationdetail removeLocationdetail(Locationdetail locationdetail) {
		getLocationdetails().remove(locationdetail);
		locationdetail.setCompany(null);

		return locationdetail;
	}

}