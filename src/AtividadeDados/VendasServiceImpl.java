package AtividadeDados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendasServiceImpl {
    private List<Vendas> listaVendas = new ArrayList<>();

    public void lerArquivo(String arquivo) {
        String linha;
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                String id = valores[0];
                String produto = valores[1];
                String vendedor = valores[2];
                int quantidade = Integer.parseInt(valores[3]);
                String data = valores[4];
                double preco = Double.parseDouble(valores[5]);
                String formaDePagamento = valores[6];

                Vendas venda = new Vendas(id, produto, vendedor, quantidade, data, preco, formaDePagamento);
                listaVendas.add(venda);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void calcularValorTotal() {
        int totalQuantidadeVendida = listaVendas.stream()
                .mapToInt(Vendas::getQuantidade)
                .sum();

        System.out.println(totalQuantidadeVendida);
    }
}
