package ProjectOne;

import java.util.ArrayList;

public class AppointmentService {
	
	ArrayList<Appointment>appointments;
	
	public AppointmentService() {
		
		appointments = new ArrayList<>();
		
	}
	
	
	//this adds appointments with a unique ID
	public boolean addAppointment(Appointment newAppointment) {
			
		boolean full = false;
			
		for(Appointment appointment : appointments) {
			if(appointment.getID().equalsIgnoreCase(newAppointment.getID())) {
					
				full = true;
				break;
			}
				
		}
			
		if(!full) {
			appointments.add(newAppointment);
			return true;
		}else {
			return false;
		}	
	}
		
	//delete appointments
	public boolean deleteAppointment(String ID) {
			
		boolean erase = false;
			
		for(Appointment appointment : appointments) {
			if(appointment.getID().equalsIgnoreCase(ID)) {
					
				appointments.remove(appointment);
					
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	
	//test verification
	//print tasks
	public void displayAll() {
		for(Appointment appointment: appointments) {
				System.out.println(appointment.toString());
			}
		}

}
