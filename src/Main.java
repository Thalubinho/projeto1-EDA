import algorithms.MergeSort;

public class Main {
    public static void main(String[] args) throws Exception {
        Data dados1 = new Data("test-array-3M-constante", 3000000);
        Data dados2 = new Data("test-array-3M-crescente", 3000000);
        Data dados3 = new Data("test-array-3M-decrescente", 3000000);
        Data dados4 = new Data("test-array-3M-desordenado", 3000000);
        
        //Dados dados5 = new Dados("test-array-1M-desordenado-nos-10finais", 1000000);
        // Dados dados6 = new Dados("test-array-1M-desordenado-nos-10iniciais", 1000000);
         
        System.out.println("-- DADOS 1 (CONSTANTE) --");
        testar(dados1);

        System.out.println("-- DADOS 2 (CRESCENTE) --");
        testar(dados2);

        System.out.println("-- DADOS 3 (DECRESCENTE) --");
        testar(dados3);

        System.out.println("-- DADOS 4 (DESORDENADO) --");
        testar(dados4);
    }

    public static void printarArray(int array[]){
        for(int i = 0; i < array.length-1; i++){
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%d\n", array[array.length-1]);
    }

    public static void testar(Data dados){
        Test test = new Test();
        MergeSort.merge(dados.getArray());
        test.setFim();
        test.setDuracao();

        System.out.printf("Tempo inicial: %d\n" +
                          "Tempo final: %d\n" +
                          "Duração: %f\n\n", test.getInicio(), test.getFim(), test.getDuracaoMiliSegundos());
    
    }
}
