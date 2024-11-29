package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.module.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

    



}
