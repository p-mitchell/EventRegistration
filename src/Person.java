import java.util.Scanner;

public abstract class Person {		// abstract person class
	protected String firstname;		// used in all three types of attendees
	protected String surname;		// contains the 4 variables common to all attendees
	protected String email;
	protected String mobile;
	Scanner scan = new Scanner(System.in);
	
	public Person()
	{					// blank default constructor
		
	}
	
	public Person(String firstname, String surname, String email, String mobile)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
	}
											// getter and setters for each of the variables
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
