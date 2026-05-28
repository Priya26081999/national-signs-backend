package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactDto;

@Service
public class EmailService {
	
	@Autowired
	
	private JavaMailSender mailSender;
	
	public void sendMail(ContactDto contactDto) {
		
		
		 
		 try {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo("sheebapriya30@gmail.com");
		message.setSubject("New Client Contact");
		message.setText(
				"Name : " + contactDto.getName()+
				"\nEmail : " + contactDto.getEmail()+
				"\nPhone : " + contactDto.getPhone()+
				"\nMessage : " + contactDto.getMessage()
				);
		
		mailSender.send(message);
		

	}catch (Exception e) {
        System.out.println("Mail failed: " + e.getMessage());
        e.printStackTrace();
	}
		 

}
		 
	}
