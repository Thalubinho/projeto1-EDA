package algorithms;

public class QuickLomuto {

    public static void sort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoLomuto(vetor, inicio, fim);
            sort(vetor, inicio, pivo - 1);       // Ordena a sublista à esquerda do pivô
            sort(vetor, pivo + 1, fim);    // Ordena a sublista à direita do pivô
        }
    }

    private static int particaoLomuto(int vetor[], int esquerda, int direita) {
        int pivo = vetor[direita]; // Escolhe o último elemento como pivô
        int i = esquerda - 1; // Índice do menor elemento
        
        System.out.printf("pivo: %d%ndesquerda: %d%ndireita: %d%n", pivo, esquerda, direita);

        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                i++;
                // Troca vetor[i] com vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
    
        // Coloca o pivô na sua posição correta
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[direita];
        vetor[direita] = temp;
    
        return i + 1;
    }
}
