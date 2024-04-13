package org.example;

import org.example.models.Treno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrada com o número de presentes: ");
        int n = scanner.nextInt();

        int[] presentes = new int[n];

        for (int i = 0; i < n; i++) {
            String lado = (i % 2 == 0) ? "A" : "B";
            System.out.print("Digite o peso do presente " + (i + 1) +": " );
            presentes[i] = scanner.nextInt();
        }
        String resultado = Treno.equilibrarTreno(presentes);
        System.out.println("Saída: " + resultado);
    }

}