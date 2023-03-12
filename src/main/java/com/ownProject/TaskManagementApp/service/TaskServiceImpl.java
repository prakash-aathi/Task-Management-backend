package com.ownProject.TaskManagementApp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ownProject.TaskManagementApp.exception.ResourceNotFoundException;
import com.ownProject.TaskManagementApp.model.Task;
import com.ownProject.TaskManagementApp.repository.TaskRepository;

@Service
public class TaskServiceImpl  implements TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	@Override
	public Task SaveTask(Task task) {
		return taskRepository.save(task) ;
	}

	@Override
	public List<Task> fetchAllTask() {
		return taskRepository.findAll() ;
	}

	@Override
	public void deleteTask(Long taskId) {
		taskRepository.findById(taskId).orElseThrow(() -> new ResourceNotFoundException("Task", "Id", taskId));
		taskRepository.deleteById(taskId);
	}

	@Override
	public Task getByName(String holderName) {
		return taskRepository.findByTaskHolderName(holderName);
	}

	@Override
	public Task updateTask(Long taskId, Task task) {
		Task taskDb = taskRepository.findById(taskId).orElseThrow(()-> new ResourceNotFoundException("Task", "Id", taskId));
		if(Objects.nonNull(task.getTaskStatus()) && !"".equalsIgnoreCase(task.getTaskStatus())) {
			taskDb.setTaskStatus(task.getTaskStatus());
		}
		return  taskRepository.save(taskDb) ;
	}



}
