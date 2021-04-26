package ProjectOne;

import java.util.ArrayList;

public class TaskService {
	
ArrayList<Task>tasks;
	
	public TaskService() {
		
		tasks = new ArrayList<>();
		
	}
	
	
	//this adds tasks with a unique ID
	public boolean addTask(Task newTask) {
			
		boolean full = false;
			
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(newTask.getID())) {
					
				full = true;
				break;
			}
				
		}
			
		if(!full) {
			tasks.add(newTask);
			return true;
		}else {
			return false;
		}	
	}
		
	//delete tasks
	public boolean deleteTask(String ID) {
			
		boolean erase = false;
			
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
					
				tasks.remove(task);
					
				erase = true;
				break;
			}
		}
		return erase;
	}
	
	
	//update name
	public boolean updateName(String ID, String newName) {
		
		boolean update = false;
		
		for(Task task : tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
				
				task.setName(newName);
				
				update = true;
				break;
			}
		}
		return update;
	}
	
	//Update description
	public boolean updateDescription(String ID, String newDescription) {
		
		boolean update = false;
		
		for (Task task: tasks) {
			if(task.getID().equalsIgnoreCase(ID)) {
				
				task.setDescription(newDescription);
				
				update = true;
				break;
			}
		}
		return update;	
	}
	
	
	
	//test verification
	//print tasks
		public void displayAll() {
			for(Task task: tasks) {
				System.out.println(task.toString());
			}
		}
	
	

}
