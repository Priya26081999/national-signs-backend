package com.example.demo.mapping;

import com.example.demo.dto.ContactDto;
import com.example.demo.entity.Contact;

public class ContactMapping {
	
	public static ContactDto mapToContactDto(Contact contact) {
		
		return new ContactDto(
				contact.getId(),
				contact.getName(),
				contact.getEmail(),
				contact.getPhone(),
				contact.getMessage()
				);
	}
	
	public static Contact maptoContact(ContactDto contactDto) {
		
		return new Contact(
				contactDto.getId(),
				contactDto.getName(),
				contactDto.getEmail(),
				contactDto.getPhone(),
				contactDto.getMessage()
				);
	}

}
