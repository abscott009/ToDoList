package portfolio.ToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import portfolio.ToDo.Model.Task;
import portfolio.ToDo.Service.TaskManager;

import java.util.Scanner;

@SpringBootApplication
public class ToDoApplication {

	private static TaskManager taskManager = new TaskManager();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		SpringApplication.run(ToDoApplication.class, args);

		boolean running = true;

		while (running) {
			System.out.println("Enter a Command (add/delete/update/complete/list/exit):");
			String command = scanner.nextLine().trim();

			switch (command.toLowerCase()) {
				case "add":
					addTask();
					break;
//				case "delete":
//					deleteTask();
//					break;
//				case "update":
//					updateTask();
//					break;
//				case "complete":
//					markTaskComplete();
//					break;
//				case "list":
//					listTasks();
//					break;
				case "exit":
					running = false;
					break;
				default:
					System.out.println("Invalid command. Please try again.");
			}
		}

		System.out.println("Exiting To-Do list.");
	}

	private static void addTask() {
		System.out.println("Enter the task name: ");
		String taskName = scanner.nextLine().trim();

		System.out.println("Enter the task details: ");
		String taskDetails = scanner.nextLine().trim();

		System.out.println("Enter the task due date: ");
		String dueDate = scanner.nextLine().trim();

		Task task = new Task(taskName, taskDetails, dueDate);
		taskManager.addTask(task);
		System.out.println("Task added successfully!");



	}
}