/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaemvetor;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BuscaEmVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        // Solicita 10 nomes ao usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Solicita o nome a ser buscado
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        // Busca o nome e exibe a posição
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("O nome '" + nomeBusca + "' foi encontrado na posição " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado.");
        }
    }
}
