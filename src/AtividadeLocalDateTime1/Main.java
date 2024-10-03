package AtividadeLocalDateTime1;

import AtividadeLocalDateTime1.service.PresencaService;
import AtividadeLocalDateTime1.service.PresencaServiceImpl;

public class Main {
    public static void main(String[] args) {
        PresencaService ps = new PresencaServiceImpl();
        ps.lerArquivoCsv("C:\\Users\\laura\\OneDrive\\Documentos\\Atividades-Ada\\src\\AtividadeLocalDateTime1\\resources\\presencas.csv");
        ps.imprimirPresencas();
    }
}
