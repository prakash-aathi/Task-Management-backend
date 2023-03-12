package com.ownProject.TaskManagementApp.service;

import java.util.List;

import com.ownProject.TaskManagementApp.model.Task;

public interface TaskService {

	public Task SaveTask(Task task);

	public List<Task> fetchAllTask();

	public void deleteTask(Long taskId);

	public Task getByName(String holderName);

	public Task updateTask(Long taskId, Task task);
	

}
