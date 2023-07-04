package in.karthikeyan.firstproject.service;

import in.karthikeyan.firstproject.model.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Validation.TaskValidator;
import in.karthikeyan.firstproject.dao.TaskDAO;

public class TaskService {
	public void create(Task newTask) throws Exception {
		TaskValidator.validate(newTask);

		TaskDAO taskObj = new TaskDAO();
		taskObj.create(newTask);
	}
	
	public LocalDate convertDate(String dueDate) {
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				LocalDate currDate = LocalDate.parse(dueDate , formatter);
				return currDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
	
	public Task[] getAll() {
		TaskDAO taskObj = new TaskDAO();
		Task[] taskArray = taskObj.findAll();
		
		for(int i=0;i<taskArray.length;i++) {
			System.out.println(taskArray[i]);
			
		}
		return taskArray;
	}
}
