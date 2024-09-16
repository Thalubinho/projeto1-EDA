import algorithms.*;

public class Main {
    public static void runTimeMergeSort(String nomeBaseDeDados, int quantidade ) {
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        //Merge.merge(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeQuickSortHoare(String nomeBaseDeDados, int quantidade) {
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        //QuickHoare.sort(dados.getArray(), 0, quantidade);
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }

    public static void runTimeQuickSortLomuto(String nomeBaseDeDados, int quantidade ) {
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        QuickLomuto.sort(dados.getArray(), 0, quantidade - 1);
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeBubbleSort(String nomeBaseDeDados, int quantidade ) {
        // Inicialização de Variáveis
        double tempoInicial, tempoFinal;
        double duracaoMiliSegundos;
        float memoriaGasta, memoriaInicial, memoriaFinal;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        //Sorts.bubble(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeInsertionSort(String nomeBaseDeDados, int quantidade ) {
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        //Sorts.insertion(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeSelectionSort(String nomeBaseDeDados, int quantidade ) {
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        //Sorts.selection(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeCountingNegative(String nomeBaseDeDados, int quantidade ) { //  Lembrar de tirar o números negativos da base de dados
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        Sorts.countingNegative(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }
    
    public static void runTimeCountingPositive(String nomeBaseDeDados, int quantidade ) { //  Lembrar de tirar o números negativos da base de dados
        // Inicialização de Variáveis
        double memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;
        Dados dados = new Dados(nomeBaseDeDados, quantidade);
        Runtime runtime = Runtime.getRuntime();
        
        // Limpando o coletor do lixo 
        System.gc(); 

        // Medindo o tempo de execução e consumo de memória do algoritmo
        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        
        Sorts.countingPositive(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000_000;
        memoriaGasta = ((memoriaFinal - memoriaInicial) / (1_024 * 1_024));

        System.out.printf("Duracao: %.4f ms%n" + "Consumo de Memoria: %.4f mb%n", duracaoMiliSegundos, memoriaGasta);
    }

    public static void execucoesQuickSortHoare() {
        for(int i = 0; i < 10; i++){
            // QUICK SORT 1M
            System.out.println("QUICK SORT 1M HOARE CONSTANTE: ");
            runTimeQuickSortHoare("test-array-1M-constante" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT 1M HOARE CRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-crescente" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT 1M HOARE DECRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-decrescente" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT 1M HOARE DESORDENADO 10 FINAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT 1M HOARE DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT 1M HOARE DESORDENADO: ");
            runTimeQuickSortHoare("test-array-1M-desordenado" , 1_000_000);
            System.out.println();

            // QUICK SORT 2M
            System.out.println("QUICK SORT HOARE 2M CONSTANTE: ");
            runTimeQuickSortHoare("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 2M CRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 2M DECRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-decrescente" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 2M DESORDENADO 10 FINAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 2M DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 2M DESORDENADO: ");
            runTimeQuickSortHoare("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // QUICK SORT 3M
            System.out.println("QUICK SORT HOARE 3M CONSTANTE: ");
            runTimeQuickSortHoare("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 3M CRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 3M DECRESCENTE: ");
            runTimeQuickSortHoare("test-array-1M-decrescente" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 3M DESORDENADO 10 FINAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 3M DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortHoare("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT HOARE 3M DESORDENADO: ");
            runTimeQuickSortHoare("test-array-1M-desordenado" , 3_000_000);
            System.out.println();
        }
    }
    
    public static void execucoesMergeSort() {
        for(int i = 0; i < 10; i++){    // para um desempenho melhor do algoritmo esse for nem devia ta aqui, mas tô com preguiça de copiar e colar 10 vezes
            // MERGE SORT 1M
            System.out.println("MERGE SORT 1M CONSTANTE: ");
            runTimeMergeSort("test-array-1M-constante" , 1_000_000);
            System.out.println();
            System.out.println("MERGE SORT 1M CRESCENTE: ");
            runTimeMergeSort("test-array-1M-crescente" , 1_000_000);
            System.out.println();
            System.out.println("MERGE SORT 1M DECRESCENTE: ");
            runTimeMergeSort("test-array-1M-decrescente" , 1_000_000);
            System.out.println();
            System.out.println("MERGE SORT 1M DESORDENADO 10 FINAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            System.out.println();
            System.out.println("MERGE SORT 1M DESORDENADO 10 INICIAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            System.out.println();
            System.out.println("MERGE SORT 1M DESORDENADO: ");
            runTimeMergeSort("test-array-1M-desordenado" , 1_000_000);
            System.out.println();

            // MERGE SORT 2M
            System.out.println("MERGE SORT 2M CONSTANTE: ");
            runTimeMergeSort("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("MERGE SORT 2M CRESCENTE: ");
            runTimeMergeSort("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("MERGE SORT 2M DECRESCENTE: ");
            runTimeMergeSort("test-array-1M-decrescente" , 2_000_000);
            System.out.println();
            System.out.println("MERGE SORT 2M DESORDENADO 10 FINAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("MERGE SORT 2M DESORDENADO 10 INICIAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("MERGE SORT 2M DESORDENADO: ");
            runTimeMergeSort("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // MERGE SORT 3M
            System.out.println("MERGE SORT 3M CONSTANTE: ");
            runTimeMergeSort("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("MERGE SORT 3M CRESCENTE: ");
            runTimeMergeSort("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("MERGE SORT 3M DECRESCENTE: ");
            runTimeMergeSort("test-array-1M-decrescente" , 3_000_000);
            System.out.println();
            System.out.println("MERGE SORT 3M DESORDENADO 10 FINAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("MERGE SORT 3M DESORDENADO 10 INICIAIS: ");
            runTimeMergeSort("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("MERGE SORT 3M DESORDENADO: ");
            runTimeMergeSort("test-array-1M-desordenado" , 3_000_000);
            System.out.println();
        }
    }
    
    public static void execucoesQuickSortLomuto() { // StackOverFlow????
           // QUICK SORT LOMUTO 1M
            System.out.println("QUICK SORT LOMUTO 1M CONSTANTE: ");
            runTimeQuickSortLomuto("test-array-1M-constante" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 1M CRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-crescente" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 1M DECRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-decrescente" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 1M DESORDENADO 10 FINAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 1M DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 1M DESORDENADO: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado" , 1_000_000);
            System.out.println();

            // QUICK SORT LOMUTO 2M
            System.out.println("QUICK SORT LOMUTO 2M CONSTANTE: ");
            runTimeQuickSortLomuto("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 2M CRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 2M DECRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-decrescente" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 2M DESORDENADO 10 FINAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 2M DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 2M DESORDENADO: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // QUICK SORT LOMUTO 3M
            System.out.println("QUICK SORT LOMUTO 3M CONSTANTE: ");
            runTimeQuickSortLomuto("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 3M CRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 3M DECRESCENTE: ");
            runTimeQuickSortLomuto("test-array-1M-decrescente" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 3M DESORDENADO 10 FINAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 3M DESORDENADO 10 INICIAIS: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("QUICK SORT LOMUTO 3M DESORDENADO: ");
            runTimeQuickSortLomuto("test-array-1M-desordenado" , 3_000_000);
            System.out.println();
    }
    
    public static void execucoesBubbleSort() { 

            // // BUBBLE SORT 1M
            // System.out.println("BUBBLE SORT 1M CONSTANTE: ");
            // runTimeBubbleSort("test-array-1M-constante" , 1_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 1M CRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-crescente" , 1_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 1M DECRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-decrescente" , 1_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 1M DESORDENADO 10 FINAIS: ");
            // runTimeBubbleSort("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 1M DESORDENADO 10 INICIAIS: ");
            // runTimeBubbleSort("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 1M DESORDENADO: ");
            // runTimeBubbleSort("test-array-1M-desordenado" , 1_000_000);
            // System.out.println();

            // // BUBBLE SORT 2M
            // System.out.println("BUBBLE SORT 2M CONSTANTE: ");
            // runTimeBubbleSort("test-array-1M-constante" , 2_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 2M CRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-crescente" , 2_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 2M DECRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-decrescente" , 2_000_000);
            // System.out.println();
            System.out.println("BUBBLE SORT 2M DESORDENADO 10 FINAIS: ");
            runTimeBubbleSort("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 2M DESORDENADO 10 INICIAIS: ");
            // runTimeBubbleSort("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 2M DESORDENADO: ");
            // runTimeBubbleSort("test-array-1M-desordenado" , 2_000_000);
            // System.out.println();

            // // BUBBLE SORT 3M
            // System.out.println("BUBBLE SORT 3M CONSTANTE: ");
            // runTimeBubbleSort("test-array-1M-constante" , 3_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 3M CRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-crescente" , 3_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 3M DECRESCENTE: ");
            // runTimeBubbleSort("test-array-1M-decrescente" , 3_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 3M DESORDENADO 10 FINAIS: ");
            // runTimeBubbleSort("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 3M DESORDENADO 10 INICIAIS: ");
            // runTimeBubbleSort("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            // System.out.println();
            // System.out.println("BUBBLE SORT 3M DESORDENADO: ");
            // runTimeBubbleSort("test-array-1M-desordenado" , 3_000_000);
            // System.out.println();  
    }
    
    public static void execucoesInsertionSort() { 
            // INSERTION SORT 1M
            System.out.println("INSERTION SORT 1M CONSTANTE: ");
            runTimeInsertionSort("test-array-1M-constante" , 1_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 1M CRESCENTE: ");
            runTimeInsertionSort("test-array-1M-crescente" , 1_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 1M DECRESCENTE: ");
            runTimeInsertionSort("test-array-1M-decrescente" , 1_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 1M DESORDENADO 10 FINAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 1M DESORDENADO 10 INICIAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 1M DESORDENADO: ");
            runTimeInsertionSort("test-array-1M-desordenado" , 1_000_000);
            System.out.println();

            // INSERTION SORT 2M
            System.out.println("INSERTION SORT 2M CONSTANTE: ");
            runTimeInsertionSort("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 2M CRESCENTE: ");
            runTimeInsertionSort("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 2M DECRESCENTE: ");
            runTimeInsertionSort("test-array-1M-decrescente" , 2_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 2M DESORDENADO 10 FINAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 2M DESORDENADO 10 INICIAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 2M DESORDENADO: ");
            runTimeInsertionSort("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // INSERTION SORT 3M
            System.out.println("INSERTION SORT 3M CONSTANTE: ");
            runTimeInsertionSort("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 3M CRESCENTE: ");
            runTimeInsertionSort("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 3M DECRESCENTE: ");
            runTimeInsertionSort("test-array-1M-decrescente" , 3_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 3M DESORDENADO 10 FINAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 3M DESORDENADO 10 INICIAIS: ");
            runTimeInsertionSort("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("INSERTION SORT 3M DESORDENADO: ");
            runTimeInsertionSort("test-array-1M-desordenado" , 3_000_000);
            System.out.println();  
    }
    
    public static void execucoesSelectionSort() { 
            // // SELECTION SORT 1M
            // System.out.println("SELECTION SORT 1M CONSTANTE: ");
            // runTimeSelectionSort("test-array-1M-constante" , 1_000_000);
            // System.out.println();
            // System.out.println("SELECTION SORT 1M CRESCENTE: ");
            // runTimeSelectionSort("test-array-1M-crescente" , 1_000_000);
            // System.out.println();
            // System.out.println("SELECTION SORT 1M DECRESCENTE: ");
            // runTimeSelectionSort("test-array-1M-decrescente" , 1_000_000);
            // System.out.println();
            // System.out.println("SELECTION SORT 1M DESORDENADO 10 FINAIS: ");
            // runTimeSelectionSort("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            // System.out.println();
            // System.out.println("SELECTION SORT 1M DESORDENADO 10 INICIAIS: ");
            // runTimeSelectionSort("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            // System.out.println();
            // System.out.println("SELECTION SORT 1M DESORDENADO: ");
            // runTimeSelectionSort("test-array-1M-desordenado" , 1_000_000);
            // System.out.println();

            // SELECTION SORT 2M
            System.out.println("SELECTION SORT 2M CONSTANTE: ");
            runTimeSelectionSort("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 2M CRESCENTE: ");
            runTimeSelectionSort("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 2M DECRESCENTE: ");
            runTimeSelectionSort("test-array-1M-decrescente" , 2_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 2M DESORDENADO 10 FINAIS: ");
            runTimeSelectionSort("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 2M DESORDENADO 10 INICIAIS: ");
            runTimeSelectionSort("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 2M DESORDENADO: ");
            runTimeSelectionSort("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // SELECTION SORT 3M
            System.out.println("SELECTION SORT 3M CONSTANTE: ");
            runTimeSelectionSort("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 3M CRESCENTE: ");
            runTimeSelectionSort("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 3M DECRESCENTE: ");
            runTimeSelectionSort("test-array-1M-decrescente" , 3_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 3M DESORDENADO 10 FINAIS: ");
            runTimeSelectionSort("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 3M DESORDENADO 10 INICIAIS: ");
            runTimeSelectionSort("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("SELECTION SORT 3M DESORDENADO: ");
            runTimeSelectionSort("test-array-1M-desordenado" , 3_000_000);
            System.out.println();  
    }
    
    public static void execucoesCountingNegative() { 
            // COUNTING SORT 1M
            System.out.println("COUNTING SORT 1M DESORDENADO 10 FINAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10finais" , 1_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 1M DESORDENADO 10 INICIAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10iniciais" , 1_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 1M DESORDENADO: ");
            runTimeCountingNegative("test-array-1M-desordenado" , 1_000_000);
            System.out.println();

            // COUNTING SORT 2M
            System.out.println("COUNTING SORT 2M DESORDENADO 10 FINAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10finais" , 2_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 2M DESORDENADO 10 INICIAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10iniciais" , 2_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 2M DESORDENADO: ");
            runTimeCountingNegative("test-array-1M-desordenado" , 2_000_000);
            System.out.println();

            // COUNTING SORT 3M
            System.out.println("COUNTING SORT 3M DESORDENADO 10 FINAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10finais" , 3_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 3M DESORDENADO 10 INICIAIS: ");
            runTimeCountingNegative("test-array-1M-desordenado-nos-10iniciais" , 3_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 3M DESORDENADO: ");
            runTimeCountingNegative("test-array-1M-desordenado" , 3_000_000);
            System.out.println();  
    }
    
    public static void execucoesCountingPositive() { 
            // COUNTING SORT 1M
            System.out.println("COUNTING SORT 1M CONSTANTE: ");
            runTimeCountingPositive("test-array-1M-constante" , 1_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 1M CRESCENTE: ");
            runTimeCountingPositive("test-array-1M-crescente" , 1_000_000);
            System.out.println();   
            System.out.println("COUNTING SORT 1M DECRESCENTE: ");
            runTimeCountingPositive("test-array-1M-decrescente" , 1_000_000);
            System.out.println();

            // COUNTING SORT 2M
            System.out.println("COUNTING SORT 2M CONSTANTE: ");
            runTimeCountingPositive("test-array-1M-constante" , 2_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 2M CRESCENTE: ");
            runTimeCountingPositive("test-array-1M-crescente" , 2_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 2M DECRESCENTE: ");
            runTimeCountingPositive("test-array-1M-decrescente" , 2_000_000);
            System.out.println();

            // COUNTING SORT 3M
            System.out.println("COUNTING SORT 3M CONSTANTE: ");
            runTimeCountingPositive("test-array-1M-constante" , 3_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 3M CRESCENTE: ");
            runTimeCountingPositive("test-array-1M-crescente" , 3_000_000);
            System.out.println();
            System.out.println("COUNTING SORT 3M DECRESCENTE: ");
            runTimeCountingPositive("test-array-1M-decrescente" , 3_000_000);
            System.out.println(); 
    }

    public static void main(String[] args) {
        execucoesQuickSortLomuto();
    }
}
