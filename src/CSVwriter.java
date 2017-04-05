import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CSVwriter implements IStorage { 				// to write the details from the array lists to a CSV file
	
	public void createStorage()							// create the CSV file if it does not already exist.
	{
		try
		{
			FileWriter writer = new FileWriter("attendee.csv", true);		// FileWriter and BufferedWriter
			BufferedWriter bufferedwriter = new BufferedWriter(writer);		// for writing information to the CSV file
			
			InputStream is = new FileInputStream("attendee.csv");			// Reader methods for reading from a file
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader read = new BufferedReader(isr);
			
			
			if (read.readLine() == null)						// if the CSV file is blank
			{													// print the string, separated by commas
				bufferedwriter.write("Firstname, Surname, Email, Mobile, Company, Contact, D.O.B, Salary, Job Title");
				bufferedwriter.close();
			}
			read.close();
		}
		catch (IOException e)
		{
			System.out.println("ERROR createStorage: " + e.getMessage());
			e.printStackTrace();
		}
	} // end createCSV
	
	
	public void addGuest(ArrayList<Person> people)
	 {
		 try
		 {
			FileWriter writer = new FileWriter("attendee.csv", true);	// create a writer to add to the CSV. set to 'true' to add to a new line
			BufferedWriter bufferedWriter = new BufferedWriter(writer); // buffered writer 
			 			 
			 for (Person details : people)		// 'foreach' loop for array list
			 {
				 bufferedWriter.write("\r\n"		// start on the next line
					   + details.getFirstname()		// add each bit of information separated by a comma
				 + "," + details.getSurname()
				 + "," + details.getEmail()
				 + "," + details.getMobile()
				 + "," + ((Guest) details).getCompany()
				 + "," + ((Guest) details).getContact()
				 + "," + "N/A"						// write in N/A where there should be a blank space
				 + "," + "N/A"						// for fields that do not relate to 'Guest'
				 + "," + "N/A");	 				// like job title
			 }
			 bufferedWriter.close();				// close the bufferedWriter
		 }
		 catch (Exception e)
		 {
			 System.out.println("ERROR addGuest: " + e.getMessage());
			 e.printStackTrace();
		 }
	 }
	
	public void addContractor(ArrayList<Person> people) 				// same as addGuest
	{
		try 
		{
			FileWriter writer = new FileWriter("attendee.csv", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			for (Person details : people) 
			{
			
				bufferedWriter.write("\r\n"
				      + details.getFirstname() 
				+ "," + details.getSurname() 
				+ "," + details.getEmail()
				+ "," + details.getMobile() 
				+ "," + ((Contractor) details).getCompany() 
				+ "," + ((Contractor) details).getContact() 
				+ "," + ((Contractor) details).getDob()
				+ "," + "N/A"
				+ "," + "N/A");
			}
			bufferedWriter.close();
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR addContractor: " + e.getMessage());
			e.printStackTrace();
		} // close for each loop
	}

	public void addEmployee(ArrayList<Person> people) 					// same as add guest
	{
		try 
		{
			FileWriter writer = new FileWriter("attendee.csv", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			for (Person details : people) 
			{
				bufferedWriter.write("\r\n"
					  + details.getFirstname() 
				+ "," + details.getSurname() 
				+ "," + details.getEmail()
				+ "," + details.getMobile()
				+ "," + "N/A"
				+ "," + "N/A"
				+ "," + ((GeneralEmployee) details).getDob()
				+ "," + ((GeneralEmployee) details).getSalary() 
				+ "," + ((GeneralEmployee) details).getJobTitle());
			} 
			bufferedWriter.close();
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR addEmployee: " + e.getMessage());
			e.printStackTrace();
		} 
	}

}