package restaurant;

import java.util.*;

public class MenuQueries {

    // 1. Lista preparatelor vegetariene, sortate alfabetic
    public static List<Product> getVegetarianProducts(Map<Category, List<Product>> menu) {
        return menu.values().stream()
                .flatMap(List::stream)
                .filter(p -> p instanceof Food food && food.isVegetarian())
                .sorted(Comparator.comparing(Product::getName))
                .toList();
    }

    // 2. Pretul mediu al deserturilor
    public static OptionalDouble getAverageDessertPrice(Map<Category, List<Product>> menu) {
        return menu.entrySet().stream()
                .filter(e -> e.getKey() == Category.DESERT)
                .flatMap(e -> e.getValue().stream())
                .mapToDouble(Product::getPrice)
                .average();
    }

    // 3. Verificare daca exista produse > 100 RON
    public static boolean existsOver100(Map<Category, List<Product>> menu) {
        return menu.values().stream()
                .flatMap(List::stream)
                .anyMatch(p -> p.getPrice() > 100);
    }
}
