package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;

public class DestinationTest {
	private Destination d1 = new Destination("paris", "aller à Paris");

	@Test
	public void testDestination() {
		assertNotNull(d1);
	}

	@Test
	public void testGetIdDestination() {
		assertEquals(0, d1.getIdDestination());
	}

	@Test
	public void testSetIdDestination() {
	   d1.setIdDestination(10);
	   assertNotNull(d1.getIdDestination());
	}

	@Test
	public void testGetNomDestination() {	
		assertEquals("paris", d1.getNomDestination());
	}

	@Test
	public void testSetNomDestination() {

		   d1.setNomDestination("Ailleurs");
		   assertEquals(d1.getNomDestination(),"Ailleurs");
	}

	@Test
	public void testGetDescriptionDestination() {	
		assertEquals("aller à Paris", d1.getDescriptionDestination());
	}

	@Test
	public void testSetDescriptionDestination() {

		   d1.setDescriptionDestination("Ailleurs");
		   assertEquals(d1.getDescriptionDestination(),"Ailleurs");
	}

	@Test
	public void testGetImagesDestination() {
			
		assertNotNull(d1.getImagesDestination());
	}

	
	@Test
	public void testSetImagesDestination() {
		List<String> toto = new ArrayList<String>();		
		toto.add("baba");
		d1.setImagesDestination(toto);
		assertNotNull(d1.getImagesDestination());
		assertTrue(d1.getImagesDestination().contains("baba"));
	}

	@Test
	public void testGetFormules() {
		Destination d1 = new Destination("paris", "aller à Paris");		
		assertNotNull(d1.getFormules());
		
	}
	
	@Test
	public void testSetFormules() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		List<Formule> foo = new ArrayList<Formule>();	
		Formule formule1 = new Formule(date,date,3.0,"baba",5);
		foo.add(formule1);
		
		d1.setFormules(foo);
		assertTrue(d1.getFormules().contains(formule1));

	}

	
	// pas à faire par nous
	@Test
	public void testHashCode() {
	
	}

	
	@Test
	public void testEqualsObject() {

	}

	@Test
	public void testToString() {
		
	}

}
