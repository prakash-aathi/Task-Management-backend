package com.ownProject.TaskManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ownProject.TaskManagementApp.model.Task;
import com.ownProject.TaskManagementApp.service.TaskService;

@RestController
//@CrossOrigin( origins="http://localhost:3000/" )

public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@PostMapping("/saveTask")
	public Task saveTask(@RequestBody Task task) {
		return taskService.SaveTask(task);
	}
	
	@GetMapping("/alltasks")
	public List<Task> fetchAllTask(){
		return taskService.fetchAllTask();
	}
	
	@DeleteMapping("/deleteTask/{id}")
	public String deleteTask(@PathVariable("id") Long taskId) {
		taskService.deleteTask(taskId);
		return "deleted succesfully";
	}
	
	@GetMapping("/getTask/{holderName}")
	public Task getHolderName(@PathVariable("holderName") String holderName) {
		return taskService.getByName(holderName);
	}
	
	@PutMapping("/changeStatus/{id}")
	public Task updateTask(@PathVariable("id") Long taskId,@RequestBody Task task) {
		return taskService.updateTask(taskId,task);
	}
	
}
