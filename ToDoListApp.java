import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private ArrayList<String> tasks;

    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            String removedTask = tasks.remove(taskIndex);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    toDoListApp.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter the task number to remove: ");
                    int taskIndex = scanner.nextInt() - 1;
                    toDoListApp.removeTask(taskIndex);
                    break;
                case 3:
                    toDoListApp.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
