package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	 @Column(length = 2000)
	 
	 private String message;
	

}
