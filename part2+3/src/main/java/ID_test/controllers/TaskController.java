package ID_test.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import ID_test.entities.Task;
import ID_test.services.TaskService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping(path = "/create")
    public Task savetask(@RequestBody Task task){
        return taskService.savetask(task);
    }

    @GetMapping(path = "/retrieve/{taskId}")
    public Optional<Task> getTaskById(@PathVariable("taskId") Integer taskId){
        return taskService.findTaskById(taskId);
    }

    @PutMapping(path = "/update/{taskId}")
    public Task updateTask(@PathVariable("taskId") Integer taskId, Task task ){
        return taskService.updateTask(task, taskId);
    }


    @GetMapping(path = "/delete/{taskId}")
    public Task deleteTaskById(@PathVariable("taskId") Integer taskId){
        return taskService.deleteTaskById(taskId);
    }
    }
    
}