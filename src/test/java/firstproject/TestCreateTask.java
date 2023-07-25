package firstproject;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exception.ValidationException;
import in.karthikeyan.firstproject.model.Task;
import in.karthikeyan.firstproject.service.TaskService;

	 class TestCreateTask {
		@Test
		 void testCreateTaskWithValidInput() {
			TaskService taskService = new TaskService();
			
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName("Java homework");
			String date = "04/07/2023";
			LocalDate dueDate =	TaskService.convertToDate(date);
			newTask.setDueDate(dueDate);
			newTask.setActive(true);
			
			assertDoesNotThrow(()->{
				taskService.create(newTask);
			});
		}
		
		
		@Test
		 void testCreateTaskWithInvalidInput() {
			TaskService taskService = new TaskService();
			
			Exception exception = assertThrows(ValidationException.class,()->{
				taskService.create(null);
			});
			String expectedMessage = "Invalid input";
			String receivedMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(receivedMessage));
		}
		
		@Test
		 void testTaskNameWithNull() {
			TaskService taskService = new TaskService();
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName(null);
			String date = "04/07/2023";
			LocalDate dueDate =	TaskService.convertToDate(date);
			newTask.setDueDate(dueDate);
			newTask.setActive(true);
			
			Exception exception = assertThrows(ValidationException.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "taskName cannot be null or empty";
			String receivedMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(receivedMessage));
		}
		
		@Test
		 void testTaskWithEmptyString() {
			TaskService taskService = new TaskService();
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName("");

			String date = "04/07/2023";
			LocalDate dueDate =	TaskService.convertToDate(date);
			newTask.setDueDate(dueDate);
			newTask.setActive(true);
			
			Exception exception = assertThrows(ValidationException.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "taskName cannot be null or empty";
			String receivedMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(receivedMessage));
		}
		
		@Test
		 void testDueDateWithInvalidDate() {
			TaskService taskService = new TaskService();
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName("Java homework");
			String date = "04/07/2022";
			LocalDate dueDate =	TaskService.convertToDate(date);
			newTask.setDueDate(dueDate);
			newTask.setActive(true);
			
			Exception exception = assertThrows(ValidationException.class,()->{
				taskService.create(newTask);
			});
			String expectedMessage = "due date cannot be past";
			String receivedMessage = exception.getMessage();
			
			assertTrue(expectedMessage.equals(receivedMessage));
		}

}
