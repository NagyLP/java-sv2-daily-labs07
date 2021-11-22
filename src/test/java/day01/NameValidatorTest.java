package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    void isNameValidTest(){
        boolean result = nameValidator.isNameValid("John Doe");

        assertTrue(result);
    }


    @Test
    void isNameValidWith(){

       IllegalAccessException iae = assertThrows(IllegalAccessException.class, ()->nameValidator.isNameValid(null));
        assertEquals("Name is Invalid", iae.getMessage());
    }

    @Test
    void isNameValidWithWrongName(){

       IllegalAccessException iae = assertThrows(IllegalAccessException.class, ()->nameValidator.isNameValid("Jack"));
        assertEquals("Name is Invalid: ", iae.getMessage());
    }
}
