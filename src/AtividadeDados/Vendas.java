package AtividadeDados;

public final class Vendas {
    private final String idVenda;
    private final String produto;
    private final String vendedor;
    private final int quantidade;
    private final String dataVenda;
    private final double preco;
    private final String formaDePagamento;

    public Vendas(String idVenda, String produto, String vendedor, int quantidade, String dataVenda, double preco, String formaDePagamento) {
        this.idVenda = idVenda;
        this.produto = produto;
        this.vendedor = vendedor;
        this.quantidade = quantidade;
        this.dataVenda = dataVenda;
        this.preco = preco;
        this.formaDePagamento = formaDePagamento;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public String getProduto() {
        return produto;
    }


    public String getVendedor() {
        return vendedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public double getPreco() {
        return preco;
    }

}
