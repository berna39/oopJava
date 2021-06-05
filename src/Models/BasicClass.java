package Models;

public class BasicClass {

	private String firstname;
	private String lastname;
	private char gender;
	private int age;
	private boolean active;
	
	public BasicClass() {
		
	}
	
	
	
	public BasicClass(String firstname, String lastname, char gender, int age, boolean active) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
		this.active = active;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}



	@Override
	public String toString() {
		return "BasicClass [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age
				+ ", active=" + active + "]";
	}
	
	
	
}
