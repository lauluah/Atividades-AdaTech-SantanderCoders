package AtividadeStream2.Controller;

import AtividadeStream2.Service.ComprasService;
import AtividadeStream2.model.Produtos;

import java.util.List;

public class ComprasController {
    private final ComprasService comprasService;

    public ComprasController(ComprasService comprasService) {
        this.comprasService = comprasService;
    }

    public List<Produtos> adicionarProduto(Produtos produto) {
        return comprasService.adicionarProdutos(produto);
    }


}
