package fr.gtm.BoVoyage.entitiesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import fr.gtm.BoVoyage.entities.Formule; 
 
public class FormuleTest {
	
	private LocalDate date = LocalDate.of(2020, 01, 01);
	private  final double  margeDerreur = 0.00001;   // on se fixe une marge d'erreur pour la comparaison des double
	private Formule f1 = new Formule (date, date, 1.0, "formule1", 15);
	
	

	@Test
	public void testFormule() {
		assertNotNull(f1);
	}

	@Test
	public void testGetIdFormule() {
		assertEquals(0, f1.getIdFormule());
	}

	@Test
	public void testSetIdFormule() {
		f1.setIdFormule(1);
		assertEquals(1, f1.getIdFormule());
		
	}

	@Test
	public void testGetDateAller() {
		assertEquals(date, f1.getDateAller());		
	}

	@Test
	public void testSetDateAller() {
		LocalDate newDateAller = LocalDate.of(2020, 01, 11);
		f1.setDateAller(newDateAller);
		assertEquals(newDateAller, f1.getDateAller());
	}

	
	@Test
	public void testGetPrixFormule() {
		assertEquals(1.0, f1.getPrixFormule(), margeDerreur);  
	}
		

	@Test
	public void testSetPrixFormule() {
		f1.setPrixFormule(2.0);
		assertEquals(2.0, f1.getPrixFormule(), margeDerreur);	
		
	}
	
	@Test
	public void testGetNbPlacesFormule() {
		assertEquals(15, f1.getNbPlacesFormule());	
	}

	@Test
	public void testSetNbPlacesFormule() {
		f1.setNbPlacesFormule(20);
		assertEquals(20, f1.getNbPlacesFormule());	
	}

	@Test
	public void testGetDescriptionFormule() {
		assertEquals("formule1", f1.getDescriptionFormule());
	}

	@Test
	public void testSetDescriptionFormule() {
		f1.setDescriptionFormule("formule2");
		assertEquals("formule2", f1.getDescriptionFormule());	
	}

	
	// Pas besoin de tester les dates 
		@Test
	public void testGetDateRetour() {
		}

		@Test
	public void testSetDateRetour() {
		}
		
		// Pas à nous de tester
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
