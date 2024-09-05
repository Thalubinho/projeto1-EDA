package algorithms;

public class QuickHoare {
    
    public static void sort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoHaore(vetor, inicio, fim);
            sort(vetor, inicio, pivo);       // Ordena a sublista à esquerda do pivô
            sort(vetor, pivo + 1, fim);    // Ordena a sublista à direita do pivô
        }
    }

    public static int particaoHaore(int vetor[], int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do{
                i++;
            }while (vetor[i] < pivo);

            do{
                j--;
            }while (vetor[j] > pivo);
            
            if (i >= j){
                return j;
            }
            // Troca os elementos
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }  
}