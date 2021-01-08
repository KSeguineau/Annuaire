package dev.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.business.ContactManager;
import dev.business.abstraction.IContactManager;
import dev.data.abstraction.Contact;

/**
 * 
 * @author KSeguineau
 *Contact Rest controller
 */
@RestController
public class ContactController {

	/**
	 * contact manager
	 */
	private IContactManager contactManager;
	
	@Autowired
	public ContactController(IContactManager contactManager) {
		super();
		this.contactManager = contactManager;
	}

	/**
	 * Creating a get mapping that retrieves all contacts from database
	 * @return a Contact List
	 */
	@GetMapping("/contact")
	private List<Contact> getAllContact(){
		return contactManager.getAllContact();
	}
	
	/**
	 * Creating a get mapping that retrieves a specific contact from database
	 * @return a Contact
	 */
	@GetMapping("/contact/{id}")
	private Optional<Contact> getContact(@PathVariable("id") long id){
		return contactManager.getContactById(id);
	}
	
	/**
	 * Creating a delete mapping that delete a specific contact from database
	 */
	@DeleteMapping("/contact/{id}")
	private void deleteContact(@PathVariable("id") long id){
		contactManager.delete(id);
	}
	
	/**
	 * Creating a post mapping that create or update a contact in the database
	 * @return a Contact
	 */
	@PostMapping("/contact")
	private Contact createOrUpdate(@RequestBody Contact contact){
		return contactManager.create(contact);
	}
	
	
	
	
	
	
}
