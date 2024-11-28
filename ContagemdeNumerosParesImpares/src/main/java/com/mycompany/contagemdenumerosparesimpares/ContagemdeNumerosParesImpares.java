/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemdenumerosparesimpares;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ContagemdeNumerosParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int pares = 0;
        int impares = 0;

        // Solicita 15 números inteiros ao usuário
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Conta os números pares e ímpares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
