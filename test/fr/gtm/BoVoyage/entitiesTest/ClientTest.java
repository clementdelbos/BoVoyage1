package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Client;
import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.entities.Voyage;

public class ClientTest {
	
	private LocalDate date = LocalDate.now();
	private Client c1 = new Client ("toto", "000");
	private List<Voyage> voyages = new ArrayList<Voyage>()  ;
	Voyage v1 = new Voyage("nord", "aller au nord", new Formule (date, date, 1.0, "formule1", 15));

	@Test
	public void testClient() {
		
		assertNotNull(c1);
	}

	@Test
	public void testGetNomClient() {
		assertEquals("toto", c1.getNomClient());
	}

	@Test
	public void testSetNomClient() {

		c1.setNomClient("foo");
		assertEquals("foo", c1.getNomClient());
	}

	@Test
	public void testGetNumeroTelClient() {
		assertEquals("000", c1.getNumeroTelClient());
	}

	@Test
	public void testSetNumeroTelClient() {
		c1.setNumeroTelClient("111");
		assertEquals("111", c1.getNumeroTelClient()); 
	}

	@Test
	public void testGetIdClient() {
		assertEquals(0, c1.getIdClient());
		
	}

	@Test
	public void testSetIdClient() {
		c1.setIdClient(1);
		assertEquals(1, c1.getIdClient());
	}

	@Test
	public void testGetVoyages() {
		assertNotNull(c1.getVoyages());
		
	}

	@Test
	public void testSetVoyages() {
		voyages.add(v1);
		c1.setVoyages(voyages);
		assertTrue(c1.getVoyages().contains(v1));
		
	}
	
	// on part du principe qu'on peut ajouter deux voyage identiques
	@Test
	public void testAddVoyage() {
		c1.addVoyage(v1);
		assertTrue(c1.getVoyages().contains(v1));
		
		
	}
	
	// Javadoc ces tests ne sont pas geres par nous

	@Test
	public void testToString() {
	
	}


	@Test
	public void testHashCode() {
	
	}
	//
	@Test
	public void testEqualsObject() {
	
	}
}
