package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageTest {

	private  final double  margeDerreur = 0.00001; 
	private LocalDate date = LocalDate.of(2002, 5, 20);
	private Formule formule = new Formule(date,date,3.0,"baba",5);
	private Voyage v1 = new Voyage("houba","houbi", formule);
	private List<Voyageur> voyageurs = new ArrayList<Voyageur>();
	private Voyageur voyageur = new Voyageur ("Mme", "toto", "bar", date, "000");

	@Test
	public void testVoyage() {
		assertNotNull(v1);
	}

	@Test
	public void testGetRegion() {
		assertEquals(v1.getRegion(),"houba");
		
	}

	@Test
	public void testSetRegion() {
		v1.setRegion("Languedoc-Roussillon");
		assertEquals("Languedoc-Roussillon", v1.getRegion());
	}

	@Test
	public void testGetDescriptif() {
		assertEquals(v1.getDescriptif(),"houbi");
	}

	@Test
	public void testSetDescriptif() {
		v1.setDescriptif("Languedoc-Roussillon");
		assertEquals("Languedoc-Roussillon",v1.getDescriptif());
	}

	@Test
	public void testGetFormule() {
		assertNotNull(v1.getFormule());
	}

	@Test
	public void testSetFormule() {
		Formule formule1 = new Formule(date,date,3.5,"bobo",9);
		v1.setFormule(formule1);
		assertEquals(v1.getFormule(),formule1);
	}

	@Test
	public void testGetVoyageurs() {
		assertNotNull(v1.getVoyageurs());
	}

	@Test
	public void testSetVoyageurs() {
		voyageurs.add(voyageur);
		v1.setVoyageurs(voyageurs);
		assertTrue(v1.getVoyageurs().contains(voyageur));
	}

	@Test
	public void testGetIdVoyage() {
		assertNotNull(v1.getIdVoyage());
	}

	@Test
	public void testSetIdVoyage() {
		   v1.setIdVoyage(10);
		   assertEquals(10, v1.getIdVoyage());
	}
	
	@Test
	public void testAddVoyageur() {
		// on envoie 20 voyageurs et on verifie qu'on a bien 9
		for (int i = 0; i<20; i++) {
			v1.addVoyageur(voyageur);
		}
		assertTrue(v1.getVoyageurs().contains(voyageur));
		//System.out.println("taille après ajout de 10 element: " +v1.getVoyageurs().size());
		assertEquals(9,v1.getVoyageurs().size());
		
	}
	
	@Test
	public void getPrixVoyage() {
		Voyage v2 = new Voyage("nord", "aller au nord", new Formule (date, date, 2.0, "formule1", 15));
		voyageurs.add(voyageur);
		voyageurs.add(voyageur);
		v2.setVoyageurs(voyageurs);
		
		assertEquals(v2.getFormule().getPrixFormule() * v2.getVoyageurs().size(), v2.getPrixVoyage(), margeDerreur);

	}
	
	// A NE GERER 

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