package AtividadeStream2.Repository;

import AtividadeStream2.model.Produtos;

import java.util.List;

public interface ComprasRepository {

    List<Produtos> produtosPorPreco(Double preco);

    List<Produtos> produtosPorDescricao(String descricao);

    List<Produtos> produtosPorCategoria(String categoria);

    List<Produtos> adicionarProdutos(Produtos produto);
}
