package com.EY.todoList.todoList.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//import javax.annotation.Generated;
import javax.persistence.*;


//import org.springframework.data.annotation.Id;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Todo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId;
	private String user;
	private String taskName;
	private String description;
	private String status;
	@JsonFormat(shape=JsonFormat.Shape.STRING , pattern = "dd-mm-yyyy")
	private Date createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING , pattern = "dd-mm-yyyy")
	private Date updatedDate;
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getTaskId() {		
		return taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}



}
