package fr.gtm.BoVoyage.dao;

import java.util.List;

import fr.gtm.BoVoyage.entities.Client;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;


public interface VoyageDAO {
	
	Voyage createVoyageDAO(Voyage v);
	void deleteVoyageDAO(Voyage v);
	void updateVoyageDAO(Voyage v);
	Voyage findVoyageById(long id);
	List<Voyage> findVoyagesByClient(Client c);
	List<Voyage> findVoyagesByVoyageur(Voyageur voyageur);

}
