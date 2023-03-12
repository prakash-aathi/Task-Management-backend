package com.ownProject.TaskManagementApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long taskId;

	@Column
	private String taskHolderName;
	@Column
	private String taskDate;
	@Column
	private String taskName;
	@Column
	private String taskStatus;
}
