package com.oims.model;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the capacity database table.
 * 
 */
@Entity
@NamedQuery(name="Capacity.findAll", query="SELECT c FROM Capacity c")
public class Capacity implements Serializable {
	private static final long serialVersionUID = 1L;
	private int capacityid;
	private int noofcabins;
	private int noofconferenceroom;
	private int noofdiscussionrooms;
	private int noofprinterstations;
	private int noofscannerstations;
	private int nooftrainingrooms;
	private int noofworkstations;
	private List<Cabinname> cabinnames;
	private Wingdetail wingdetail;
	private List<Conferenceroomname> conferenceroomnames;
	private List<Discussionroomname> discussionroomnames;
	private List<Printerstationname> printerstationnames;
	private List<Scannerstationname> scannerstationnames;
	private List<Trainingroomname> trainingroomnames;
	private List<Workstationname> workstationnames;

	public Capacity() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCapacityid() {
		return this.capacityid;
	}

	public void setCapacityid(int capacityid) {
		this.capacityid = capacityid;
	}


	public int getNoofcabins() {
		return this.noofcabins;
	}

	public void setNoofcabins(int noofcabins) {
		this.noofcabins = noofcabins;
	}


	public int getNoofconferenceroom() {
		return this.noofconferenceroom;
	}

	public void setNoofconferenceroom(int noofconferenceroom) {
		this.noofconferenceroom = noofconferenceroom;
	}


	public int getNoofdiscussionrooms() {
		return this.noofdiscussionrooms;
	}

	public void setNoofdiscussionrooms(int noofdiscussionrooms) {
		this.noofdiscussionrooms = noofdiscussionrooms;
	}


	public int getNoofprinterstations() {
		return this.noofprinterstations;
	}

	public void setNoofprinterstations(int noofprinterstations) {
		this.noofprinterstations = noofprinterstations;
	}


	public int getNoofscannerstations() {
		return this.noofscannerstations;
	}

	public void setNoofscannerstations(int noofscannerstations) {
		this.noofscannerstations = noofscannerstations;
	}


	public int getNooftrainingrooms() {
		return this.nooftrainingrooms;
	}

	public void setNooftrainingrooms(int nooftrainingrooms) {
		this.nooftrainingrooms = nooftrainingrooms;
	}


	public int getNoofworkstations() {
		return this.noofworkstations;
	}

	public void setNoofworkstations(int noofworkstations) {
		this.noofworkstations = noofworkstations;
	}


	//bi-directional many-to-one association to Cabinname
	@OneToMany(mappedBy="capacity")
	public List<Cabinname> getCabinnames() {
		return this.cabinnames;
	}

	public void setCabinnames(List<Cabinname> cabinnames) {
		this.cabinnames = cabinnames;
	}

	public Cabinname addCabinname(Cabinname cabinname) {
		getCabinnames().add(cabinname);
		cabinname.setCapacity(this);

		return cabinname;
	}

	public Cabinname removeCabinname(Cabinname cabinname) {
		getCabinnames().remove(cabinname);
		cabinname.setCapacity(null);

		return cabinname;
	}


	//bi-directional many-to-one association to Wingdetail
	@ManyToOne
	@JoinColumn(name="wingid")
	public Wingdetail getWingdetail() {
		return this.wingdetail;
	}

	public void setWingdetail(Wingdetail wingdetail) {
		this.wingdetail = wingdetail;
	}


	//bi-directional many-to-one association to Conferenceroomname
	@OneToMany(mappedBy="capacity")
	public List<Conferenceroomname> getConferenceroomnames() {
		return this.conferenceroomnames;
	}

	public void setConferenceroomnames(List<Conferenceroomname> conferenceroomnames) {
		this.conferenceroomnames = conferenceroomnames;
	}

	public Conferenceroomname addConferenceroomname(Conferenceroomname conferenceroomname) {
		getConferenceroomnames().add(conferenceroomname);
		conferenceroomname.setCapacity(this);

		return conferenceroomname;
	}

