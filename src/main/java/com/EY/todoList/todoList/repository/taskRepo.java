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
	
	@Query("select t from Task t where t.user = ?1") 
	 List<Task> findAllByUser(@Param("user")String user);
	


	
}
