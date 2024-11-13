package AtividadeStream2.Service;

import AtividadeStream2.Repository.ComprasRepository;
import AtividadeStream2.model.Produtos;

import java.util.ArrayList;
import java.util.List;

public class ComprasService implements ComprasRepository {
    private List<Produtos> produtos = new ArrayList<Produtos>();

    private final ComprasRepository comprasRepository;

    public ComprasService(ComprasRepository comprasRepository) {
        this.comprasRepository = comprasRepository;
    }

    public List<Produtos> adicionarProdutos(Produtos produto) {
        produtos.add(produto);
        return produtos;
    }

    @Override
    public List<Produtos> produtosPorPreco(Double preco) {
        return List.of();
    }

    @Override
    public List<Produtos> produtosPorDescricao(String descricao) {
        return List.of();
    }

    @Override
    public List<Produtos> produtosPorCategoria(String categoria) {
        return List.of();
    }
}
