package algorithms;

public class QuickLomuto1 {

    public static void sort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndice = particaoLomuto(vetor, inicio, fim);
            sort(vetor, inicio, pivoIndice - 1);       // Ordena a sublista à esquerda do pivô
            sort(vetor, pivoIndice + 1, fim);    // Ordena a sublista à direita do pivô
        }
    }

    private static int particaoLomuto(int vetor[], int esquerda, int direita) {
        int pivo = vetor[direita]; // Escolhe o último elemento como pivô
        int i = esquerda; // Índice do menor elemento - 1
        
        //System.out.printf("pivo: %d%nesquerda: %d%ndireita: %d%n", pivo, esquerda, direita);
        
        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                // Troca vetor[i] com vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                i++;
            }
        }
    
        // Coloca o pivô na sua posição correta
        vetor[direita] = vetor[i];
        vetor[i] = pivo;
    
        return i;
    }
}
