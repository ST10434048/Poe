package main;

import javax.swing.*;

public class Task {

	String _taskID;

	private String _taskDescription;

	private String _dueDate;

	private User _coordinator; // Active User - the user who creates the task will be the task coordinator/manager

	int _taskStatus = -1; // default
	public String _taskName;
	int _taskNumber;
	int _taskDuration;

//	private User[] teamMembers; // a list of User objects that are responsible for this task

//	int taskPriority; // task priority - another way to organize tasks

	Task(String taskName, String description, String date, User active_user, int status, int taskNumber, int duration) {
		_taskName = taskName;
		_taskDescription = description;
		_dueDate = date;
		_taskDuration = duration;
		_coordinator = active_user;
		_taskStatus = status;
		_taskNumber = taskNumber;
	}

	enum Status {
		to_do,
		in_progress,
		complete
	}

	public static void showStatusOptions() {
		System.out.println("Please select the status of the task: ");
		for (int i = 0; i < Status.values().length; i++) {
			System.out.println(i + ")" + Status.values()[i]);
		}
	}

	public int getTaskDuration(){
		return _taskDuration;
	}
	public void setTaskDuration(int taskDuration){
		_taskDuration = taskDuration;
	}

	public String getTaskID() {
		return _taskID;
	}

	public void setTaskID(int _taskNumber, String _coordinator, String _taskName) {
		int len = _coordinator.length();
		String a = _taskName.substring(0, 2);
        String c = _coordinator.substring(len - 3, len);
		_taskID = String.format("%s:%s:%s", a, _taskNumber, c);
	}


	public String getTaskName() {
		return _taskName;
	}

	public void setTaskName(String taskName) {
		_taskName = taskName;
	}

	// allow client to see the due date of a task
	public String getDueDate() {
		return _dueDate;
	}

	// allow client to change the due date of a task
	public void setDueDate(String date) {
		this._dueDate = date;
	}

	// allow the client to see the task description
	public String getTaskDescription() {
		return this._taskDescription;
	}

	// allow the client to change the task description
	public void setTaskDescription(String description) {
		this._taskDescription = description;
	}

	// allow the client to change the task coordinator
	public void setTaskCoordinator(User coordinator) {
		this._coordinator = coordinator;
	}

	// allow the client to see the task coordinator
	public String getTaskCoordinator() {
		return this._coordinator._firstname + " " + this._coordinator.getLastName();
	}
	public String convertStatus(){
		String status = " ";
		if (getTaskStatus() == -1) {
			status = " To do";
		} else if (getTaskStatus() == 0) {
			status = "In Progress";
		} else if (getTaskStatus() == 1) {
			status = "Complete";
		}
		return status;
	}

	// Show all task-related information to the client
	public void printTask() {
		String status = " ";
		if (getTaskStatus() == -1) {
			status = " To do";
		} else if (getTaskStatus() == 0) {
			status = "In Progress";
		} else if (getTaskStatus() == 1) {
			status = "Complete";
		}
		System.out.println(
						"Task name: " + getTaskName() +
						"\nID: " + getTaskID() +
						"\nDue Date: " + getDueDate() +
						"\nPriority: " + status +
						"\nDescription: " + getTaskDescription() +
						"\nCoordinator: " + getTaskCoordinator() );
//						"\nTotal hours of all tasks: " + totalDuration());
				JOptionPane.showConfirmDialog(null, "Task status: " + getTaskStatus() + "\nDeveloper Details" + getTaskCoordinator()  + "\nTask Name: " + getTaskName() + "\nTask Description: \n" + getTaskDescription() + "\nTask ID: " + getTaskID() + "\nTask Duration: " + getTaskDuration(), "Task Details", JOptionPane.DEFAULT_OPTION);
//				moretask();
	}
	public static void moretask() {
//		int option = JOptionPane.showConfirmDialog(null, "Would you Like to add more tasks", "Add More Tasks", JOptionPane.YES_NO_OPTION);
//		//asks use if they would like to add more tasks
//		if (option == JOptionPane.YES_OPTION) {
//			TaskManager.createNewTask();
//			//returns them to add a new task.
//		} else {
			int totalDuration = totalDuration();
			JOptionPane.showMessageDialog(null, "Total duration of tasks: " + totalDuration);
			//displays the total duration of the tasks on the assumption no more tasks will be added
			TaskManager.showTaskManagerMenuItems();
			//returns to the kandban menu
//		}
	}

	public int getTaskStatus() {
		return this._taskStatus;
	}

	public void setTaskStatus(int status) {
		if (status == 0) {
			this._taskStatus = -1;
		} else if (status == 1) {
			this._taskStatus = 0;
		} else if (status == 2) {
			this._taskStatus = 1;
		} else {
			System.out.println("Not a Valid Task Status Option: { to-do (0) ; in-progress (1) ; completed (2) }");
		}
	}

	public static int totalDuration() {
		int total = 0;
		for (Task task : TaskManager.tasks) {
			//searches in task array
			if (task != null) {
				//checks to make sure the task isn't null
				total = total + task._taskDuration;
				//increases the total by adding the duration to the total and reinitializing it at the new value
			}
		}
		return total;

//	public void setTaskStatus(String status) {
//		if (status == "to-do") {
//			this._taskStatus = -1;
//		} else if (status == "in-progress") {
//			this._taskStatus = 0;
//		} else if (status == "complete") {
//			this._taskStatus = 1;
//		} else {
//			System.out.println("Not a Valid Task Status Option: { to-do (-1) ; in-progress (0) ; completed (1) }");
//		}		
//	}

	}
	void reportPrint(){
		System.out.println(
				"Task name: " + getTaskName() +
						"\nID: " + getTaskID() +
						"\nDue Date: " + getDueDate() +
						"\nPriority: " + convertStatus() +
						"\nDescription: " + getTaskDescription() +
						"\nCoordinator: " + getTaskCoordinator() +
						"\nTask duration: " + getTaskDuration());
	}
}