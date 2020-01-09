package fr.gtm.BoVoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;

public class DestinationMockDAO implements DestinationDAO {
	
	private List<Destination> destinations= new ArrayList<Destination>();
	private static long idDestination = 0;
	

	@Override
	public Destination createDestinationDAO(Destination d) {
		
		d.setIdDestination(++idDestination);
		destinations.add(d);
		return findDestinationById(d.getIdDestination());
	}

	@Override
	public void deleteDestinationDAO(Destination d) {

		if(d.getIdDestination()==0)
		{
			System.out.println("La destination a supprimer n'existe pas");
		}
		else
		{
			destinations.remove(d);
		}
		
	}

	@Override
	public void updateDestinationDAO(Destination d) {
		
		Destination destinationTemp= findDestinationById(d.getIdDestination());
		
		if (destinationTemp == null) {
			 System.out.println("La destination à mettre à jour n'existe pas ");
			 return;
		}else {
			
			if ( destinationTemp.getDescriptionDestination() != d.getDescriptionDestination()) {
				
				 destinationTemp.setDescriptionDestination(d.getDescriptionDestination());
			}
				
			
			if ( destinationTemp.getNomDestination() != d.getNomDestination()) {
				
				destinationTemp.setNomDestination(d.getNomDestination());
			}
			
			
			// A REFLECHIR  
			
//			for (String s :d.getImagesDestination()) {
//		
//				if ( ! destinationTemp.getImagesDestination().contains(s)){
//					destinationTemp.setImagesDestination(s);
//				}
//					
//			}

			// est -ce qu'on met à jour la liste de formule?
		}
}

	@Override
	public Destination findDestinationById(long id) {
	
		
		for(Destination d : destinations)
		{
			if(d.getIdDestination()==id)
				
			{
				return d;
			}
		
				
		}
		return null;
	}

	@Override
	public Formule findFormuleById(long id) 
	{
		
		for(Destination d : destinations)
		{
		
			for(Formule f : d.getFormules())
			{
				if(f.getIdFormule()==id)
				{
					return f;
				}
			
			}
		}
		return null;
		
	}

	@Override
	public List<Destination> findAllDestinations() {
	
		return destinations;
	}

}
