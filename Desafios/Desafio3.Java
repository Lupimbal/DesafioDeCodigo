import java.util.ArrayList;

public class Desafio3 {

    public static void main(String[] args) {
        int[] entrada = {126, 15, 28, 17};
        ArrayList<ArrayList<Integer>> saida = fatorarVetor(entrada);
        
        System.out.println("Entrada: " + vetorParaString(entrada));
        System.out.println("Saída: " + vetorDeVetoresParaString(saida));
    }

    public static ArrayList<ArrayList<Integer>> fatorarVetor(int[] entrada) {
        ArrayList<ArrayList<Integer>> saida = new ArrayList<>();

        for (int num : entrada) {
            ArrayList<Integer> fatoresPrimos = fatorarNumero(num);
            saida.add(fatoresPrimos);
        }

        return saida;
    }

    public static ArrayList<Integer> fatorarNumero(int num) {
        ArrayList<Integer> fatores = new ArrayList<>();
        int divisor = 2;

        while (num > 1) {
            if (num % divisor == 0) {
                fatores.add(divisor);
                num /= divisor;
            } else {
                divisor++;
            }
        }

        return fatores;
    }

    public static String vetorParaString(int[] vetor) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]);
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String vetorDeVetoresParaString(ArrayList<ArrayList<Integer>> vetorDeVetores) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < vetorDeVetores.size(); i++) {
            sb.append(vetorDeVetores.get(i).toString());
            if (i < vetorDeVetores.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
