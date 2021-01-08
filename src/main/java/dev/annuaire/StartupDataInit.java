package dev.annuaire;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.data.abstraction.Contact;
import dev.data.abstraction.IContactRepository;



/**
 * Classe initialisant la bdd
 */
@Component
public class StartupDataInit {
/*

    private IContactRepository contactRepository;
    
    @Autowired
    public StartupDataInit(IContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}




	
    // La méthode init va être invoquée au démarrage de l'application.
    @EventListener(ContextRefreshedEvent.class)
    public void init() {
    	Contact contact = new Contact(1l,"bob","bobby","test@email.fr","test","test");
    	
    	contactRepository.save(contact);
        
    }
*/
}
