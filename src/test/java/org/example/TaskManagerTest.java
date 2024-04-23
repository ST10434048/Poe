package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
@Test
    public void testTotalDurationWithNonNullTasks() {
        // Create an array of tasks with known durations
        Task[] tasks = new Task[3];
        tasks[0] = new Task("Task 1", 1, 10, "Description 1", "Developer 1", "ID1", TaskMenu.Status.Doing);
        tasks[1] = new Task("Task 2", 2, 20, "Description 2", "Developer 2", "ID2", TaskMenu.Status.Done);
        tasks[2] = new Task("Task 3", 3, 30, "Description 3", "Developer 3", "ID3", TaskMenu.Status.To_DO);

        // Set the taskArr in Task class to the array of tasks
        Task.taskArr = tasks;

        // Call the totalDuration method
        int total = TaskManager.totalDuration();

        // Verify that the total duration is calculated correctly
        assertEquals(60, total); // Total should be 10 + 20 + 30 = 60
    }

    @Test
    public void testTotalDurationWithNullTasks() {
        // Set the taskArr in Task class to an array with null elements
        Task.taskArr = new Task[3];

        // Call the totalDuration method
        int total = TaskManager.totalDuration();

        // Verify that the total duration is 0 when taskArr has null elements
        assertEquals(0, total); // Total should be 0
    }
}
