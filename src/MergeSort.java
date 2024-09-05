public class MergeSort {
    public long[] array;

    public static void merge(long lista[]){
        if (lista.length <= 1){
            return;
        } else{
            int meio = lista.length / 2;
            long listaEsquerda[] = new long[meio];
            long listaDireita[] = new long[lista.length - meio];

            //preenchendo o array
            for (int i = 0; i < meio; i++){
                listaEsquerda[i] = lista[i];
            }
            for (int j = meio; j < lista.length; j++){
                listaDireita[j - meio] = lista[j];
            }

            merge(listaEsquerda);
            merge(listaDireita);
            sort(lista, listaEsquerda, listaDireita);
        }
    }

    public static void sort(long lista[], long esquerda[], long direita[]){
        int tamEsquerda = esquerda.length;
        int tamDireita = direita.length;

        int i = 0, j = 0, k = 0;
        while (i < tamEsquerda && j < tamDireita){
            if (esquerda[i] < direita[j]){
                lista[k] = esquerda[i];
                i++;
            } else {
                lista[k] = direita[j];
                j++;
            }
            k++;
        }
        //adicionando o restante dos elementos 
        while(i < tamEsquerda){
            lista[k] = esquerda[i];
            i++;
            k++;
        }
        while(j < tamDireita){
            lista[k] = direita[j];
            j++;
            k++;
        }
    }    
}
