package ID_test.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ID_test.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    
}
