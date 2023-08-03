package br.edu.umfg.tecnologia.Aluno;

import java.util.Scanner;

public class Aluno {
    static Scanner pegaDados = new Scanner(System.in);

    public static void main(String[] args) {

        String nome;
        String ra;
        double nota1;
        double nota2;
        double notaTrabalho;
        System.out.println("Qual seu nome: ");
        nome = pegaDados.nextLine();
        System.out.println("Qual é seu registro acadêmico: ");
        ra = pegaDados.nextLine();
        System.out.println("Qual a nota da primeira prova: ");
        nota1 = pegaDados.nextDouble();
        System.out.println("Qual a nota da segunda prova: ");
        nota2 = pegaDados.nextDouble();
        System.out.println("Qual a nota do trabalho: ");
        notaTrabalho = pegaDados.nextDouble();

        Back principal = new Back(ra, nome, nota1, nota2);
        apresentarResultado(principal);
    }

    public static void apresentarResultado(Back aluno) {
        System.out.println(aluno.toString());
        System.out.println("Média: " + aluno.media());
        System.out.println("Situação: " + aluno.situacao());
    }
}

