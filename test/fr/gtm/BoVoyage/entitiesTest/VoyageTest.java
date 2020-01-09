package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageTest {

	private LocalDate date = LocalDate.of(2002, 5, 20);

	@Test
	public void testVoyage() {
		
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		assertNotNull(v1);
	}

	@Test
	public void testGetRegion() {
		
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		assertEquals(v1.getRegion(),"houba");
		
	
	}

	@Test
	public void testSetRegion() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		v1.setRegion("Languedoc-Roussillon");
		
		
		assertNotNull(v1.getRegion());
	}

	@Test
	public void testGetDescriptif() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		assertEquals(v1.getDescriptif(),"houbi");
	}

	@Test
	public void testSetDescriptif() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		v1.setDescriptif("Languedoc-Roussillon");
		
		
		assertNotNull(v1.getDescriptif());
	}

	@Test
	public void testGetFormule() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		assertNotNull(v1.getFormule());
		
	}

	@Test
	public void testSetFormule() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		Formule formule1 = new Formule(date,date,3.5,"bobo",9);
		
		
		v1.setFormule(formule1);
		
		
		assertEquals(v1.getFormule(),formule1);
	}

	@Test
	public void testGetVoyageurs() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
	}

	@Test
	public void testSetVoyageurs() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);

		List<Voyageur> voyageurs = new ArrayList<Voyageur>();
		
		v1.setVoyageurs(voyageurs);
		
		
		assertNotNull(v1.getVoyageurs());
	}

	@Test
	public void testGetIdVoyage() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		
		assertNotNull(v1.getIdVoyage());
	}

	@Test
	public void testSetIdVoyage() {
		LocalDate date = LocalDate.of(2002, 5, 20);
		Formule formule = new Formule(date,date,3.0,"baba",5);
		Voyage v1 = new Voyage("houba","houbi", formule);
		
		   v1.setIdVoyage(10);
		   assertNotNull(v1.getIdVoyage());
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
