package AtividadeLocalDateTime1.service;

import java.time.LocalTime;

public interface PresencaService {
    public void adicionarRegistro(String nome, LocalTime horaInicio, LocalTime horaFim);
    public void lerArquivoCsv(String caminhoArquivo);
    public void quantidadeDeAlunosPresentes();
    public void imprimirPresencas();
}
