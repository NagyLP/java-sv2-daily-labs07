package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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

        if (product.getSellDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Az eladás dátuma hibás.");
        }
        productList.add(product);
    }

    public Path productWriteFile(Month month, Path testPath) {
        List<String> result = createStringByMonth(month);
        try {
            StringBuilder sb = new StringBuilder().append("soldproduct_").append(month.name()).append(".csv");
            Path path = Path.of(sb.toString());
            Files.write(path, result);
            return path;
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Hiba", ioe);
        }
    }

    private List<String> createStringByMonth(Month month) {
        List<String> result = new ArrayList<>();

        for (Product item : productList) {
            if (item.getSellDate().getMonth() == month) {
                result.add(item.toString());
            }
        }
        return result;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
