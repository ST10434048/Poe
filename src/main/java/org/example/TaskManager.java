package org.example;

import javax.swing.*;

public class TaskManager {
    public static void newTask() {
       String taskName = Task.promptTaskName();

       int taskNumber = Task.counter;

       int taskDuration = Task.promptDuration();

       String description = Task.promptDescription();
       if(!Task.checkTaskDescription(description)){
           System.out.println("Invalid task description");
           newTask();
       }
       String devName = Task.promptDevNam();
       String taskID = Task.createTaskID(devName, taskName,taskNumber);
       TaskMenu.Status status = TaskMenu.promptStatus();
       Task task = new Task(taskName,taskNumber,taskDuration,description,devName,taskID,status);
        Task.taskArr[Task.counter] = task;
       Task.counter++;
       int total  = totalDuration();
        System.out.println(total);
        displayTask(Task.taskArr[Task.counter-1]);

//       Users.task = Task.taskArr[Task.counter];
        //possible code to relate tasks to specific users.
    }
    public static void showReport(){
        System.out.println("Coming Soon");
        TaskMenu.promptKanbanChoice();
    }

    public static void displayTask(Task task){
        System.out.println("Task name: "+ task._taskName);
        System.out.println("Task number: "+ task._taskNumber);
        System.out.println("Task duration: "+ task._taskDuration);
        System.out.println("Task description: "+ task._taskDescription);
        System.out.println("Task Developer Name: "+ task._developerName);
        System.out.println("Task ID: "+ task._taskID);
        System.out.println("Task Status: "+ task._taskStatus);
        JOptionPane.showConfirmDialog(null, "Task status: "+task._taskStatus + "\nDeveloper Details" + task._developerName + "\nTask Number: " + task._taskNumber + "\nTask Name: "+ task._taskName + "\nTask Description: \n" + task._taskDescription + "\nTask ID: "+ task._taskID + "\nTask Duration: " + task._taskDuration,"Task Details",JOptionPane.DEFAULT_OPTION);
        addtask();
    }
    public static void addtask(){
       int option =  JOptionPane.showConfirmDialog(null, "Would you Like to add more tasks", "Add More Tasks",JOptionPane.YES_NO_OPTION);
       //asks use if they would like to add more tasks
       if(option == JOptionPane.YES_OPTION){
           newTask();
           //returns them to add a new task.
       }else{
           int totalDuration = totalDuration();
           JOptionPane.showMessageDialog(null, "Total duration of tasks: " + totalDuration);
           //displays the total duration of the tasks on the assumption no more tasks will be added
           TaskMenu.promptKanbanChoice();
           //returns to the kandban menu
       }
    }
    public static int totalDuration(){
        int total = 0;
        for (Task task : Task.taskArr) {
            //searches in task array
            if (task != null) {
                //checks to make sure the task isn't null
                total += task._taskDuration;
                //increases the total by adding the duration to the total and reinitializing it at the new value
            }
        }
        return total;
        //returns the total to be displayed

    }

}
