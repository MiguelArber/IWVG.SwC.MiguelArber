package es.upm.miw.forge.ecp2;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.User;

public class UserTest {

	private User u;
	
	 @Before
	    public void before() {
	        u = new User(1, "Miguel", "Arber", "Myaddress");
	    }
	 
	    @Test
	    public void testUserName() {
	        assertEquals("Miguel", u.getName());
	    }
	    
	    @Test
	    public void testUserFamilyName() {
	        assertEquals("Arber", u.getFamilyName());
	    }
	    
	    @Test
	    public void testUserNumber() {
	        assertEquals(1, u.getNumber());
	    }
	    
	    @Test
	    public void testUserFullName() {
	        assertEquals("Miguel Arber", u.fullName());
	    }
	    
	    @Test
	    public void testUserInitials() {
	        assertEquals("M.", u.initials());
	    }
	    
	    @Test
	    public void testGetAddress() {
	        assertEquals("Myaddress", u.getAddress());
	    }
}
