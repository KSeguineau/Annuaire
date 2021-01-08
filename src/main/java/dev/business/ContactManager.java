package dev.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.business.abstraction.IContactManager;
import dev.data.abstraction.Contact;
import dev.data.abstraction.IContactRepository;

/** 
 * 
 * @author KSeguineau
 *Contact manager that implement IcontactManager
 */
@Service
public class ContactManager implements IContactManager {

	/**
	 * contact repository
	 */
	private IContactRepository contactRepository;
	
	@Autowired
	public ContactManager(IContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}

	@Override
	public Optional<Contact> getContactById(Long id) {
		return contactRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public Contact create(Contact contact) {
		contactRepository.save(contact);
		return contact;
	}

}
