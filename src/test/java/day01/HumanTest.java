package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createHumanWithWrongYear() {
        assertThrows(IllegalAccessException.class, ()-> new Human("John", "Doe", 1900));
    }

    @Test
    void getYearOfBirth() {
    }
}