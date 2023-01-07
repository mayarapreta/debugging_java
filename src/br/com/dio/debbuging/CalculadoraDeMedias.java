package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Fernanda", "Lucas", "Bruna", "Pedro"};

        double media = CalculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);

    }

    private static double CalculaMediaDaTurma(String[] alunos, Scanner scan) {


        double Soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do alunos %s: ", aluno);
            double nota = scan.nextDouble();
            Soma += nota;
        }
        return Soma / alunos.length;
    }


}