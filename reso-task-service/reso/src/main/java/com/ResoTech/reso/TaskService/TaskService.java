package com.ResoTech.reso.TaskService;

import com.ResoTech.reso.TaskEntity.TaskEntity;
import com.ResoTech.reso.TaskRepositary.TaskRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepositary taskRepositary;

    public List<TaskEntity> getAllTasks()
    {
        return taskRepositary.findAll();
    }

    public TaskEntity saveTask(TaskEntity task)
    {
       return taskRepositary.save(task);
    }

    public Optional<TaskEntity> getTaskById(Long id) {
        return taskRepositary.findById(id);
    }

    public void deleteTaskById(Long id){
        taskRepositary.deleteById(id);
    }

//    //sample update method not possible to update single attribute
//    public TaskEntity updateTaskById(Long id,TaskEntity taskEntity)
//    {
//        TaskEntity updateTask = taskRepositary.findById(id).orElse(null);
//
//        if(updateTask!=null)
//        {
//            updateTask.setTitle(taskEntity.getTitle());
//            updateTask.setDescription(taskEntity.getDescription());
//            updateTask.setCompleted(taskEntity.getDescription());
//
//            taskRepositary.save(updateTask);
//            return updateTask ;
//
//        }
//        return null;
//
//    }

    public TaskEntity updateTaskById(Long id, TaskEntity taskEntity)
    {
        TaskEntity updateTask = taskRepositary.findById(id).orElse(null);
        if(Objects.nonNull(taskEntity.getTitle()) && !"".equalsIgnoreCase(taskEntity.getTitle()))
        {
            updateTask.setTitle(taskEntity.getTitle());
        }
        if(Objects.nonNull(taskEntity.getDescription()) && !"".equalsIgnoreCase(taskEntity.getDescription()))
        {
            updateTask.setDescription(taskEntity.getDescription());
        }
//        if(Objects.nonNull(taskEntity.getCompleted()) && !"".equalsIgnoreCase(taskEntity.getCompleted()))
//        {
//            updateTask.setCompleted(taskEntity.getCompleted());
//        }

        return taskRepositary.save(updateTask);
    }

}
