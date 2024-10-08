package AtividadeDados;

import java.util.ArrayList;
import java.util.List;

public class FitroImpl {

    public static List<Vendas> filtrarCompras(List<Vendas> vendas, Filtro filtro) {
        List<Vendas> vendasFiltradas = new ArrayList<>();
        for (Vendas venda : vendas) {
            if (filtro.filtrarVendas(venda)) {
                vendasFiltradas.add(venda);
            }
        }
        return vendasFiltradas;
    }
}
