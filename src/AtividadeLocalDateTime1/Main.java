package AtividadeLocalDateTime1;

import AtividadeLocalDateTime1.service.PresencaService;

public class Main {
    public static void main(String[] args) {
        PresencaService ps = new PresencaService();
        ps.lerArquivoCsv("João Silva", "C:\\Users\\laura\\OneDrive\\Documentos\\Atividades-Ada\\src\\resources\\presencas.csv");
        ps.imprimirPresencas();
    }
}
