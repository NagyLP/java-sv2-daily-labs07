package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human = new Human("James", "Bond", 1950);

    @Test
    public void testAddHumanInvalidHuman() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Dzsémsz", "Bond", 1900));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}