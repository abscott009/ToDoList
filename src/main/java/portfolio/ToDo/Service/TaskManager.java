package portfolio.ToDo.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import portfolio.ToDo.Model.Task;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
  }

  public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

      try {
          throw new Exception("TASK NOT FOUND");
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }

  public void deleteTask(int taskId){
        if (taskId >= 0 && taskId < tasks.size()){
            tasks.remove(taskId);
            System.out.println("Task removed successfully.");
        }
        else {
            System.out.println("Invalid task ID.");
        }
  }

  public void updateTask (int taskId, Task updatedTask){
        if (taskId >= 0 && taskId < tasks.size()) {
            tasks.set(taskId,updatedTask);
            System.out.println("Task updated.");
        }
        else{
            System.out.println("Invlaid task ID.");
        }
  }

  public void markTaskComplete(int taskId){
        Task task = getTaskById(taskId);

        if (!task.isTaskComplete()) {
            task.setTaskComplete(true);
            System.out.println("Task completed.");
        }
        else {
            System.out.println("Invalid task ID.");
        }
  }
  public void listTasks() {
        if(tasks.isEmpty()){
            System.out.println("No tasks found");
        }
        else {
            System.out.println("Tasks: ");
            for (int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println("ID: " + i);
                System.out.println("Task: " + task.getTask());
                System.out.println("Details: " + task.getDetails());
                System.out.println("Due Date: " + task.getDueDate());
                System.out.println("Completed: " + (task.isTaskComplete()? "Yes" : "No"));
                System.out.println("----------------------------");
            }
        }
  }
}
