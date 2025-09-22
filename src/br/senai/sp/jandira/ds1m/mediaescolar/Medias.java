package br.senai.sp.jandira.ds1m.mediaescolar;

import java.util.Scanner;

public class Medias {
    String aluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double notaMedia;
    String resultado;


    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        aluno = leitor.nextLine();

        System.out.print("Insira a nota do 1° Bimestre: ");
        nota1 = leitor.nextDouble();

        System.out.print("Insira a nota do 2° Bimestre: ");
        nota2 = leitor.nextDouble();

        System.out.print("Insira a nota do 3° Bimestre: ");
        nota3 = leitor.nextDouble();

        System.out.print("Insira a nota do 4°Bimestre: ");
        nota4 = leitor.nextDouble();

    calculoMedia();
    }




    public void calculoMedia() {
        notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        if (notaMedia >= 6) {
            resultado = "Aprovado";


        } else {
            resultado = "Reprovado";
        }

        obterResultados();

    }

        public void obterResultados(){

        System.out.println("-----------------");
        System.out.println("RESULTADO");
        System.out.println("-----------------");
        System.out.println("Aluno " + aluno );
        System.out.println("Nota do 1° Bimestre: " + nota1);
        System.out.println("Nota do 2° Bimestre: " + nota2);
        System.out.println("Nota do 2° Bimestre: " + nota3);
        System.out.println("Nota do 4° Bimestre: " + nota4);
        System.out.println("Nota Média " + notaMedia);
        System.out.println("Decisão: " + resultado);









        }








}
