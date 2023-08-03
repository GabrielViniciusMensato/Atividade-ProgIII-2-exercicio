package br.edu.umfg.tecnologia.Aluno;

public class Back {
    private String ra;
    private String nome;
    private double n1;
    private double n2;
    private double notaTrabalho;
    public Back(String ra, String nome, double n1, double n2) {
        this.ra = ra;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public double media() {
        return (n1 + n2 + notaTrabalho) / 2.0;
    }

    public String situacao() {
        double mediaFinal = media();
        if (mediaFinal >= 7.0) {
            return "APROVADO";
        } else {
            return "EXAME";
        }
    }

    @Override
    public String toString() {
        return "RA.: " + ra + " || Nome: " + nome;
    }
}