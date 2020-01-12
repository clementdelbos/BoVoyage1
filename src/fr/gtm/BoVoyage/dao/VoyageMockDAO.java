package fr.gtm.BoVoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.BoVoyage.entities.Client;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageMockDAO implements VoyageDAO {
	
	private List<Voyage> voyages= new ArrayList<Voyage>();
	private static long idVoyage = 0;

	
	public VoyageMockDAO() {}
	
	public VoyageMockDAO(List<Voyage> voyages) {
		super();
		this.voyages = voyages;
	}

	/**
	 *Sauvegarde de voyage en base de données en évitant les doublons
	 */
	
	@Override
	public Voyage createVoyageDAO(Voyage v) {
		if (v.getIdVoyage() ==0) {
			v.setIdVoyage(++idVoyage);
			voyages.add(v);
		}
		return v;

	}

	
	/**
	 *Suppression de voyage sauvegardé
	 */
	@Override
	public void deleteVoyageDAO(Voyage v) {
		
		if(v.getIdVoyage()==0)
		{
			//System.out.println("Le voyage à supprimer n'existe pas");
			return;
		}
		else
		{
			v.setIdVoyage(0);
			voyages.remove(v);
		}
	}

	/**
	 *Mise à jour d'un voyage sans en créer de nouveau
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void updateVoyageDAO(Voyage v) {
		
		if (this.findVoyageById(v.getIdVoyage())!= null){
		
			Voyage voyageTemp= findVoyageById(v.getIdVoyage());
	
			if ( voyageTemp.getDescriptif() != v.getDescriptif()) {
				
				 voyageTemp.setDescriptif(v.getDescriptif());
			}
				
			if ( voyageTemp.getRegion() != v.getRegion()) {
				
				voyageTemp.setRegion(v.getRegion());
			}
			
			if (! voyageTemp.getVoyageurs().contains((v.getVoyageurs()))) {
				voyageTemp.setVoyageurs(v.getVoyageurs());
			}
		} else {
			//System.out.println("Désolé Le voyage à mettre à jour n'existe pas");
			return;	
		}
		
	}

	
	/**
	 *Recherche de Voyage par clé primaire en base de données
	 */
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

	/**
	 *Recherche de liste de Voyage par client en base de données
	 */
	@Override
	public List<Voyage> findVoyagesByClient(Client c) {
		
		return c.getVoyages();
	}
	/**
	 *Recherche de liste de Voyage par voyageur en base de données
	 */
	@Override
	public List<Voyage> findVoyagesByVoyageur(Voyageur voyageur) {
		
		
		return voyageur.getVoyages();
	}
	
// getters -setters
	
	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}

	public static long getIdVoyage() {
		return idVoyage;
	}

	public static void setIdVoyage(long idVoyage) {
		VoyageMockDAO.idVoyage = idVoyage;
	}


}
