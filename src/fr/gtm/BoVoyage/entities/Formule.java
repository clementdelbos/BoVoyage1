package fr.gtm.BoVoyage.entities;

import java.time.LocalDate;

public class Formule {
	
	private long idFormule = 0;
	private LocalDate dateAller;
	private LocalDate dateRetour;
	private double prixFormule;
	private String descriptionFormule;
	private int nbPlacesFormule;
	
	public Formule(LocalDate dateAller, LocalDate dateRetour, double prixFormule, String descriptionFormule,
			int nbPlacesFormule) {
		super();
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.prixFormule = prixFormule;
		this.descriptionFormule = descriptionFormule;
		this.nbPlacesFormule = nbPlacesFormule;
	}
	
	
	
	public long getIdFormule() {
		return idFormule;
	}

	public void setIdFormule(long idFormule) {
		this.idFormule = idFormule;
	}

	public LocalDate getDateAller() {
		return dateAller;
	}

	public void setDateAller(LocalDate dateAller) {
		this.dateAller = dateAller;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	

	public double getPrixFormule() {
		return prixFormule;
	}

	public void setPrixFormule(double prixFormule) {
		this.prixFormule = prixFormule;
	}

	public String getDescriptionFormule() {
		return descriptionFormule;
	}

	public void setDescriptionFormule(String descriptionFormule) {
		this.descriptionFormule = descriptionFormule;
	}

	public int getNbPlacesFormule() {
		return nbPlacesFormule;
	}

	public void setNbPlacesFormule(int nbPlacesFormule) {
		this.nbPlacesFormule = nbPlacesFormule;
	}


/**
 * Permet de definir id comme clé primaire (en cas d'utilisation de map à la place des listes)
 */

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idFormule ^ (idFormule >>> 32));
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
		Formule other = (Formule) obj;
		if (idFormule != other.idFormule)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Formule [idFormule=" + idFormule + ", dateAller=" + dateAller + ", dateRetour=" + dateRetour
				+ ", prixFormule=" + prixFormule + ", descriptionFormule=" + descriptionFormule + ", nbPlacesFormule="
				+ nbPlacesFormule + "]";
	}

	
}
