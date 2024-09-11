package algorithms;

public class Sorts {

    public static void bubble(long[] lista){ // Parâmetro quantidade ta aqui só pra o código ficar padronizado no main
        boolean houveTroca;
        for (int i = 0; i < lista.length - 1; i++){
            houveTroca = false;
            for (int j = 0; j < lista.length - 1; j++){
                if (lista[j] > lista[j+1]){ 
                    long temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                    houveTroca = true;
                }
            }

            if(!houveTroca){
                break; // Otimização do bubbleSort
            }
        }
    }

    public static void insertion(long[] lista){
        for (int i = 1; i < lista.length; i++){
            long temp = lista[i]; 
            int j = i - 1; 
            
            while (j >= 0 && lista[j] > temp){ 
                lista[j+1] = lista[j];
                j--; 
            }
            lista[j+1] = temp;
        }
    }

    public static void selection(long[] lista){
        for (int i = 0; i < lista.length; i++){
            int menor = i;
            for (int j = i + 1; j < lista.length; j++){
                if (lista[j] < lista[menor]){
                    menor = j;
                }
            }
            long temp = lista[menor];
            lista[menor] = lista[i];
            lista[i] = temp;
        }
    }

    public static long[] counting(long vetor[]) { // Overflow???? Espero que não
        // Encontrar o valor máximo no array
        long max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (max < vetor[i]) {
                max = vetor[i];
            }
        }

        // Criar o array de contagem
        long[] vetorAux = new long[(int) max + 1];

        // Contar a ocorrência de cada número
        for (int i = 0; i < vetor.length; i++) {
            vetorAux[(int) vetor[i]]++;
        }

        // Atualizar o array auxiliar para armazenar as posições dos elementos
        for (int i = 1; i <= max; i++) {
            vetorAux[i] += vetorAux[i - 1];
        }

        // Construir o array ordenado
        long vetorOrdenado[] = new long[vetor.length];
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetorOrdenado[(int) (vetorAux[(int) vetor[i]] - 1)] = vetor[i];
            vetorAux[(int) vetor[i]]--;
        }

        return vetorOrdenado;
    }
}
