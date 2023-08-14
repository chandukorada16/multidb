package com.multiDB.user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_INFORMATION")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	private Integer userId;;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_NAME")
	private String userName;
}
