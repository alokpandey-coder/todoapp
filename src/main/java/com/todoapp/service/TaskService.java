package com.todoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todoapp.module.Task;
import com.todoapp.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    public List<Task> getAllTasks() {
        
      return taskRepository.findAll();
    }


    public void createTasks(String title) {   
      Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
       
      taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
      
      Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Tasks"));

      task.setCompleted(!task.isCompleted());

      taskRepository.save(task);
    }

    



}
