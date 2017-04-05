
public class Guest extends Person			// guest extends the person class,
{											// has the 4 base variables
	private String company;					// as well as specified variables
	private String contact;

	
	public Guest()
	{							// blank default constructor
	
	} 
	
	public Guest(String firstname, String surname, String email, String mobile, String company, String contact)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
		this.company = company;
		this.contact = contact;
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
	
	
}
