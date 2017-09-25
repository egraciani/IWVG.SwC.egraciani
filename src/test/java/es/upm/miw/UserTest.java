package es.upm.miw;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserTest {
    
    private String name;
    private String familyName;
    private User user;

    @Before
    public void before() {
        name = "pedro";
        familyName = "garcia";
    }

    @Test
    public void testFullName() {
        user = new User(2, name, familyName); 
        assertEquals("Pedro Garcia", user.fullName());
    }
    
    @Test
    public void testGetName() {
        user = new User(2, name, familyName);
        assertEquals("Pedro", user.getName());
    }
    
    @Test
    public void testGetFamilyName() {
        user = new User(2, name, familyName);
        assertEquals("Garcia", user.getFamilyName());
    }

    @Test
    public void testInitials() {
            user = new User(2, name, familyName); 
        assertEquals("P.", user.initials());
    }

}