package portfolio.ToDo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String task;

    @Column(nullable = true)
    private String details;

    @Column(nullable = true)
    private String dueDate;

    @Column(nullable = false)
    private boolean taskComplete;

    public Task(int i, String task, String details, String dueDate, boolean taskComplete) {
        this.task = task;
        this.details = details;
        this.dueDate = dueDate;
        this.taskComplete = taskComplete;

    }
}
