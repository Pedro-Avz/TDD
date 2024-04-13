package org.example.models;

public class Treno {
    public static String equilibrarTreno(int[] presentes) {
        int somaLadoA = 0;
        int somaLadoB = 0;

        for (int i = 0; i < presentes.length; i++) {
            // verifica logo na entrada se ta equilibrado
            if (Math.abs(somaLadoA - somaLadoB) > 5) {
                return "N";
            }
            // adiciona um por vez na ordem de entrada
            if (i % 2 == 0) {
                somaLadoA += presentes[i];
            } else {
                somaLadoB += presentes[i];
            }
        }
        // no final de tudo verifica se esta equilibrado
        if (Math.abs(somaLadoA - somaLadoB) > 5) {
            return "N";
        }
        return "S";
    }
}
