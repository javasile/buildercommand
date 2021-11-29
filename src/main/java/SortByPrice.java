import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements SortInterface{
    @Override
    public List<Product> sort(List<Product> products) {
        Comparator<Product>productComparator = Comparator.comparing (Product::getPrice);
        products.sort (productComparator);
        return new ArrayList<> (products);
    }

}
