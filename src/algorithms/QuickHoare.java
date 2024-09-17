package algorithms;

import java.security.cert.PKIXRevocationChecker;

public class QuickHoare {

    public static void quickSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndice = particaoHaore(vetor, inicio, fim);
            quickSort(vetor, inicio, pivoIndice - 1);       // Ordena a sublista à esquerda do pivô
            quickSort(vetor, pivoIndice + 1, fim);    // Ordena a sublista à direita do pivô
        }
    }

    private static int particaoHaore(int vetor[], int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int pivoIndice = meio;
        int i = esquerda - 1;
        int j = direita  + 1;

        while (i < j) {
            do{
                i++;
            }while (vetor[i] < pivo);

            do{
                j--;
            }while (vetor[j] > pivo);

            // Troca os elementos
            if(!(i >= j)){
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }

        }

        //Procurando o indice do pivo
        int k = 0;
        do {
            if(vetor[k] == pivo){
                pivoIndice = k;
            }   
        } while (vetor[k] != pivo);

        return pivoIndice;
    }  

}