package day02;

import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testFillMovies() throws IOException {
        MovieService movieService = new MovieService(Path.of("src/main/resources/movie.csv"));

        assertEquals(5, movieService.getMovies().size());
        assertEquals("James Cameron", movieService.getMovies().get(1).getDirector());

    }

@Test
    void testFillMoviesFileNotFound() {
        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> new MovieService(Path.of("movies.csv")));
}
}