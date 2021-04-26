package ProjectOne;
public class Main {
	
	public static void main(String[] args) {
		
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Task/TaskService Test
		/////////////////////////////////////////////////////////////////////////////
		
				//generate contact service
				ContactService contactService = new ContactService();
				
				//Test contacts
				Contact A = new Contact("A", "Paul", "Bunion", "456789132", "Midway, Pacific Isles");
				Contact B = new Contact("B", "Sara", "Blanch", "000000000", "Miwakey, AZ");
				
				//Test adding contacts
				if(contactService.addContact(A)) {
					
					System.out.println("\nadded");
					
				}else {
					
					System.out.println("\nfailure to add contact");
				}
				
				if(contactService.addContact(B)) {
					
					System.out.println("\nadded");
					
				}else {
					
					System.out.println("\nfailure to add contact");
				}
				
				//Test re-adding contacts
				if(contactService.addContact(A)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add contact");
				}
				
				
				//print all contacts
				contactService.displayAll();
				
				
				//test deleting a contact
				
				contactService.deleteContact("A");
				if(contactService.deleteContact("A")) {
					
					System.out.println("\ndeleted");
					
				}else {
					
					System.out.println("\nalready deleted");
					
				}
				
				//test updating info
				contactService.updateFirstName("B", "Milk");
				contactService.updateLastName("B", "Toast");
				contactService.updateNumber("B", "123456789");
				contactService.updateFirstName("B", "Greenwood, MA");
				
				//test results
				contactService.displayAll();
		
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Task/TaskService Test
		/////////////////////////////////////////////////////////////////////////////
		
				//generate task service
				TaskService TaskService = new TaskService();
						
				//Test tasks
				Task C = new Task("C", "Paul", "Bunion 456789132 Midway Pacific Isles");
				Task D = new Task("D", "Sara", "Blanch 000000000 Miwakey AZ");
				
				//Test adding tasks
				if(TaskService.addTask(C)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add task");
				}
						
				if(TaskService.addTask(D)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add task");
				}
						
				//Test re-adding tasks
				if(TaskService.addTask(C)) {
									
					System.out.println("\nadded");
									
				}else {
									
					System.out.println("\nfailure to add task");
				}
						
						
				//print all tasks
				TaskService.displayAll();
						
						
				//test deleting a task
						
				TaskService.deleteTask("C");
				if(TaskService.deleteTask("C")) {
							
					System.out.println("\ndeleted");
							
				}else {
							
					System.out.println("\nalready deleted");
							
				}
						
				//test updating name
				TaskService.updateName("D", "Milk");
				
				//test updating description
				TaskService.updateDescription("D", "Toast with rye bread");
				
				//print all tasks
				TaskService.displayAll();
				
				
		
		//////////////////////////////////////////////////////////////////////////////
				//The following is the Appointment/AppointmentService Test
		/////////////////////////////////////////////////////////////////////////////
		
				//generate appointment service
				AppointmentService AppointmentService = new AppointmentService();
						
				//Test tasks
				Appointment E = new Appointment("E", "2020-01-01", "Bunion 456789132 Midway Pacific Isles");
				Appointment F = new Appointment("F", "2022-02-02", "Blanch 000000000 Miwakey AZ");
				
				//Test adding tasks
				if(AppointmentService.addAppointment(E)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add appointment");
				}
						
				if(AppointmentService.addAppointment(F)) {
							
					System.out.println("\nadded");
							
				}else {
							
					System.out.println("\nfailure to add appointment");
				}
						
				//Test re-adding appointments
				if(AppointmentService.addAppointment(E)) {
									
					System.out.println("\nadded");
									
				}else {
									
					System.out.println("\nfailure to add appointment");
				}
						
						
				//print all appointments
				AppointmentService.displayAll();
						
						
				//test deleting an appointment
				AppointmentService.deleteAppointment("E");
				if(AppointmentService.deleteAppointment("E")) {
							
					System.out.println("\ndeleted");
							
				}else {
							
					System.out.println("\nalready deleted");
							
				}

				
				//print all appointments
				AppointmentService.displayAll();
		

	}
}
