package portfolio.ToDo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import portfolio.ToDo.Model.Task;
import portfolio.ToDo.Service.TaskManager;

import java.util.List;
import java.util.Objects;

public class ToDoTest {

    private TaskManager taskManager;

    @BeforeEach
    public void setup() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        Task task0 = new Task(
                "Pick up dry cleaning",
                "available after 10am",
                "1/2/34",
                true);

        taskManager.addTask(task0);

        List<Task> actualResponse = taskManager.getTasks();

        String expectedDetails = "available after 10am";

        assert actualResponse.size() == 1;
        assert Objects.equals(actualResponse.get(0).getDetails(), expectedDetails);

    }

    @Test
    public void testCompleteTask() {
        Task task0 = new Task(
                123,
                "Pick up dry cleaning",
                "available after 10am",
                "1/2/34");

        Task task1 = new Task(
                321,
                "Pick up dry cleaning",
                "available after 10am",
                "1/2/34");

        taskManager.addTask(task0);
        taskManager.addTask(task1);

        // actual method call
        taskManager.markTaskComplete(123);

        assert taskManager.getTasks().get(0).isTaskComplete();
        assert !taskManager.getTasks().get(1).isTaskComplete();

    }
}
