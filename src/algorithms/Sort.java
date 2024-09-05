package algorithms;

public class Sort {

    public static void bubble(int[] lista){
        for (int i = 0; i < lista.length -1; i++){
            for (int j = 0; j < lista.length-1; j++){
                if (lista[j] > lista[j+1]){ 
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }

    public static void insertion(int[] lista){
        for (int i = 1; i < lista.length; i++){
            int temp = lista[i]; 
            int j = i - 1; 
            
            while (j >= 0 && lista[j] > temp){ 
                lista[j+1] = lista[j];
                j--; 
            }
            lista[j+1] = temp;
        }
    }

    public static void selection(int[] lista){
        for (int i = 0; i < lista.length; i++){
            int menor = i;
            for (int j = i + 1; j < lista.length; j++){
                if (lista[j] < lista[menor]){
                    menor = j;
                }
            }
            int temp = lista[menor];
            lista[menor] = lista[i];
            lista[i] = temp;
        }
    }

    public static void counting(int vetor[], int vetorOrdenado[]) {
        // Encontrar o valor máximo no array
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (max < vetor[i]) {
                max = vetor[i];
            }
        }

        // Criar o array de contagem
        int[] vetorAux = new int[max + 1];

        // Contar a ocorrência de cada número
        for (int i = 0; i < vetor.length; i++) {
            vetorAux[vetor[i]]++;
        }

        // Atualizar o array auxiliar para armazenar as posições dos elementos
        for (int i = 1; i <= max; i++) {
            vetorAux[i] += vetorAux[i - 1];
        }

        // Construir o array ordenado
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetorOrdenado[vetorAux[vetor[i]] - 1] = vetor[i];
            vetorAux[vetor[i]]--;
        }
    }
}
