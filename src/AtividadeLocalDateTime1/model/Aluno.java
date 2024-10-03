package AtividadeLocalDateTime1.model;

public class Aluno {
    private String nome;
    private String dataAula = "2023/10/01";
    private long minutosAssistidos;

    public Aluno(String nome, long minutosAssistidos) {
        this.nome = nome;
        this.minutosAssistidos = minutosAssistidos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataAula=" + dataAula +
                ", horasAssistidas=" + minutosAssistidos;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAula() {
        return dataAula;
    }

    public long getMinutosAssistidos() {
        return minutosAssistidos;
    }

    public void setMinutosAssistidos(long minutosAssistidos) {
        this.minutosAssistidos = minutosAssistidos;
    }
}
