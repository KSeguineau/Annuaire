package dev.data.abstraction;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactRepository extends JpaRepository<Contact, Long>{

	/**
	 * retrieves all contact from database
	 * @return a List<Contact>
	 */
	List<Contact>findAll();
	
	/**
	 *retrieve a specific Contact 
	 *@param contact id
	 */
	Optional<Contact> findById(Long id);
	
	/**
	 * delete a contact by his id
	 * @param contact id
	 */
	void deleteById(Long id);
	
	/**
	 * create or update a contact
	 * @param Contact
	 * @return the created Contact
	 */
	Contact save(Contact contact);
}
