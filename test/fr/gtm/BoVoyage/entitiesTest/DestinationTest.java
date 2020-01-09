package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;

public class DestinationTest {


	@Test
	public void testDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");
		assertNotNull(d1);
	}

	@Test
	public void testGetIdDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");
	
		assertEquals(0, d1.getIdDestination());
	}

	@Test
	public void testSetIdDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");
		
	   d1.setIdDestination(10);
	   assertNotNull(d1.getIdDestination());
	}

	@Test
	public void testGetNomDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");		
		assertEquals("paris", d1.getNomDestination());
	}

	@Test
	public void testSetNomDestination() {
		
		Destination d1 = new Destination("paris", "aller à Paris");
		
		   d1.setNomDestination("Ailleurs");
		   assertEquals(d1.getNomDestination(),"Ailleurs");
	}

	@Test
	public void testGetDescriptionDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");		
		assertEquals("aller à Paris", d1.getDescriptionDestination());
	}

	@Test
	public void testSetDescriptionDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");
		
		   d1.setDescriptionDestination("Ailleurs");
		   assertEquals(d1.getDescriptionDestination(),"Ailleurs");
	}

	@Test
	public void testGetImagesDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");		
		assertNotNull(d1.getImagesDestination());
	}

	@Test
	public void testSetImagesDestination() {
		Destination d1 = new Destination("paris", "aller à Paris");
		
		List<String> imagesdestination = new ArrayList<String>();		
		
		imagesdestination.add("baba");
		imagesdestination.add("bobo");
		
		   d1.setImagesDestination(imagesdestination);
		   assertNotNull(d1.getDescriptionDestination());
	}

	@Test
	public void testGetFormules() {
		Destination d1 = new Destination("paris", "aller à Paris");		
		assertNotNull(d1.getFormules());
	}
	
	@Test
	public void testSetFormules() {
		
		LocalDate date = LocalDate.of(2002, 5, 20);
		
		Destination d1 = new Destination("paris", "aller à Paris");
		
		List<Formule> formules = new ArrayList<Formule>();	
		Formule formule1 = new Formule(date,date,3.0,"baba",5);
		Formule formule2 = new Formule(date,date,4.0,"bibu",4);
		
		formules.add(formule1);
		formules.add(formule2);
		
		   d1.setFormules(formules);
		   assertNotNull(d1.getFormules());
	}

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
