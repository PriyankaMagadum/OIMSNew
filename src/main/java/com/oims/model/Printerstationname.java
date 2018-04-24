package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the printerstationname database table.
 * 
 */
@Entity
@NamedQuery(name="Printerstationname.findAll", query="SELECT p FROM Printerstationname p")
public class Printerstationname implements Serializable {
	private static final long serialVersionUID = 1L;
	private int printerstationnameid;
	private String image;
	private String name;
	private String uniqueid;
	private Capacity capacity;

	public Printerstationname() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPrinterstationnameid() {
		return this.printerstationnameid;
	}

	public void setPrinterstationnameid(int printerstationnameid) {
		this.printerstationnameid = printerstationnameid;
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