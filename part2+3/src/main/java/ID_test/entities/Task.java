package ID_test.entities;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")

public class Task {

    @Id
    @Generated(strategy = Generated.ID)
    private Integer id;

    private String title;
    private String description;
    private Integer priority;
    private String category;
    private Date due_date;
    private String compeltion_status;
}
