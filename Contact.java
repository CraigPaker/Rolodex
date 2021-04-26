package ProjectOne;

public class Contact {
	
	private String ID;
	private String FirstName;
	private String LastName;
	private String number;
	private String address;
		
	public Contact(String ID, String FirstName, String LastName, String number, String address) {
		
		if(ID.length() <= 10 && ID != null) {
			
			this.ID = ID;
			
		}	
		
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setNumber(number);
		this.setAddress(address);
		
	}

	protected void setFirstName(String name) {
		
		if (name.length() <= 10 && name != null) {
			
			this.FirstName = name;
		}
	}
	
	 protected void setLastName(String name) {
		
		if (name.length() <= 10 && name != null) {
			
			this.LastName = name;
		}
	}
	
	 protected void setNumber(String number) {
	
		if (number.length() <= 10 && number != null) {
			
			this.number = number;
		}
	}
	
	protected void setAddress(String address) {
		
		if(address.length() <= 30 && address != null) {
			
			this.address = address;
		}
	}
	
	public String getID() {
		
		return ID;
	}
	
	public String getFirstName() {
		
		return FirstName;
	}
	
	public String getLastName() {
		
		return LastName;
	}
	
	public String getNumber() {
		
		return number;
	}
	
	public String getAddress() {
		
		return address;
	}
	
	@Override
	public String toString() {
		
		return "\nContact: " + ID + "\nFirst Name: " + FirstName + "\nLast Name: " +
		LastName + "\nNumber: " + number + "\nAddress: " + address;
	}

}
