package com.ResoTech.reso.TaskController;

import com.ResoTech.reso.TaskEntity.TaskEntity;
import com.ResoTech.reso.TaskService.TaskService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/")
public class TaskController {

    @Autowired
    private TaskService taskService;
    private final Logger Logger = LoggerFactory.getLogger(TaskController.class);
    @GetMapping("/tasks")
    public List<TaskEntity> getAllTasks()
    {
        Logger.info("Inside of tasks in taskcontroller");
        return taskService.getAllTasks();

    }

    @PostMapping("/tasks")
    public TaskEntity saveTask(@Valid @RequestBody TaskEntity taskEntity)
    {
        Logger.info("Inside of savetask in taskcontroller");
        return taskService.saveTask(taskEntity);
    }

    @GetMapping("/tasks/{id}")
    public Optional<TaskEntity> getTaskById(@PathVariable("id") Long id)
    {
        Logger.info("Inside of getTaskById in taskcontroller");
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTaskById(@PathVariable("id") Long id)
    {
        Logger.info("Inside of deleteTaskById in taskcontroller");
        taskService.deleteTaskById(id);
    }

    @PutMapping("/tasks/{id}")
    public TaskEntity updateTaskById(@PathVariable("id") Long id, @RequestBody TaskEntity taskEntity)
    {
        Logger.info("Inside of updateTaskById in taskcontroller");
        return taskService.updateTaskById(id, taskEntity);
    }
}
