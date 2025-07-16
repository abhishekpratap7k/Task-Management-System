package service;

import model.Task;
import util.TaskIdGenerator;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> taskList = new ArrayList<>();

    public void addTask(String title, String description) {
        int id = TaskIdGenerator.generateId();
        Task task = new Task(id, title, description);
        taskList.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public void completeTask(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.markAsCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void deleteTask(int id) {
        taskList.removeIf(task -> task.getId() == id);
        System.out.println("Task deleted if it existed.");
    }
}
