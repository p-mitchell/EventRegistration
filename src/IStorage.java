import java.util.ArrayList;

public interface IStorage {							// interface
													// used by classes which store information
	public void createStorage();					// eg. CSV and Database
	public void addGuest(ArrayList<Person> people);	// contains methods common to both classes
	public void addContractor(ArrayList<Person> people);
	public void addEmployee(ArrayList<Person> people);

}