	public Conferenceroomname removeConferenceroomname(Conferenceroomname conferenceroomname) {
		getConferenceroomnames().remove(conferenceroomname);
		conferenceroomname.setCapacity(null);

		return conferenceroomname;
	}


	//bi-directional many-to-one association to Discussionroomname
	@OneToMany(mappedBy="capacity")
	public List<Discussionroomname> getDiscussionroomnames() {
		return this.discussionroomnames;
	}

	public void setDiscussionroomnames(List<Discussionroomname> discussionroomnames) {
		this.discussionroomnames = discussionroomnames;
	}

	public Discussionroomname addDiscussionroomname(Discussionroomname discussionroomname) {
		getDiscussionroomnames().add(discussionroomname);
		discussionroomname.setCapacity(this);

		return discussionroomname;
	}

	public Discussionroomname removeDiscussionroomname(Discussionroomname discussionroomname) {
		getDiscussionroomnames().remove(discussionroomname);
		discussionroomname.setCapacity(null);

		return discussionroomname;
	}


	//bi-directional many-to-one association to Printerstationname
	@OneToMany(mappedBy="capacity")
	public List<Printerstationname> getPrinterstationnames() {
		return this.printerstationnames;
	}

	public void setPrinterstationnames(List<Printerstationname> printerstationnames) {
		this.printerstationnames = printerstationnames;
	}

	public Printerstationname addPrinterstationname(Printerstationname printerstationname) {
		getPrinterstationnames().add(printerstationname);
		printerstationname.setCapacity(this);

		return printerstationname;
	}

	public Printerstationname removePrinterstationname(Printerstationname printerstationname) {
		getPrinterstationnames().remove(printerstationname);
		printerstationname.setCapacity(null);

		return printerstationname;
	}


	//bi-directional many-to-one association to Scannerstationname
	@OneToMany(mappedBy="capacity")
	public List<Scannerstationname> getScannerstationnames() {
		return this.scannerstationnames;
	}

	public void setScannerstationnames(List<Scannerstationname> scannerstationnames) {
		this.scannerstationnames = scannerstationnames;
	}

	public Scannerstationname addScannerstationname(Scannerstationname scannerstationname) {
		getScannerstationnames().add(scannerstationname);
		scannerstationname.setCapacity(this);

		return scannerstationname;
	}

	public Scannerstationname removeScannerstationname(Scannerstationname scannerstationname) {
		getScannerstationnames().remove(scannerstationname);
		scannerstationname.setCapacity(null);

		return scannerstationname;
	}


	//bi-directional many-to-one association to Trainingroomname
	@OneToMany(mappedBy="capacity")
	public List<Trainingroomname> getTrainingroomnames() {
		return this.trainingroomnames;
	}

	public void setTrainingroomnames(List<Trainingroomname> trainingroomnames) {
		this.trainingroomnames = trainingroomnames;
	}

	public Trainingroomname addTrainingroomname(Trainingroomname trainingroomname) {
		getTrainingroomnames().add(trainingroomname);
		trainingroomname.setCapacity(this);

		return trainingroomname;
	}

	public Trainingroomname removeTrainingroomname(Trainingroomname trainingroomname) {
		getTrainingroomnames().remove(trainingroomname);
		trainingroomname.setCapacity(null);

		return trainingroomname;
	}


	//bi-directional many-to-one association to Workstationname
	@OneToMany(mappedBy="capacity")
	public List<Workstationname> getWorkstationnames() {
		return this.workstationnames;
	}

	public void setWorkstationnames(List<Workstationname> workstationnames) {
		this.workstationnames = workstationnames;
	}

	public Workstationname addWorkstationname(Workstationname workstationname) {
		getWorkstationnames().add(workstationname);
		workstationname.setCapacity(this);

		return workstationname;
	}

	public Workstationname removeWorkstationname(Workstationname workstationname) {
		getWorkstationnames().remove(workstationname);
		workstationname.setCapacity(null);

		return workstationname;
	}

}