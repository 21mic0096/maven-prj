package org.junit;

import validation.PersonValidator;

public class Test {
	public void testValidPerson() {
        PersonValidator validator = new PersonValidator();
        assertEquals("Valid Person", validator.validatePerson("ram", 3025));
	}
        {
        	public void testInvalidPerson() {
                PersonValidator validator = new PersonValidator();
                assertEquals("Invalid Person", validator.validatePerson("john", 1234));
        	
        }

}
