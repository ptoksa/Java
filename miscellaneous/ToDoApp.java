import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {

    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List App!");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. View all tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    removeTask(scanner);
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.println("Enter the task you want to add:");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added.");
    }

    private static void removeTask(Scanner scanner) {
        System.out.println("Enter the number of the task you want to remove:");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
            toDoList.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void viewTasks() {
        if (toDoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
