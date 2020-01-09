package fr.gtm.BoVoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.BoVoyage.entities.Client;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageMockDAO implements VoyageDAO {
	
	private List<Voyage> voyages= new ArrayList<Voyage>();
	private static long idVoyage = 0;

	@Override
	public Voyage createVoyageDAO(Voyage v) {
		v.setIdVoyage(++idVoyage);
		voyages.add(v);
		return findVoyageById(v.getIdVoyage());
	
	}

	@Override
	public void deleteVoyageDAO(Voyage v) {
		
		if(v.getIdVoyage()==0)
		{
			System.out.println("Le voyage à supprimer n'existe pas");
		}
		else
		{
			voyages.remove(v);
		}
		
	}

	@Override
	public void updateVoyageDAO(Voyage v) {
	
		Voyage voyageTemp= findVoyageById(v.getIdVoyage());
		
		if (voyageTemp == null) {
			 System.out.println("La destination à mettre à jour n'existe pas ");
			 return;
		}else {
			
			if ( voyageTemp.getDescriptif() != v.getDescriptif()) {
				
				 voyageTemp.setDescriptif(v.getDescriptif());
			}
				
			if ( voyageTemp.getRegion() != v.getRegion()) {
				
				voyageTemp.setRegion(v.getRegion());
			}
			
	}
		
		
	}

	@Override
	public Voyage findVoyageById(long id) {
		
		for(Voyage v : voyages)
		{
			if(v.getIdVoyage()==id)
			{
				return v;
			}
		}
		return null;
	}


	@Override
	public List<Voyage> findVoyagesByClient(Client c) {
		
		return c.getVoyages();
	}

	@Override
	public List<Voyage> findVoyagesByVoyageur(Voyageur voyageur) {
		return voyageur.getVoyages();
	}
	

}
