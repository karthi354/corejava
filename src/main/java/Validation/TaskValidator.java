package Validation;

import exception.ValidationException;
import in.karthikeyan.firstproject.model.Task;
import util.StringUtil;

public class TaskValidator {
	public static void validate(Task task) throws Exception {
		if(task==null) {
			throw new ValidationException("Invalid input");
		}
		StringUtil.rejectIfInvalidString(task.getTaskName(), "taskName");
		StringUtil.rejectIfInvalidDate(task.getDueDate(), "due date");
		
	}
}
