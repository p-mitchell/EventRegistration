import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class menu 
{								// menu class for all the selection options
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader read = new BufferedReader(isr);
	Scanner scan = new Scanner(System.in);		// initialise the scanner to read inputs
	IStorage store = new CSVwriter();

	
	public void main_menu()
	{			
		int input;	
		
		System.out.println(" ");											// main menu console display
		System.out.println("Welcome to Peter's Party Planner!");
		System.out.println("What function would you like to run? ");
		System.out.println(" ");											// print the options available to the user
		System.out.println("1. Add people to the attendees list.");
		System.out.println("2. View people already on the attendees list.");
		System.out.println("3. Exit the program.");
		System.out.println(" ");
		System.out.print("Please make your numeric selection: ");			// remind them to make a numeric selection
		
		input = scan.nextInt();												//store the input as a number to be used in the switch
		
		switch(input) 
		{																	// switch (inputed number)
		
		case 1:
			attendee_menu(); 												// if '1' run 'attendee_menu' 
			break;
		case 2:
			display_menu();													// if 2 run 'display_menu' 
			break;
		case 3:																// if 3 close program
			end();
			break;
		default:															// if neither 1 or 2. re-run the main_menu method
			System.out.println("Sorry that was an invalid entry. please try again.");
			main_menu();
		} // end of switch
	} // end of main menu
	
	public void attendee_menu()	
	{									// same as main menu,
		int input;						// use switch to get choice from user
										// run specific function depending on their selection
		System.out.println(" ");		// of What category of attendee is the person
		System.out.println("What category of attendee is the person?");
		System.out.println(" ");
		System.out.println("1.	Guest.");
		System.out.println("2.	General Employee.");
		System.out.println("3. 	Contractor.");
		System.out.println("4.	Return to Main Menu");
		System.out.println(" ");
		System.out.print("Please make your numeric selection: ");
		
		input = scan.nextInt();
		
					
			switch(input) 
			{
			case 1:
				AddAttendee.addGuest();					// static method in the AddAttendee class so they can be used throughout the program
				break;
			case 2:
				AddAttendee.addEmployee();				// one for each of the categories
				break;
			case 3:
				AddAttendee.addContractor();			
				break;
			case 4:										// user can also return to the main menu from here
				main_menu();
				break;
			default:
				System.out.println("Sorry that was an invalid entry. please try again.");
				attendee_menu();
			} // end of switch
			
			System.out.println(" ");								// after completed 'add' function
			System.out.println("Are there any more attendees? ");	// ask user if there are more attendees
			System.out.println(" ");								
			System.out.println("1. Yes.");							
			System.out.println("2. No.");
			System.out.println(" ");
			System.out.print("Please make your numeric selection: ");
			
			int reply = scan.nextInt();
			
			switch(reply)
			{
			case 1:													// if yes
				attendee_menu();									// re-run the method
				break;
			case 2:													// if no
				store.createStorage();								// add all the arraylists to storage
				store.addGuest(AddAttendee.guestList);
				store.addEmployee(AddAttendee.employeeList);
				store.addContractor(AddAttendee.contractorList);
				main_menu();
				break;
			default:
				System.out.println("Sorry that was an invalid entry. please try again.");
				main_menu();
			}
			
			
	} // end of attendee menu
	
	public void display_menu()
	{
		int input;
		
		System.out.println(" ");									// for displaying attendees
		System.out.println("What would you like to display?");		// allow the user to display each category of attendee separately
		System.out.println(" ");									// and also display all of them together
		System.out.println("1.	Display Guests.");
		System.out.println("2.	Display General Employees.");
		System.out.println("3. 	Display Contractors.");
		System.out.println("4.	Display all attendees.");;
		System.out.println("5.	Return to Main Menu");
		System.out.println(" ");
		System.out.print("Please make your numeric selection: ");
		
		input = scan.nextInt();
		
		switch(input) 
		{
		
		case 1:
			System.out.println("The Guests attending the event are: ");					// case 1: say they are guests
			Display.displayAttendee(AddAttendee.guestList);							// run 'displayAttendee' method
			display_menu();																// set to display from the 'guestList' Array list
			break;																		// so just attendees registered as guests
		case 2:
			System.out.println("The General Employees attending the event are: ");		// case 2: say they are employees
			Display.displayAttendee(AddAttendee.employeeList);						// display information
			display_menu();
			break;
		case 3: 
			System.out.println("The Contractors attending the event are: ");			// case 3: say they are contractors
			Display.displayAttendee(AddAttendee.contractorList);					// display information
			display_menu();
			break;
		case 4:
			System.out.println("All the attendees for the event are: ");				// say all attendees
			Display.displayAttendee(AddAttendee.guestList);							// display all of the array lists
			Display.displayAttendee(AddAttendee.employeeList);
			Display.displayAttendee(AddAttendee.contractorList);
			display_menu();
			break;
		case 5:																			// user can also return to the main menu
			main_menu();
			break;
		default:
			System.out.println("Sorry that was an invalid entry. please try again.");
			display_menu();
		} // end of switch
	} // end of display menu
	
	public void end()																	// exit out of the program
	{
		System.out.println("Thank you for using Peter's Party Planner!");				// print a goodbye message
		System.out.println("We hope you found it useful");
		System.out.println("GoodBye!");
	}
}
