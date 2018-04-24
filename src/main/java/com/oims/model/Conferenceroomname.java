package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conferenceroomname database table.
 * 
 */
@Entity
@NamedQuery(name="Conferenceroomname.findAll", query="SELECT c FROM Conferenceroomname c")
public class Conferenceroomname implements Serializable {
	private static final long serialVersionUID = 1L;
	private int conferenceroomnameid;
	private String image;
	private String name;
	private String uniqueid;
	private Capacity capacity;

	public Conferenceroomname() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getConferenceroomnameid() {
		return this.conferenceroomnameid;
	}

	public void setConferenceroomnameid(int conferenceroomnameid) {
		this.conferenceroomnameid = conferenceroomnameid;
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