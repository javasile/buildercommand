import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByQuantity implements SortInterface{
    @Override
    public List<Product> sort(List<Product> products) {
        Comparator<Product>productComparator = Comparator.comparing (Product::getQuantity);
        products.sort (productComparator);
        return new ArrayList<> (products);
    }


}
