package com.ownProject.TaskManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ownProject.TaskManagementApp.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

	public Task findByTaskHolderName(String holderName);

}
