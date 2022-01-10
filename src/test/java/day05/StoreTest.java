package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

class StoreTest {

    Store store = new Store(new ArrayList<>());

    @TempDir
    File tempFolder;

    @BeforeEach
    void init() {
        store.addProduct(new Product("T-shirt", LocalDate.of(2021, 11, 12), 3000));
        store.addProduct(new Product("T-shirt", LocalDate.of(2021, 11, 15), 2000));
        store.addProduct(new Product("T-shirt", LocalDate.of(2021, 11, 12), 4000));
    }

    @Test
    void weiteToFileByMonthTest() throws IOException {
        Path path = tempFolder.toPath().resolve("result.txt");

//        Path resultPath = store.(Month.NOVEMBER, path);


    }

}