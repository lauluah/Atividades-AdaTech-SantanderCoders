package AtividadeStreams;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product("maça", 10.0));
        productsList.add(new Product("Banana", 5.0));
        productsList.add(new Product("Laranja", 7.0));
        productsList.add(new Product("Manga", 15.0));

        double valorTotal = ProductService.somarTotal(productsList);
        double produtoMaisCaro = ProductService.encontrarValorMaisAlto(productsList);
        System.out.println(valorTotal);
        System.out.println(produtoMaisCaro);

    }
}
