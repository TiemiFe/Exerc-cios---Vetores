/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somamediadeelementos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SomaMediadeElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        // Solicita 10 números inteiros ao usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Calcula a média
        double media = soma / 10.0;

        // Exibe a soma e a média
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}
