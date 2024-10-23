package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<Product>();
        produtos.add(new Product("pepsi", 1.99));
        produtos.add(new Product("coca", 2.99));
        produtos.add(new Product("fanta", 3.99));
        produtos.add(new Product("coca-zero", 1.99));

        Comparator<Product> comparator = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
        Comparator<Product> comparatorName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        produtos.sort(comparator.thenComparing(comparatorName).reversed());

        for (Product p : produtos){
            System.out.println(p.getName() + " " + p.getPrice());
        }
    }
}
