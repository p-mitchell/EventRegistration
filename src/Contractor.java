
public class Contractor extends Person
{
	private String company;	// variables specific to Contractor
	private String contact;	// chose not to inherit from 'Guest' class to avoid tight coupling
	private String dob;		// extends from person so has 4 basics

	
	public Contractor() 
	{
		
	}
	
	public Contractor(String firstname, String surname, String email, String mobile, String company, String contact, String dob)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
		this.company = company;
		this.contact = contact;
		this.dob = dob;
	}
	
	public String getCompany() 
	{
		return company;
	} // end getCompany

	public void setCompany(String company) 
	{
		this.company = company;
	} // end setCompany

	
	public String getContact() 
	{
		return contact;
	} // end getMobile

	public void setContact(String contact) 
	{
		this.contact = contact;
	} // end setMobile

	
	public String getDob() 
	{
		return dob;
	} // end getDob

	public void setDob(String dob) 
	{
		this.dob = dob;
	} // end setDob
	

	
	
}