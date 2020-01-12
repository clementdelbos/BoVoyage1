package fr.gtm.BoVoyage.entities;

import java.util.List;
import java.util.ArrayList;

public class Destination {

	private long idDestination = 0;
	private String nomDestination ;
	private String descriptionDestination;
	private List<String> imagesDestination = new ArrayList<String>();
	private List<Formule> formules = new ArrayList<Formule>();
	
	public Destination(String nomDestination, String descriptionDestination) {
		super();
		this.nomDestination = nomDestination;
		this.descriptionDestination = descriptionDestination;
	}



	public long getIdDestination() {
		return idDestination;
	}



	public void setIdDestination(long idDestination) {
		this.idDestination = idDestination;
	}



	public String getNomDestination() {
		return nomDestination;
	}



	public void setNomDestination(String nomDestination) {
		this.nomDestination = nomDestination;
	}



	public String getDescriptionDestination() {
		return descriptionDestination;
	}



	public void setDescriptionDestination(String descriptionDestination) {
		this.descriptionDestination = descriptionDestination;
	}



	public List<String> getImagesDestination() {
		return imagesDestination;
	}



	public void setImagesDestination(List<String> imagesDestination) {
		this.imagesDestination = imagesDestination;
	}



	public List<Formule> getFormules() {
		return formules;
	}



	public void setFormules(List<Formule> formules) {
		this.formules = formules;
	}


/**
 * Permet de definir id comme clé primaire (en cas d'utilisation de map à la place des listes)
 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idDestination ^ (idDestination >>> 32));
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
		Destination other = (Destination) obj;
		if (idDestination != other.idDestination)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", nomDestination=" + nomDestination + ", descriptionDestination="
				+ descriptionDestination + ", imagesDestination=" + imagesDestination + ", formules=" + formules + "]";
	}


	
	
	
	
}
