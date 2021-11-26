package day05;

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

    private void validateProduct(Product product) {

        if (!(product.getSellDate() <= LocalDate.now())) {
            throw new IllegalArgumentException("Az eladás dátuma hibás.");
        }
    }

    public List<Product> getProductList() {
        return productList;
    }
}
