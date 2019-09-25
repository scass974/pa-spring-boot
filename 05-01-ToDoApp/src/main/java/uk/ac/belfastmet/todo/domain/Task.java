package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="task")
public class Task {
	// instance variables
	private String name;
	private String personResponsible;
	private Boolean status;
	private String priority;
	private String deadline;
	private int lengthMinutes;
	private long id;

	// getters & setters
	
	//database column
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//database column
	@Column(name = "personresponsible")
	public String getPersonResponsible() {
		return personResponsible;
	}

	public void setPersonResponsible(String personResponsible) {
		this.personResponsible = personResponsible;
	}
	//database column
	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	//database column
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	//database column
	@Column(name = "deadline")
	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	//database column
	@Column(name = "lengthminutes")
	public int getLengthMinutes() {
		return lengthMinutes;
	}

	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}
    //database primary key column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// constructors
	public Task() {
		super();
	}

	public Task(String name, String personResponsible, Boolean status, String priority, String deadline,
			int lengthMinutes) {
		super();
		this.name = name;
		this.personResponsible = personResponsible;
		this.status = status;
		this.priority = priority;
		this.deadline = deadline;
		this.lengthMinutes = lengthMinutes;
	}

	// override toString method for debug and check
	public String toString() {
		return "Name: " + name + "\n" + "Person Responsible: " + personResponsible + "\n" + "Status: " + status + "\n"
				+ "Priority: " + priority + "\n" + "Deadline: " + deadline + "\n" + "Length in Minutes: " + lengthMinutes;

	}

}
