package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class testConsumer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Digite o 1 produto: ");
        String produto1 = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        int preco1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o 2 produto: ");
        String produto2 = sc.nextLine();
        System.out.println("Digite o preço: ");
        int preco2 = sc.nextInt();
        sc.nextLine();

        products.add(new Product(produto1, preco1));
        products.add(new Product(produto2, preco2));

        Consumer<Product> formatter = (p) -> System.out.println("Product " + p.getName() + " Price RS: " + p.getPrice());
        products.forEach(formatter);

        Consumer<Product> increasePrice = (p) ->p.setPrice(p.getPrice() * 1.10);
        products.forEach(increasePrice);
        System.out.println("==== Products + 10% ====");
        products.forEach(formatter);
    }

}
