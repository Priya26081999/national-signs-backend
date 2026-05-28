package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContactDto;
import com.example.demo.service.ContactService;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/api/contact")
public class ContactController {
	
	@Autowired
	
	private ContactService contactService;
	
	
	@PostMapping()
	
	public ResponseEntity<ContactDto> createContact (@RequestBody ContactDto contactDto){
		
		ContactDto saveContact = contactService.createContact(contactDto);
		return new ResponseEntity<>(saveContact,HttpStatus.OK);
				
	}
	

}
