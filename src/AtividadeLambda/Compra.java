package AtividadeLambda;

import java.util.ArrayList;
import java.util.List;

public final class Compra {
   private final String produto;
   private final double preco;
   private final boolean isPago;

   public Compra(String produto, double preco, boolean isPago) {
       this.produto = produto;
       this.preco = preco;
       this.isPago = isPago;
   }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isPago() {
        return isPago;
    }

    public static List<Compra> filtrarCompras(List<Compra> compras, Filtro filtro) {
        List<Compra> comprasFiltradas = new ArrayList<>();
        for (Compra compra : compras) {
            if (filtro.filtrarCompras(compra)) {
                comprasFiltradas.add(compra);
            }
        }
        return comprasFiltradas;
    }

    @Override
    public String toString() {
        return STR."Compra: \n produto= \{produto}, preço= \{preco}, Pago= \{isPago}}\n";
    }
}
