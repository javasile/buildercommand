import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByName implements SortInterface{


        @Override
        public List<Product> sort(List<Product> products) {
            products = clone(products);
            Comparator<Product> productComparator = Comparator.comparing (Product::getName);
            products.sort (productComparator);
            return products;
        }

        @Override
        public List<Product> clone(List<Product> products) {
            return new ArrayList<>(products);
        }



}
