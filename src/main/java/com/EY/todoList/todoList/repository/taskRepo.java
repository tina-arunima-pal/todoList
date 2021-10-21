package com.EY.todoList.todoList.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.EY.todoList.todoList.entity.Task;

@Repository
public interface taskRepo extends JpaRepository<Task, Integer> {
	
	@Query("select t.taskId,t.user,t.taskName,t.description,t.status,t.createdDate,t.updatedDate from Task t where t.user = :user") 
	 List<Task> findAllByUser(String user);
	


	
}
