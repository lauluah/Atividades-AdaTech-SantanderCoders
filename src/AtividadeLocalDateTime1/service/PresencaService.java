package AtividadeLocalDateTime1.service;

import AtividadeLocalDateTime1.model.Aluno;
import AtividadeLocalDateTime1.util.CalculoUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PresencaService {
    private List<Aluno> alunos = new ArrayList<>();


    public void adicionarRegistro(String nome, Long tempoAssistido) {
        Aluno alunoExistente = alunos.stream()
                .filter(aluno -> aluno.getNome().equals(nome))
                .findFirst()
                .orElse(null);

        if (alunoExistente != null) {
            long novoTempo = alunoExistente.getMinutosAssistidos() + tempoAssistido;
            alunoExistente.setMinutosAssistidos(novoTempo);
        } else {
            Aluno alunoNovo = new Aluno(nome, tempoAssistido);
            alunos.add(alunoNovo);
        }
    }


    public void lerArquivoCsv(String nome, String caminhoArquivo) {
        String linha;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            while ((linha = br.readLine()) != null) {
                if (linha.contains(nome)) {
                    String[] valores = linha.split(",");

                    String horaInicio = valores[1].trim();
                    String horaFim = valores[2].trim();

                    LocalTime tempoInicio = LocalTime.parse(horaInicio.split(" ")[1], formatter);
                    LocalTime tempoFim = LocalTime.parse(horaFim.split(" ")[1], formatter);

                    Long minutosAssistidos = CalculoUtil.calcularTempoEmAula(tempoInicio, tempoFim);
                    adicionarRegistro(nome, minutosAssistidos);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void imprimirPresencas() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Data: " + aluno.getDataAula() + ", Minutos Assistidos: " + aluno.getMinutosAssistidos());
        }
    }
}
