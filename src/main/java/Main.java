import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Product product = new Product.ProductBuilder("prod",70).setColor("black").build();
       Product product2 = new Product.ProductBuilder("arod",2.3).setQuantity(5).build();
       Product product3 = new Product.ProductBuilder("xarod",5).setQuantity(5).build();
       Product product4 = new Product.ProductBuilder("crod",2).setQuantity(5).build();

        List<Product> products = new ArrayList<>(){{
            add(product);
            add(product2);
            add(product3);
            add(product4);
        }};

        SortInterface sort;

        sort = new SortByName();

        List<Product> soretdByName = sort.sort(products);
        sort = new SortByPrice();
        List<Product> soretdByPrice = sort.sort(products);
        sort = new SortByQuantity();
        List<Product> soretdByQuantity = sort.sort(products);
        showList(products);
        System.out.println("----------------------------------");
        showList(soretdByName);
        System.out.println("----------------------------------");
        showList(soretdByPrice);
        System.out.println("----------------------------------");
        showList(soretdByQuantity);

    }
    public static void showList(List<Product> products){
        products.forEach(System.out::println);
    }
}
