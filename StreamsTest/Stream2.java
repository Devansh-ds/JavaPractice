import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Stream2 {
    public static void main(String[] args) {
        List<Product> pl = new ArrayList<Product>();

        pl.add(new Product(1,"HP Laptop",25000f));  
        pl.add(new Product(2,"Dell Laptop",30000f));  
        pl.add(new Product(3,"Lenevo Laptop",28000f));  
        pl.add(new Product(4,"Sony Laptop",28000f));  
        pl.add(new Product(5,"Apple Laptop",90000f)); 
        
        List<Float> result = pl.stream()
                            .filter(p -> p.price > 28000)
                            .map(p -> p.price)
                            .collect(Collectors.toList());
        System.out.println(result);
        
    }
}
