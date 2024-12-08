package ID_test.services;

import ID_test.entities.Task;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ID_test.repositories.TaskRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> fetchtaskList(){
        return (List<Task>) taskRepository.findAll();
    }


    public Task updatetask(@NotNull Task task, Integer taskId)
    {
        Task taskDB = taskRepository.findById(taskId).get();

        if (Objects.nonNull(task.getTitle()) && !"".equalsIgnoreCase(task.getTitle())) {
            taskDB.setTitle(taskDB.getTitle());
        }

        if (Objects.nonNull(task.getDue_date())) {
            taskDB.setDue_date(task.getDue_date());
        }


        return taskRepository.save(taskDB);
    }

    public void deleteTaskById( Integer taskId){
        taskRepository.deleteById(taskId);
    }

    public Optional<Task> findtaskById(Integer taskId){
        return taskRepository.findById(taskId);
    }
}
