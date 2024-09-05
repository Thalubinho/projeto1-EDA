public class Main {
    public static void main(String[] args) throws Exception {
        Dados dados1 = new Dados("test-array-3M-constante", 3000000);
        Dados dados2 = new Dados("test-array-3M-crescente", 3000000);
        Dados dados3 = new Dados("test-array-3M-decrescente", 3000000);
        Dados dados4 = new Dados("test-array-3M-desordenado", 3000000);
        
        //Dados dados5 = new Dados("test-array-1M-desordenado-nos-10finais", 1000000);
        // Dados dados6 = new Dados("test-array-1M-desordenado-nos-10iniciais", 1000000);
         
        System.out.println("-- DADOS 1 (CONSTANTE) --");
        testar(dados1);

        System.out.println("-- DADOS 2 (CRESCENTE) --");
        testar(dados2);

        System.out.println("-- DADOS 3 (DECRESCENTE) --");
        testar(dados3);

        System.out.println("-- DADOS 3 (DESORDENADO) --");
        testar(dados4);
    }

    public static void printarArray(int array[]){
        for(int i = 0; i < array.length-1; i++){
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%d\n", array[array.length-1]);
    }

    public static void testar(Dados dados){
        Testes teste = new Testes();
        MergeSort.merge(dados.getArray());
        teste.setFim();
        teste.setDuracao();

        System.out.printf("Tempo inicial: %d\n" +
                          "Tempo final: %d\n" +
                          "Duração: %f\n\n", teste.getInicio(), teste.getFim(), teste.getDuracaoMiliSegundos());
    
    }
}
