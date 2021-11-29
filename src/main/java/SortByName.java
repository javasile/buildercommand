import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByName implements SortInterface{


    @Override
    public List<Product> sort(List<Product> products) {
        Comparator<Product> productComparable = Comparator.comparing (Product::getName);
        products.sort (productComparable);
        return new ArrayList<> (products);
    }



}
