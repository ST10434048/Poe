package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {


    @Test
    void checkTaskDescriptionfail() {
        String taskDescription = "task description exceeds 50 characters and has returned over 50 characters has been used";
        boolean description = Task.checkTaskDescription(taskDescription);
        assertFalse(description);
    }

    @Test
    void checkTaskDescriptionpass() {
        String taskDescription = "task description is below 50 characters";
        boolean description = Task.checkTaskDescription(taskDescription);
        assertTrue(description);
    }
    @Test
    void checkTaskID() {
        String taskId = Task.createTaskID("Robyn Harrison","add",Task.counter+1).toUpperCase();
        assertEquals(taskId,"AD:1:BYN");
        System.out.println(taskId+" = "+ "AD:1:BYN");
    }

    @Test
    void TotalHoursCurrent() {
        Task[] tasks ={
                new Task("Login Feature", Task.counter+1,8,"Create Login to authenticate users","Robyn Harrison",Task.createTaskID("Robyn Harrison","Login Feature"
                        ,Task.counter), TaskMenu.Status.To_DO),
                new Task("Add Task Feature", Task.counter+2,10,"Create Add Task feature to add task users","Mike Smith",Task.createTaskID("Mike Smith","Add task Feature",
                        Task.counter+1), TaskMenu.Status.Doing)
        };
        Task.taskArr[0] = tasks[0];
        Task.taskArr[1] = tasks[1];
        int total = TaskManager.totalDuration();
        assertEquals(total,18);

    }
    @Test
    void TotalHours() {
        Task[] tasks = {
                new Task(" ", 1, 10," "," "," ", TaskMenu.Status.To_DO),
                new Task(" ", 2, 12," "," "," ", TaskMenu.Status.Doing),
                new Task(" ", 3, 55," "," "," ", TaskMenu.Status.Doing),
                new Task(" ", 4, 11," "," "," ", TaskMenu.Status.Doing),
                new Task(" ", 5, 1," "," "," ", TaskMenu.Status.To_DO),

        };
        Task.taskArr[0] = tasks[0];
        Task.taskArr[1] = tasks[1];
        Task.taskArr[2] = tasks[2];
        Task.taskArr[3] = tasks[3];
        Task.taskArr[4] = tasks[4];
        int total = TaskManager.totalDuration();
        assertEquals(total,89);

    }


}