package fr.gtm.BoVoyage.entities;

import java.util.ArrayList;
import java.util.List;

public class Voyage {
	private long idVoyage = 0;
	private String region;
	private String descriptif;
	private Formule formule;

/**
 * On créé un attribut de type liste de voyageur 
 */

	private List<Voyageur> voyageurs = new ArrayList<Voyageur>();
	
	
	
	public Voyage(String region, String descriptif, Formule formule) {
		super();
		this.region = region;
		this.descriptif = descriptif;
		this.formule = formule;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getDescriptif() {
		return descriptif;
	}


	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}


	public Formule getFormule() {
		return formule;
	}


	public void setFormule(Formule formule) {
		this.formule = formule;
	}


	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	
	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}


	public long getIdVoyage() {
		return idVoyage;
	}


	public void setIdVoyage(long idVoyage) {
		this.idVoyage = idVoyage;
	}
	
	
	
	public void addVoyageur(Voyageur v) {
		if (voyageurs.size() < 9) {
			voyageurs.add(v);
		}
	}
	
	// est -ce qu'il faut une variable Prix?
	public double getPrixVoyage() {
		return this.getFormule().getPrixFormule()* this.getVoyageurs().size();
	}


/**
 * Permet de definir id comme clé primaire (en cas d'utilisation de map à la place des listes)
 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idVoyage ^ (idVoyage >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voyage other = (Voyage) obj;
		if (idVoyage != other.idVoyage)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Voyage [idVoyage=" + idVoyage + ", region=" + region + ", descriptif=" + descriptif + ", formule="
				+ formule + ", voyageurs=" + voyageurs + "]";
	}


	


}
