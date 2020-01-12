package fr.gtm.BoVoyage.entities;

import java.util.ArrayList; 
import java.util.List;
/**
 *
 * 
 * 
 * @author adminl
 
 */
public class Client {   

	private String nomClient;
	private String numeroTelClient;
	private long idClient = 0;
	private List<Voyage> voyages = new ArrayList<Voyage>();

	
	public Client(String nomClient, String numeroTelClient) 
	{
		super();
		this.nomClient = nomClient;
		this.numeroTelClient = numeroTelClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getNumeroTelClient() {
		return numeroTelClient;
	}

	public void setNumeroTelClient(String numeroTelClient) {
		this.numeroTelClient = numeroTelClient;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}	

	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}
	
	
	// un clien peut un ajouter un voyage même s'il existe en doublon
	
	public void addVoyage(Voyage v) {
			voyages.add(v);		
	}

	@Override
	public String toString() {
		return "Client [nomClient=" + nomClient + ", numeroTelClient=" + numeroTelClient + ", idClient=" + idClient
				+ ", voyages=" + voyages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idClient ^ (idClient >>> 32));
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
		Client other = (Client) obj;
		if (idClient != other.idClient)
			return false;
		return true;
	}
	
	
	
	
	
	
}
