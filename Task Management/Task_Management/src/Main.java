import service.TaskService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskService taskService = new TaskService();

        while (true) {
            System.out.println("\n----- Task Manager -----");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    taskService.addTask(title, desc);
                    break;
                case 2:
                    taskService.viewAllTasks();
                    break;
                case 3:
                    System.out.print("Enter Task ID to mark complete: ");
                    int completeId = sc.nextInt();
                    taskService.completeTask(completeId);
                    break;
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    taskService.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting Task Manager.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
