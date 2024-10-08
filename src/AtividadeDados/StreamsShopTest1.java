package AtividadeDados;

public class StreamsShopTest1 {
    public static void main(String[] args) {
        VendasServiceImpl vendasService = new VendasServiceImpl();
        vendasService.lerArquivo("C:\\Users\\laura\\OneDrive\\Documentos\\Atividades-Ada\\src\\AtividadeDados\\vendas.csv");
        vendasService.calcularValorTotal();

    }
}
