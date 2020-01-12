package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageurTest {

	private LocalDate dateNaissance = LocalDate.of(2020, 01, 01);
	private Voyageur  v = new Voyageur ("Mme", "toto", "bar", dateNaissance, "000" );
	private List<Voyage> voyages = new ArrayList<Voyage>();
	

	@Test
	public void testVoyageur() {
		assertNotNull(v);
	}

	@Test
	public void testGetVoyages() {
		assertNotNull(v.getVoyages());
	}

	@Test
	public void testSetVoyages() {
		LocalDate date = LocalDate.now();
		voyages.add(new Voyage("nord", "aller au nord", new Formule (date, date, 1.0, "formule1", 15)));
		v.setVoyages(voyages);
		assertEquals(voyages, v.getVoyages());
		
	}
	

	@Test
	public void testGetCivilite() {
		assertEquals("Mme", v.getCivilite());
	}

	@Test
	public void testSetCivilite() {
		v.setCivilite("M");
		assertEquals("M", v.getCivilite());
		
	}

	@Test
	public void testGetNomVoyageur() {
		assertEquals("toto", v.getNomVoyageur());
	}

	@Test
	public void testSetNomVoyageur() {
		v.setNomVoyageur("tata");
		assertEquals("tata", v.getNomVoyageur());
	}
	

	@Test
	public void testGetPrenomVoyageur() {
		assertEquals("bar", v.getPrenomVoyageur());
	}

	@Test
	public void testSetPrenomVoyageur() {
		v.setPrenomVoyageur("tata");
		assertEquals("tata", v.getPrenomVoyageur());
	}

	
	@Test
	public void testGetNumeroTelVoyageur() {
		assertEquals("000", v.getNumeroTelVoyageur());
		
	}

	@Test
	public void testSetNumeroTelVoyageur() {
		v.setNumeroTelVoyageur("111");
		assertEquals("111", v.getNumeroTelVoyageur());
	}

	@Test
	public void testGetIdVoyageur() {
		assertEquals(0, v.getIdVoyageur());
	}

	@Test
	public void testSetIdVoyageur() {
		v.setIdVoyageur(1);
		assertEquals(1, v.getIdVoyageur());
	}
	
	

	// Liste des tests que l'on ne gère pas
	
	@Test
	public void testGetDateNaissance() {
	}

	@Test
	public void testSetDateNaissance() {
	}

	@Test
	public void testEqualsObject() {
	}
	@Test
	public void testToString() {
	
	}

	@Test
	public void testHashCode() {
	}
}
