package algorithms;

public class QuickHoare {
    
    public static void sort(long vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoHaore(vetor, inicio, fim);
            sort(vetor, inicio, pivo - 1);       // Ordena a sublista à esquerda do pivô
            sort(vetor, pivo + 1, fim);    // Ordena a sublista à direita do pivô
        }
    }

    private static int particaoHaore(long vetor[], int esquerda, int direita) {
        long meio = (esquerda + direita) / 2;
        long pivo = vetor[(int) meio];
        int i = esquerda - 1;
        int j = direita;

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
            long aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }  

    public static void main(String[] args) {
        long[] array = {1,2,3,4,5};
        sort(array, 0, 6);
    }
}