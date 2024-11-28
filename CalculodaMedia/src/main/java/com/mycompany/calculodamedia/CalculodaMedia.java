/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodamedia;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculodaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        int acimaMedia = 0, abaixoMedia = 0, naMedia = 0;
        double soma = 0;

        // Solicita 5 notas de alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcula a média das notas
        double media = soma / 5;

        // Contabiliza quantos alunos estão acima, abaixo ou na média
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Média das notas: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos na média: " + naMedia);
    }
}
