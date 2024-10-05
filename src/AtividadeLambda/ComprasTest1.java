package AtividadeLambda;

import java.util.ArrayList;
import java.util.List;

import static AtividadeLambda.Compra.filtrarCompras;

public class ComprasTest1 {
    public static void main(String[] args) {

        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra("Bola", 12, true));
        compras.add(new Compra("Caderno", 7, true));
        compras.add(new Compra("Estojo", 10, false));

        List<Compra> comprasPagas = filtrarCompras(compras, compra -> compra.isPago());
        for (Compra compra : comprasPagas) {
            System.out.println(compra);
        }

        List<Compra> comprasComValorMenor10 = filtrarCompras(compras, compra -> compra.getPreco() < 10);
        for (Compra compra : comprasComValorMenor10) {
            System.out.println("Produto com preço menor que 10 reais \n" + compra);
        }

    }
}
