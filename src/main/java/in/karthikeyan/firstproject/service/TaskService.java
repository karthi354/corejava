package in.karthikeyan.firstproject.service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import in.karthikeyan.firstproject.dao.TaskDAO;
import in.karthikeyan.firstproject.model.Task;

public class TaskService {

	public Task[] getAll() {

		TaskDAO userDao = new TaskDAO();

		Task[] taskList = userDao.findAll();

		for (int i = 0; i < taskList.length; i++) {

			System.out.println(taskList[i]);

		}

		return taskList;
	}

	public void create(Task newTask) throws Exception {
		Validation.TaskValidator.validate(newTask);
		TaskDAO userDao = new TaskDAO();
		userDao.create(newTask);

	}

	public void update() {

		Task newTask2 = new Task();
		newTask2.setId(753);

		String userInput = "30/02/2024";
		LocalDate convertedDate = TaskService.convertToDate(userInput);
		newTask2.setDueDate(convertedDate);
		newTask2.setTaskName("Musiryl");
		newTask2.setActive(true);

		TaskDAO taskDao = new TaskDAO();
		taskDao.update(753, newTask2);

	}

	public void delete() {
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(753);
	}

	public void findById() {
		TaskDAO taskDao = new TaskDAO();
		taskDao.findById(753);
	}

	public static LocalDate convertToDate(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate localDate = LocalDate.parse(dateString, formatter);
			return localDate;
		} catch (Exception e) {
			System.out.println("Invalid date format!");
			return null;
		}
	}

}