package fr.gtm.BoVoyage.daoTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.dao.VoyageMockDAO;
import fr.gtm.BoVoyage.entities.Client;
import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.entities.Voyage;
import fr.gtm.BoVoyage.entities.Voyageur;

public class VoyageMockDaoTest {
	private LocalDate date = LocalDate.now();
	private List<Voyage> voyages = new ArrayList<Voyage>();
	private VoyageMockDAO vMock1 = new VoyageMockDAO(voyages);
	// on cree 2 voyages pour nos tests
	private Voyage v1 = new Voyage("nord", "aller au nord", new Formule (date, date, 1.0, "formule1", 15));
	private Voyage v2 = new Voyage("sud", "aller au sud", new Formule (date, date, 2.0, "formule2", 20));
	
	

	@Test
	
	public void testVoyageMockDAO() {
		voyages.add(v1);
		VoyageMockDAO vMock1 = new VoyageMockDAO(voyages);
		assertNotNull(vMock1);
		//System.out.println(vMock1.getVoyages());

	}
	
	@Test
	public void testGetVoyages() {
		assertEquals(voyages, vMock1.getVoyages());
		//System.out.println(vMock1.getVoyages());
	}	
	
	@Test
	public void setVoyages() {
		List<Voyage> voyages2= new ArrayList<Voyage>();
		vMock1.setVoyages(voyages2);
		assertEquals(voyages2, vMock1.getVoyages());
		
	}
	
	@Test
	public void testCreateVoyageDAO() {
		
		for (int i=0 ; i<10; i++) {
			vMock1.createVoyageDAO(v1);
		}
		assertTrue(vMock1.getVoyages().contains(v1));
		vMock1.createVoyageDAO(v2);
		assertEquals(2, vMock1.getVoyages().size());
		//System.out.println(vMock1.getVoyages().size() +"\n"+vMock1.getVoyages());
	}
		
	

	@Test
	public void testDeleteVoyageDAO() {
		vMock1.deleteVoyageDAO(v2);
		assertFalse(vMock1.getVoyages().contains(v2));
		vMock1.deleteVoyageDAO(v1);
		assertFalse(vMock1.getVoyages().contains(v1));
	}

	@Test
	public void testUpdateVoyageDAO() {
		vMock1.createVoyageDAO(v1);
		v1.setRegion("ouest");
		vMock1.updateVoyageDAO(v1);
		assertTrue(vMock1.getVoyages().contains(v1));
		vMock1.updateVoyageDAO(v2);
		assertFalse(vMock1.getVoyages().contains(v2));
		//System.out.println(vMock1.getVoyages());
		
	}

	@Test
	public void testFindVoyageById() {
		vMock1.createVoyageDAO(v1);
		assertEquals(v1, vMock1.findVoyageById(v1.getIdVoyage()));
		assertEquals(null, vMock1.findVoyageById(v2.getIdVoyage()));
		//System.out.println(vMock1.findVoyageById(v1.getIdVoyage()));
		
	}
	
	// A REVOIR
	/*
	 * @Test public void testFindVoyagesByClient() { vMock1.createVoyageDAO(v1);
	 * Client c1 = new Client ("toto", "000"); assertEquals(null,
	 * vMock1.findVoyagesByClient(c1)); c1.addVoyage(v1); assertEquals(v1,
	 * vMock1.findVoyagesByClient(c1));
	 * //System.out.println(vMock1.findVoyagesByClient(c1));
	 * 
	 * }
	 */
	
	// a revoir

	/*
	 * @Test public void testFindVoyagesByVoyageur() { vMock1.createVoyageDAO(v1);
	 * Voyageur voyageur1 = new Voyageur ("Mme", "toto", "bar", date, "000");
	 * assertEquals(null, vMock1.findVoyagesByVoyageur(voyageur1));
	 * v1.addVoyageur(voyageur1);
	 * 
	 * //assertEquals(v1, vMock1.findVoyagesByVoyageur(voyageur1)); //
	 * System.out.println(vMock1.findVoyagesByVoyageur(voyageur1));
	 * 
	 * }
	 */
}
