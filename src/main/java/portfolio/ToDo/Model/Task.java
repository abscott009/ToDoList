package portfolio.ToDo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
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
}
