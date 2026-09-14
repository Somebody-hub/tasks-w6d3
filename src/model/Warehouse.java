package model;

import java.util.*;

public class Warehouse {
    private final Map<Long, Product> warehouse = new HashMap<>();

    public void addProduct(Long article, Product product) {
        warehouse.put(article, product);
    }

    public Optional<Product> getProductByArticle(Long article) {
        return Optional.ofNullable(warehouse.get(article));
    }

    public double allProductCost() {
        double sum = 0.0;
        for (Map.Entry<Long, Product> entry : warehouse.entrySet()) {
            sum += entry.getValue().getPrice();
        }
        return sum;
        /*
        return warehouse.values().stream()
                .mapToDouble(Product::getPrice)
                .sum();

         */
    }

    public List<Long> getArticlesByTitle(String title) {
        List<Long> result = new ArrayList<>();
        for (Map.Entry<Long, Product> entry : warehouse.entrySet()) {
            if (entry.getValue().getTitle().equalsIgnoreCase(title)) {
                result.add(entry.getKey());
            }
        }
        return result;
        /*
        return warehouse.entrySet().stream()
                .filter(x -> x.getValue().getTitle().equalsIgnoreCase(title))
                .map(Map.Entry::getKey)
                .toList();

         */
    }

}
