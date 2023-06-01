package portfolio.ToDo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import portfolio.ToDo.Model.Task;
import portfolio.ToDo.Service.TaskManager;

public class ToDoTest {

    private TaskManager taskManager;

    @BeforeEach
    public void setup() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        Task task0 = new Task(
                0,
                "Pick up dry cleaning",
                "available after 10am",
                "1/2/34",
                true);

        taskManager.addTask(task0);
    }
}
