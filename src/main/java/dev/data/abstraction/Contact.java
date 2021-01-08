package dev.data.abstraction;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Contact {

	/**
	 * contact id
	 */
	@Id
	@Column
	private Long id;
	
	/**
	 * contact first name
	 */
	@Column
	private String firstName;
	
	/**
	 * contact last name
	 */
	@Column
	private String lastName;
	
	/**
	 * contact email
	 */
	@Column(unique = true)
	private String email;
	
	/**
	 * contact company
	 */
	@Column
	private String company;
	
	/**
	 * contact department
	 */
	@Column
	private String department;
}
