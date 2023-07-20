package Desafios;

import java.util.Arrays;

public class Desafio2 {

    public static void main(String[] args) {
        int[] entrada = {3, 1, 4, 6, 2, 5};
        int[] saida = transformarVetor(entrada);
        
        System.out.println("Entrada: " + Arrays.toString(entrada));
        System.out.println("Saída: " + Arrays.toString(saida));
    }

    public static int[] transformarVetor(int[] entrada) {
       
        Arrays.sort(entrada);

       
        int[] saida = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            saida[i] = entrada[i] * (i + 1);
        }

        return saida;
    }
}
