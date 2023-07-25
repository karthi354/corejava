package in.karthikeyan.firstproject.dao;
import in.karthikeyan.firstproject.model.Task;

public class TaskDAO {
	public Task[] findAll() {
		Task[] taskList = TaskList.ListOfTask; // collecting data from TaskList class.
		return taskList;
	}
	
	public void create(Task newTask) {
		Task[] taskList  = TaskList.ListOfTask;
		
		for(int i=0;i<taskList.length;i++) {
			if(taskList[i]!=null) {
				taskList[i] = newTask;
				break;
			}
		}
	}
	public void update(int id, Task updatedTask) {
		Task[] taskList  = TaskList.ListOfTask;
		
		for(int i=0;i<taskList.length;i++) {
			Task task = taskList[i];
			if(task==null) {
				continue;
			}
			if(task.getId() == id) {
				task.setTaskName(updatedTask.getTaskName());
				task.setDueDate(updatedTask.getDueDate());
				task.setActive(true);
				break;
			}
		}
	}
	public void delete(int id) {
		Task[] taskList  = TaskList.ListOfTask;
		
		for(int i=0;i<taskList.length;i++) {
			Task task = taskList[i];
			if(task==null) {
				continue;
			}
			if(task.getId() == id) {
				
				task.setActive(false);
				break;
			}
		}
		
	}
	public Task findById(int id) {
		Task[] taskList  = TaskList.ListOfTask;
		Task matchedTask = null;
		
		for(int i=0;i<taskList.length;i++) {
			Task task = taskList[i];
			if(task.getId() == id) {
				matchedTask = task;
				break;
			}
		}
		System.out.println("Matched task is:"+matchedTask);
		return matchedTask;
		
	}
	
}
