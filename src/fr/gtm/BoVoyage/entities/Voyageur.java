package fr.gtm.BoVoyage.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Voyageur {

	private String civilite ;
	
	private String nomVoyageur;
	private String prenomVoyageur;
	private LocalDate dateNaissance;
	private String numeroTelVoyageur;
	private long idVoyageur=0;
	private List<Voyage> voyages = new ArrayList<Voyage>();
	
	
	public Voyageur(String civilite, String nomVoyageur, String prenomVoyageur, LocalDate dateNaissance,
			String numeroTelVoyageur) {
		super();
		this.civilite = civilite;
		this.nomVoyageur = nomVoyageur;
		this.prenomVoyageur = prenomVoyageur;
		this.dateNaissance = dateNaissance;
		this.numeroTelVoyageur = numeroTelVoyageur;
	}

	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNomVoyageur() {
		return nomVoyageur;
	}

	public void setNomVoyageur(String nomVoyageur) {
		this.nomVoyageur = nomVoyageur;
	}

	public String getPrenomVoyageur() {
		return prenomVoyageur;
	}

	public void setPrenomVoyageur(String prenomVoyageur) {
		this.prenomVoyageur = prenomVoyageur;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTelVoyageur() {
		return numeroTelVoyageur;
	}

	public void setNumeroTelVoyageur(String numeroTelVoyageur) {
		this.numeroTelVoyageur = numeroTelVoyageur;
	}

	public long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

/**
 * Permet de definir id comme clé primaire (en cas d'utilisation de map à la place des listes)
 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idVoyageur ^ (idVoyageur >>> 32));
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
		Voyageur other = (Voyageur) obj;
		if (idVoyageur != other.idVoyageur)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voyageur [civilite=" + civilite + ", nomVoyageur=" + nomVoyageur + ", prenomVoyageur=" + prenomVoyageur
				+ ", dateNaissance=" + dateNaissance + ", numeroTelVoyageur=" + numeroTelVoyageur + ", idVoyageur="
				+ idVoyageur + ", voyages=" + voyages + "]";
	}

	
	

	

}
