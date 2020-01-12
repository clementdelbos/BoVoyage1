package fr.gtm.BoVoyage.daoTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.BoVoyage.dao.DestinationMockDAO;
import fr.gtm.BoVoyage.entities.Destination;

public class DestinationMockDaoTest {
	private List<Destination> destinations = new ArrayList<Destination>();
	private DestinationMockDAO dMock1 = new DestinationMockDAO(destinations);
	// on cree 2 destinations pour nos tests
	private Destination d1 = new Destination("paris", "aller à Paris");
	private Destination d2 = new Destination("Toulouse", "aller à Toulouse");
	
	
	
	
	@Test
	
	public void testDestinationMockDAO() {
	
		destinations.add(d1);
		DestinationMockDAO dMock1 = new DestinationMockDAO(destinations);
		assertNotNull(dMock1);
		
		//System.out.println(dMock1.getDestinations());

	}
	
	@Test
	public void testGetDestinations() {
		assertEquals(destinations, dMock1.getDestinations());
		//System.out.println(dMock1.getDestinations());
	}

	
	
	@Test
	public void setDestinations() {
		List<Destination> destinations2= new ArrayList<Destination>();
		dMock1.setDestinations(destinations2);
		assertEquals(destinations2, dMock1.getDestinations());
	
		//System.out.println(dMock1.getDestinations());
		
	}

	
	@Test
	public void testCreateDestinationDAO() {
		// on essaye de save 10 destinations identiques
		for (int i=0 ; i<10; i++) {
			dMock1.createDestinationDAO(d1);
		}
		assertTrue(dMock1.getDestinations().contains(d1));
		dMock1.createDestinationDAO(d2);
		assertEquals(2, dMock1.getDestinations().size());
		//System.out.println(dMock1.getDestinations().size() +"\n"+dMock1.getDestinations());
	}

	@Test
	public void testDeleteDestinationDAO() {
		//dMock1.createDestinationDAO(d1);
		dMock1.deleteDestinationDAO(d2);
		assertFalse(dMock1.getDestinations().contains(d2));
		dMock1.deleteDestinationDAO(d1);
		assertFalse(dMock1.getDestinations().contains(d1));
	
	}

	@Test
	public void testUpdateDestinationDAO() {
		dMock1.createDestinationDAO(d1);
		d1.setDescriptionDestination("toto");
		dMock1.updateDestinationDAO(d1);
		assertTrue(dMock1.getDestinations().contains(d1));
		//System.out.println(dMock1.getDestinations());
		dMock1.updateDestinationDAO(d2);
		assertFalse(dMock1.getDestinations().contains(d2));
		
	}

	@Test
	public void testFindDestinationById() {
		dMock1.createDestinationDAO(d1);
		assertEquals(d1, dMock1.findDestinationById(d1.getIdDestination()));
		assertEquals(null, dMock1.findDestinationById(d2.getIdDestination()));
		//System.out.println(dMock1.findDestinationById(d1.getIdDestination()));
		
	}

	
	// a finir 
	/*
	 * @Test public void testFindFormuleById() { dMock1.createDestinationDAO(d1);
	 * 
	 * assertEquals(d1.getFormules(),
	 * dMock1.findFormuleById(d1.getIdDestination())); // assertEquals(null,
	 * dMock1.findFormuleById(d2.getIdDestination())); }
	 */
	@Test
	public void testFindAllDestinations() {
		 dMock1.createDestinationDAO(d1);
		 destinations.add(d1);
		 assertEquals(destinations,dMock1.findAllDestinations());
		 
		// assertTrue(dMock1.findAllDestinations().contains(d1));
		 //System.out.println(dMock1.findAllDestinations());
	}

}
