package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import HRMS.hrms.entities.abstracts.User;



@Entity
@Table(name="employees")
public class Employees extends User{
	

	public Employees(int id, String email, String password) {
		super(id, email, password);
		// TODO Auto-generated constructor stub
	}

	@Column(name="first_name")
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="last_name")
	private String lastName;

	

}
