
public   class Customer  implements Entity{
	 private int Id;
	 private String FirstName;
	 private String LastName;
	 private int DateOfBirth;
	 private String NationalityId;
	 
	 Customer(){
		 
	 }
	 
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.Id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.DateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.NationalityId = nationalityId;
	}

}
