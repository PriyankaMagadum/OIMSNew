package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the floordetails database table.
 * 
 */
@Entity
@Table(name="floordetails")
@NamedQuery(name="Floordetail.findAll", query="SELECT f FROM Floordetail f")
public class Floordetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private int floorid;
	private String floordescription;
	private String floorname;
	private Locationdetail locationdetail;
	private List<Wingdetail> wingdetails;

	public Floordetail() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getFloorid() {
		return this.floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}


	public String getFloordescription() {
		return this.floordescription;
	}

	public void setFloordescription(String floordescription) {
		this.floordescription = floordescription;
	}


	public String getFloorname() {
		return this.floorname;
	}

	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}


	//bi-directional many-to-one association to Locationdetail
	@ManyToOne
	@JoinColumn(name="buildingname")
	public Locationdetail getLocationdetail() {
		return this.locationdetail;
	}

	public void setLocationdetail(Locationdetail locationdetail) {
		this.locationdetail = locationdetail;
	}


	//bi-directional many-to-one association to Wingdetail
	@OneToMany(mappedBy="floordetail")
	public List<Wingdetail> getWingdetails() {
		return this.wingdetails;
	}

	public void setWingdetails(List<Wingdetail> wingdetails) {
		this.wingdetails = wingdetails;
	}

	public Wingdetail addWingdetail(Wingdetail wingdetail) {
		getWingdetails().add(wingdetail);
		wingdetail.setFloordetail(this);

		return wingdetail;
	}

	public Wingdetail removeWingdetail(Wingdetail wingdetail) {
		getWingdetails().remove(wingdetail);
		wingdetail.setFloordetail(null);

		return wingdetail;
	}

}