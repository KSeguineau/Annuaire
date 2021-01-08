package dev.business.abstraction;

import java.util.List;
import java.util.Optional;

import dev.data.abstraction.Contact;

/**
 * 
 * @author KSeguineau
 *Interface that manage contacts
 */
public interface IContactManager {

	/**
	 * Method that get all contacts
	 * @return List<Contact>
	 */
	List<Contact> getAllContact();
	
	/**
	 * Method that get a specified contact by his id
	 * @return a Contact
	 */
	Optional<Contact> getContactById( Long id);
	
	/**
	 * Method that delete a contact
	 */
	void delete(Long id);
	
	/**
	 * 
	 * @param contact
	 * Method that create a contact
	 * @return a Contact
	 */
	Contact create(Contact contact);
	
}
