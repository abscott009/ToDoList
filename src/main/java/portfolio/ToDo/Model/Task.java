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
    public int id;

    @Column(nullable = false)
    public String task;

    @Column(nullable = true)
    public String details;

    @Column(nullable = true)
    public String dueDate;

    @Column(nullable = false)
    public boolean taskComplete;
}
