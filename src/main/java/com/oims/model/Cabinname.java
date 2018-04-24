package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cabinname database table.
 * 
 */
@Entity
@NamedQuery(name="Cabinname.findAll", query="SELECT c FROM Cabinname c")
public class Cabinname implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cabinnameid;
	private String image;
	private String name;
	private String uniqueid;
	private Capacity capacity;

	public Cabinname() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCabinnameid() {
		return this.cabinnameid;
	}

	public void setCabinnameid(int cabinnameid) {
		this.cabinnameid = cabinnameid;
	}


	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}


	//bi-directional many-to-one association to Capacity
	@ManyToOne
	@JoinColumn(name="capacityid")
	public Capacity getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

}