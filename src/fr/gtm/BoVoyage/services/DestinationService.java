
/**
 * Package faisant le lien entre les packages DAO et Entities
 */


package fr.gtm.BoVoyage.services;

import java.util.List;


import fr.gtm.BoVoyage.dao.DestinationDAO;
import fr.gtm.BoVoyage.dao.DestinationMockDAO;
import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;

public class DestinationService {
	
	private DestinationDAO destinationDAO = new DestinationMockDAO(); 
	
	public List<Destination> getAllDestinations(){
		return destinationDAO.findAllDestinations();
	}
	
	public List<Formule> getFormules(Destination destination){
		return  destination.getFormules();
		
	}
	
	public Destination getDestinationById(long id) {
		 return destinationDAO.findDestinationById(id);
	}

	public Formule getFormuleById (long id) {
		return destinationDAO.findFormuleById(id);
	}
		
}
