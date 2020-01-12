package fr.gtm.BoVoyage.dao;

import java.util.List;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;


/**
 * On créé une interface afin d'empêcher l'utilisateur de modifier la base de données
 */


public interface DestinationDAO 
{

		Destination createDestinationDAO(Destination d);
		void deleteDestinationDAO(Destination d);
		void updateDestinationDAO(Destination d);
		Destination findDestinationById(long id);
		Formule findFormuleById(long id);
		List<Destination> findAllDestinations();

		
		
		
}
