package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Store {

    List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        validateProduct(product);
        productList.add(product);
    }

    public void validateProduct(Product product) {

        if (product.getSellDate() > LocalDate.now()) {
            throw new IllegalArgumentException("Az eladás dátuma hibás.");
        }
    }

    public void productWriteFile(Product product) {
        try {
            Files.write(Paths.get("product.txt"), (Iterable<? extends CharSequence>) productList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    public List<Product> getProductList() {
        return productList;
    }
}
