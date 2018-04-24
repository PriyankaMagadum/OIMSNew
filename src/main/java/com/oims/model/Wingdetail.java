package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the wingdetails database table.
 * 
 */
@Entity
@Table(name="wingdetails")
@NamedQuery(name="Wingdetail.findAll", query="SELECT w FROM Wingdetail w")
public class Wingdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private int wingid;
	private String wingdescription;
	private String wingname;
	private List<Capacity> capacities;
	private Floordetail floordetail;

	public Wingdetail() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getWingid() {
		return this.wingid;
	}

	public void setWingid(int wingid) {
		this.wingid = wingid;
	}


	public String getWingdescription() {
		return this.wingdescription;
	}

	public void setWingdescription(String wingdescription) {
		this.wingdescription = wingdescription;
	}


	public String getWingname() {
		return this.wingname;
	}

	public void setWingname(String wingname) {
		this.wingname = wingname;
	}


	//bi-directional many-to-one association to Capacity
	@OneToMany(mappedBy="wingdetail")
	public List<Capacity> getCapacities() {
		return this.capacities;
	}

	public void setCapacities(List<Capacity> capacities) {
		this.capacities = capacities;
	}

	public Capacity addCapacity(Capacity capacity) {
		getCapacities().add(capacity);
		capacity.setWingdetail(this);

		return capacity;
	}

	public Capacity removeCapacity(Capacity capacity) {
		getCapacities().remove(capacity);
		capacity.setWingdetail(null);

		return capacity;
	}


	//bi-directional many-to-one association to Floordetail
	@ManyToOne
	@JoinColumn(name="floorname")
	public Floordetail getFloordetail() {
		return this.floordetail;
	}

	public void setFloordetail(Floordetail floordetail) {
		this.floordetail = floordetail;
	}

}