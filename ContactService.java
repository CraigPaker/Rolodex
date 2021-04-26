package ProjectOne;

import java.util.ArrayList;

public class ContactService {
	
	ArrayList<Contact>contacts;
	
	public ContactService() {
		
		contacts = new ArrayList<>();
		
	}
	
	//this adds contacts with a unique ID
	public boolean addContact(Contact newContact) {
		
		boolean full = false;
		
		for(Contact person : contacts) {
			if(person.getID().equalsIgnoreCase(newContact.getID())) {
				
				full = true;
				break;
			}
			
		}
		
		if(!full) {
			contacts.add(newContact);
			return true;
		}else {
			return false;
		}	
	}
	
	//delete contacts
	public boolean deleteContact(String ID) {
		
		boolean erase = false;
		
		for(Contact person : contacts) {
			if(person.getID().equalsIgnoreCase(ID)) {
				
				contacts.remove(person);
				
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	//update a contact's number
	public boolean updateNumber(String ID, String newNumber) {
		
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getID().equalsIgnoreCase(ID)) {
				
				person.setNumber(newNumber);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//Update first name
	public boolean updateFirstName(String ID, String newFirstName) {
		
		boolean update = false;
		
		for (Contact person: contacts) {
			if(person.getID().equalsIgnoreCase(ID)) {
				
				person.setFirstName(newFirstName);
				
				update = true;
				break;
			}
		}
		return update;	
	}
	
	//Update last name
	public boolean updateLastName(String ID, String newLastName) {
		
		boolean update = false;
		
		for (Contact person: contacts) {
			if(person.getID().equalsIgnoreCase(ID)) {
				
				person.setLastName(newLastName);
				
				update = true;
				break;
			}
		}	
		return update;	
	}
	
	//update address
	public boolean updateAddress(String ID, String newAddress) {
		
		boolean update = false;
		
		for(Contact person : contacts) {
			if(person.getID().equalsIgnoreCase(ID)) {
				
				person.setAddress(newAddress);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//print contacts
	public void displayAll() {
		for(Contact person : contacts) {
			System.out.println(person.toString());
		}
	}
	
}