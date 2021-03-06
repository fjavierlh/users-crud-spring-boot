package com.fjavierlh.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Username is required")
	private String username;
	
	@NotEmpty(message="Firstname is required")
	private String firstname;
	
	@NotEmpty(message="Lastname is required")
	private String lastname;
	
}
