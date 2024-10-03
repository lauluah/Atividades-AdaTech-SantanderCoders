package AtividadeLocalDateTime1.service;

import AtividadeLocalDateTime1.model.Aluno;
import AtividadeLocalDateTime1.util.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PresencaServiceImpl implements PresencaService {
    private int alunosPresentes;
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarRegistro(String nome, LocalTime horaInicio, LocalTime horaFim) {
        if (horaFim.isAfter(horaInicio)) {
            long minutosAssistidos = Util.calcularTempoEmAula(horaInicio, horaFim);
            Aluno alunoExistente = alunos.stream()
                    .filter(aluno -> aluno.getNome().equals(nome))
                    .findFirst()
                    .orElse(null);

            if (alunoExistente != null) {
                long novoTempo = alunoExistente.getMinutosAssistidos() + minutosAssistidos;
                alunoExistente.setMinutosAssistidos(novoTempo);
            } else {
                Aluno alunoNovo = new Aluno(nome, minutosAssistidos);
                alunos.add(alunoNovo);
            }
        } else {
            System.out.println("Registro inválido para " + nome + ": " + horaInicio + " até " + horaFim);
            alunos.removeIf(aluno -> aluno.getNome().equals(nome));
        }
    }

    public void lerArquivoCsv(String caminhoArquivo) {
        String linha;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");

                if (valores.length < 3) {
                    System.out.println("Linha inválida: " + linha);
                    continue;
                }

                String nome = valores[0].trim();
                String horaInicio = valores[1].trim();
                String horaFim = valores[2].trim();

                LocalTime tempoInicio = LocalTime.parse(horaInicio.split(" ")[1], formatter);
                LocalTime tempoFim = LocalTime.parse(horaFim.split(" ")[1], formatter);

                adicionarRegistro(nome, tempoInicio, tempoFim);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quantidadeDeAlunosPresentes() {
        alunosPresentes = 0;
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            if (aluno.getMinutosAssistidos() < 132) {
                iterator.remove();
            } else {
                alunosPresentes++;
            }
        }
    }

    public void imprimirPresencas() {
        quantidadeDeAlunosPresentes();
        for (Aluno aluno : alunos) {
            System.out.printf("Nome: %s, Minutos Assistidos: %d\n", aluno.getNome(), aluno.getMinutosAssistidos());
        }
        System.out.printf("Alunos presentes: %d\n", alunosPresentes);
    }
}