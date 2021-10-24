package com.EY.todoList.todoList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.EY.todoList.todoList.entity.Task;
import com.EY.todoList.todoList.repository.taskRepo;



@Service
public class taskService {
	@Autowired
	private taskRepo repo;
	
	public Task addTask(Task tsk) {		
		return repo.save(tsk);		
	}
	
	public Task editTask(Task tsk) {
		Task Oldobj = repo.findById(tsk.getTaskId()).orElse(null);
		Oldobj.setStatus(tsk.getStatus());
		Oldobj.setUpdatedDate(tsk.getUpdatedDate());
		return repo.save(Oldobj);
		
	}
	
	public void deleteTask(int tskId) {
		repo.deleteById(tskId);
	}
	
    public List<Task> showAllTasks(String user){
    	System.out.println("Inside showAllTasks");
		 return repo.findAllByUser(user);
    	
	}
    

}
