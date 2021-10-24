package com.EY.todoList.todoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EY.todoList.todoList.entity.Task;
import com.EY.todoList.todoList.services.taskService;


@RestController
public class taskController {
	@Autowired
	private taskService service;
	
	@PostMapping(value = "/createTask" , produces = {"application/JSON"})
	public Task addTask(@RequestBody Task tsk) {
		return service.addTask(tsk);
		
	}
	
	@GetMapping("/listTasks/{user}")
	public List<Task> getTasks(@PathVariable("user") String user){
		System.out.println("inside getmapping");
		return service.showAllTasks(user);
		
		
	}
	
	@PutMapping("/editTask")
	public Task editTask(@RequestBody Task tsk) {
		return service.editTask(tsk);
		
	}
	
	@DeleteMapping("/DeleteTask/{taskId}")
	public void deleteTask(@PathVariable("taskId") int taskId) {
		service.deleteTask(taskId);
	}

}
