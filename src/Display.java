import java.util.ArrayList;

public class Display {
	public static void displayAttendee(ArrayList<Person> personList)		// method to display the names of the attendees to the event
	{																		
		for (Person details : personList) 									// a 'foreach' loop for each attendee in the array list 
		{																	// display firstname & surname
			System.out.println(((Person)details).getFirstname() + " " + ((Person)details).getSurname());	// set to type 'person' so it can be used with each arraylist
		} // end for each
	} // end displayContractor 
}
