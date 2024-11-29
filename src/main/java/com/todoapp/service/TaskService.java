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



}
