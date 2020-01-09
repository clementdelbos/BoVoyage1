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

	@Test
	public void testClient() {
		
		Client c1 = new Client ("toto", "000");
		assertNotNull(c1);
	}

	@Test
	public void testGetNomClient() {
		Client c1 = new Client ("toto", "000");
		assertEquals("toto", c1.getNomClient());
	}

	@Test
	public void testSetNomClient() {
		
		Client c1 = new Client ("toto", "000");
		c1.setNomClient("foo");
		assertEquals("foo", c1.getNomClient());
	}

	@Test
	public void testGetNumeroTelClient() {
		Client c1 = new Client ("toto", "000");
		assertEquals("000", c1.getNumeroTelClient());
	}

	@Test
	public void testSetNumeroTelClient() {
		Client c1 = new Client ("toto", "000");
		c1.setNumeroTelClient("111");
		assertEquals("111", c1.getNumeroTelClient()); 
	}

	@Test
	public void testGetIdClient() {
		Client c1 = new Client ("toto", "000");
		assertEquals(0, c1.getIdClient());
		
	}

	@Test
	public void testSetIdClient() {
		Client c1 = new Client ("toto", "000");
		c1.setIdClient(1);
		assertEquals(1, c1.getIdClient());
	}

	@Test
	public void testGetVoyages() {
		Client c1 = new Client ("toto", "000");
		assertNotNull(c1.getVoyages());
		
	}

	@Test
	public void testSetVoyages() {
		Client c1 = new Client ("toto", "000");
		LocalDate date = LocalDate.now();
		List<Voyage> voyages = new ArrayList<Voyage>()  ;
		voyages.add(new Voyage("nord", "aller au nord", new Formule (date, date, 1.0, "formule1", 15)));
		c1.setVoyages(voyages);
		assertEquals(voyages, c1.getVoyages());
		
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
