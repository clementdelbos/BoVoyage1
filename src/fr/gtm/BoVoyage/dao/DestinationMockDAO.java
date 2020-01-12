package fr.gtm.BoVoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;

public class DestinationMockDAO implements DestinationDAO {
	
	private List<Destination> destinations= new ArrayList<Destination>();
	/**
	 * idDestination permet de simuler une clé primaire en base de données 
	 */
	private static long idDestination = 0;
	
	
	public DestinationMockDAO() {} ;
	
	public DestinationMockDAO(List<Destination> destinations) {
		super();
		this.destinations = destinations;
	}
	

	public List<Destination> getDestinations() {
		return destinations;
	}


	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}//assertEquals(1, dMock1.getDestinations().size());


	public static long getIdDestination() {
		return idDestination;
	}

	public static void setIdDestination(long idDestination) {
		DestinationMockDAO.idDestination = idDestination;
	}

	/**
	 * Sauvegarde de destination en base de données tout en évitant les doublons
	 */
	@Override
	public Destination createDestinationDAO(Destination d) {
		if(d.getIdDestination() == 0){
			d.setIdDestination(++idDestination);
			destinations.add(d);
		}
		return d;
	}
	/**
	 * Suppression de données sauvegardées
	 */
	@Override
	public void deleteDestinationDAO(Destination d) {

		if(d.getIdDestination()==0)
		{
			//System.out.println("La destination a supprimer n'existe pas");
			return;
		}
		else
		{
			d.setIdDestination(0);
			destinations.remove(d);
		}
		
	}
	/**
	 *Mise à jour de données sauvegardées sans en créer de nouvelles
	 */
	// 
	@SuppressWarnings("unlikely-arg-type") 
	
	@Override
	public void updateDestinationDAO(Destination d) {
		
		// on met à jour une destination qui existe (donc  même Id que la destination qu'on  )
		if (this.findDestinationById(d.getIdDestination())!= null){
			Destination destinationTemp= findDestinationById(d.getIdDestination());
			
				if ( destinationTemp.getDescriptionDestination() != d.getDescriptionDestination()) {
					destinationTemp.setDescriptionDestination(d.getDescriptionDestination());
				}
				
			
				if ( destinationTemp.getNomDestination() != d.getNomDestination()) {
				
					destinationTemp.setNomDestination(d.getNomDestination());
				}
			
				// on pert du principe qu'on ne gère pas les listes en interne on update change remplace la liste existante
			if ( ! destinationTemp.getImagesDestination().contains(d.getImagesDestination())){
				destinationTemp.setImagesDestination(d.getImagesDestination());
			}
				
			if ( ! destinationTemp.getFormules().contains(d.getFormules())){
				destinationTemp.setFormules(d.getFormules());
			}
		} else {
			
			//System.out.println("Désolé La destinatination à mettre à jour n'existe pas");
			return;
		}
}

	/**
	 *Recherche de Destination en base de données par clé primaire
	 */
	
	@Override
	public Destination findDestinationById(long id) {
		for(Destination d : destinations){
			if(d.getIdDestination()==id){
				return d;
			}
		}
		return null;
	}
	/**
	 *Recherche de Formule en base de données par clé primaire
	 */
	@Override
	public Formule findFormuleById(long id) {
		for(Destination d : destinations){
			for(Formule f : d.getFormules()){
				if(f.getIdFormule()==id){
					return f;
				}
			}
		}
		return null;
	}

	/**
	 *Retourner toutes destinations sauvegardées
	 */
	@Override
	public List<Destination> findAllDestinations() {
		return destinations;
	}

}
