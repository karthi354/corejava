package in.karthikeyan.firstproject.model;
import java.time.LocalDate;

public class Task {
	
	String taskName;
	int id;	
	LocalDate dueDate;
	boolean isActive = true;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate2) {
		this.dueDate = dueDate2;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", dueDate=" + dueDate + ", isActive=" + isActive + "]";
	}
}
