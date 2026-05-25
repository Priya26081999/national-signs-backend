package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Contact {
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		private String name;
		private String email;
		private String phone;
		
		 @Column(length = 2000)
		 
		 private String message;
		
};




