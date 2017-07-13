package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import dao.DBConnector;

public class TestDBConnector {
	DBConnector dbConnector; 

	@Before
	public void init(){
		dbConnector =   new DBConnector(); 	
		dbConnector.connect();
		dbConnector.close();
	}
	
	@Test
	public void testSbConection(){	
		dbConnector.connect();
		 	Assert.assertNotNull(dbConnector.getEntityManager()); 
		dbConnector.close();
	}
}