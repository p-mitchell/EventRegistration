import java.util.ArrayList;
import java.util.Scanner;

public class AddAttendee {

	static ArrayList<Person> guestList = new ArrayList<>(); 		// initiate 3 different array lists
	static ArrayList<Person> contractorList = new ArrayList<>();	// one for each category of attendee
	static ArrayList<Person> employeeList = new ArrayList<>();		// set them all of type 'Person' - the common base class

	
	public static void addGuest()
	{
		Scanner scan = new Scanner(System.in);						// use scanner to read input from the user
		Guest guest = new Guest();									// instance of a guest object
		
		System.out.print("Enter a firstname: ");					// get user to enter each of the variables associated with the type of attendee
		guest.setFirstname(scan.nextLine());						// store each input in the setter for the object
		System.out.print("Enter a surname: ");
		guest.setSurname(scan.nextLine());
		System.out.print("Enter an email address: ");
		guest.setEmail(scan.nextLine());
		System.out.print("Enter a mobile number: ");
		guest.setMobile(scan.nextLine());
		System.out.print("Enter a company name: ");
		guest.setCompany(scan.nextLine());
		System.out.print("Enter a contact name: ");
		guest.setContact(scan.nextLine());	
																	// when finished all fields
		guestList.add(guest);										// add that object to the relevant array list
	}
		
	
	public static void addContractor()
	{																// same as addGuest ^^
		Scanner scan = new Scanner(System.in);
		Contractor cont = new Contractor();
		
		System.out.print("Enter a firstname: ");
		cont.setFirstname(scan.nextLine());
		System.out.print("Enter a surname: ");
		cont.setSurname(scan.nextLine());
		System.out.print("Enter an email address: ");
		cont.setEmail(scan.nextLine());
		System.out.print("Enter a mobile number: ");
		cont.setMobile(scan.nextLine());
		System.out.print("Enter a company name: ");
		cont.setCompany(scan.nextLine());
		System.out.print("Enter a contact name: ");
		cont.setContact(scan.nextLine());
		System.out.print("Enter a date of birth: ");
		cont.setDob(scan.nextLine());
		
		contractorList.add(cont);
	}
	
	
	
	public static void addEmployee()
	{																// same as addGuest ^^
		Scanner scan = new Scanner(System.in);
		GeneralEmployee emp = new GeneralEmployee();
		
		System.out.print("Enter a firstname: ");
		emp.setFirstname(scan.nextLine());
		System.out.print("Enter a surname: ");
		emp.setSurname(scan.nextLine());
		System.out.print("Enter an email address: ");
		emp.setEmail(scan.nextLine());
		System.out.print("Enter a mobile number: ");
		emp.setMobile(scan.nextLine());
		System.out.print("Enter a date of birth: ");
		emp.setDob(scan.nextLine());
		System.out.print("Enter a salary: ");
		emp.setSalary(scan.nextLine());
		System.out.print("Enter a job title: ");
		emp.setJobTitle(scan.nextLine());

		
		employeeList.add(emp);
	}
} // end addAttendee class
