
public class GeneralEmployee extends Person
{													// also extends person class
	private String dob;								// has person variables/methods 
	private String salary;							// as well as specific variables/ getters&setters
	private String jobTitle;
	
	public GeneralEmployee() 
	{
		
	}
	
	public GeneralEmployee(String firstname, String surname, String email, String mobile, String dob, String salary, String jobTitle)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
}
