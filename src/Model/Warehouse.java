package Model;

import java.util.*;

public class Warehouse {
    Map <Long, Product> warehouse = new HashMap<>();

    public void addProduct(Long article, Product product){
        warehouse.put(article, product);
    }

    public Optional<Product> getProductByArticle(Long article){
        Optional<Product> res = Optional.ofNullable(warehouse.get(article));
        if (res.isEmpty()){
            System.out.println("Unknown article");
        }
        return res;
    }

    public double allProductCost(){
        return warehouse.values().stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public List<Long> getArticlesByTitle(String tite) {
        return warehouse.entrySet().stream()
                .filter(x -> x.getValue().getTitle().equalsIgnoreCase(tite))
                .map(Map.Entry::getKey)
                .toList();
    }

}
