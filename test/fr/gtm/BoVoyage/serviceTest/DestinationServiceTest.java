package fr.gtm.BoVoyage.serviceTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.dao.DestinationMockDAO;
import fr.gtm.BoVoyage.entities.Destination;
import fr.gtm.BoVoyage.entities.Formule;
import fr.gtm.BoVoyage.services.DestinationService;

public class DestinationServiceTest {
	
	private DestinationMockDAO destinationMockDAO = new DestinationMockDAO();
	private Destination d1 = new Destination("paris", "aller à Paris");
	@Test
	public void testGetAllDestinations() {
		 destinationMockDAO.createDestinationDAO(d1);
		 List<Destination> destinations = new ArrayList<Destination>();
		 destinations = destinationMockDAO.findAllDestinations();
		 assertTrue(destinations.contains(d1));
	}

	@Test
	public void testGetFormules() {
		
	}

	/*
	 * @Test public void testGetDestinationById() {
	 * destinationMockDAO.createDestinationDAO(d1); DestinationService
	 * destinationService = new DestinationService(); Destination recherche =
	 * destinationService.getDestinationById(d1.getIdDestination());
	 * assertEquals(recherche,
	 * destinationMockDAO.findDestinationById(d1.getIdDestination()));
	 * 
	 * 
	 * }
	 */
	


	@Test
	public void testGetFormuleById() {
		LocalDate date = LocalDate.of(2020, 01, 01);
		List<Formule> formules = new ArrayList<Formule> ();
		Formule f1 = new Formule (date, date, 1.0, "formule1", 15);
		formules.add(f1);
		d1.setFormules(formules);
		destinationMockDAO.createDestinationDAO(d1);
		DestinationService destinationService = new DestinationService();
		Formule recherche = destinationService.getFormuleById(d1.getIdDestination());
		assertEquals(recherche, destinationMockDAO.findFormuleById(d1.getIdDestination()));
		
		
	}

}
