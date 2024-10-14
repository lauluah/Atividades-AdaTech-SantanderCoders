package AtividadeStreams;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    Product product;

    public static double somarTotal(List<Product> productList) {
        double total = productList.stream()
                .map(Product::getPreco)
                .reduce(0.0, Double::sum);
        return total;
    }

    public static double encontrarValorMaisAlto(List<Product> productList) {
        double produtoMaisCaro = productList.stream()
                .map(Product::getPreco).max(Double::compareTo).orElse(0.0);
        return produtoMaisCaro;
    }
}
