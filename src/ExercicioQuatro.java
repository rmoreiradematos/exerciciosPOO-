import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ExercicioQuatro {
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCICIOS - LISTA 3 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Tabuada com Arquivo                               |");
        System.out.println("| 2 - Ler e imprimir arquivo de texto                   |");
        System.out.println("| 3 - Operações básicas com a Main                      |");
        System.out.println("| 4 - Exponenciação com Precisão Arbitrária             |");
        System.out.println("| 5 - Nome aleatório de 5 pessoas                       |");
        System.out.println("| 6 - Calcular Raio e Area                              |");
        System.out.println("| 7 - Avaliar se TXT tem JAVA                           |");
        System.out.println("| 8 - 10 primeiros dígitos                              |");
        System.out.println("| 9 - Area com a Main                                   |");
        System.out.println("| 10 - Receba nome de arquivo na Main com valores       |");
        System.out.println("| 11 - Ler e imprimir arquivo de texto                  |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
            case 1:
                // calculaMedia(double[] notas)
                break;
            // 2) Crie um programa que imprima um arrays com Foreach.
            case 2:
                // printArray(new String[]{ "Teste", "imprimir", "foreach" });
                break;
            // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
            case 3:
                // dezValores(double[] valores);
                break;
            // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
            case 4:
                // dezValoresInt(int[] valores);
                break;
            // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
            case 5:
                // baralho();
                break;
            // 6) Crie um programa que una duas listas de inteiros.
            case 6:
                // mergeIntList(int[] listaUm, int[] listaDois);
                break;
            // 7) Crie um programa que simule a fila de atendimento de um banco.
            case 7:
                // filaBanco();
                break;
            // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
            case 8:
                // double temperaturaMedia(double[] temperaturas);
                break;
            // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
            case 9:
                // alterarArray(int[] listaUm, int[] listaDois);
                break;
            // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
            case 10:
                // mediaVinte(int[] valores);
                break;
            // DESAFIO
            case 11:
                // detetive();
                break;
        
            default:
                System.out.println("Operação inválida");
                break;
        }
    }   

    // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
    public static double calculaMedia(double[] notas) {
        System.out.println("Quantas notas serão fornecidas?");
        Scanner scanner = new Scanner(System.in);
        int quantidadeNotas = scanner.nextInt();
        double[] arrayNotas= new double[quantidadeNotas];
        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite a nota " + (i + 1));
            arrayNotas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        return soma;
    }
    // 2) Crie um programa que imprima um arrays com Foreach.
    public static void printArray(String[] array) {
        for(String item : array) {
            System.out.println(item);
        }
    }
    // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
    public static void dezValores(double[] valores) {
        double valor = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Digite o valor " + (i+1));
            valor = scanner.nextDouble();
            valores[i] = valor;
        }
        scanner.close();
        for(int i = 0; i<10; i++){
            System.out.println("Valor " + (i+1) + ": " + valores[i]);
        }

    }
    // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
    public static void dezValoresInt(int[] valores) {
        int valor = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Digite o valor " + (i+1));
            valor = scanner.nextInt();
            valores[i] = valor;
        }
        scanner.close();
        for(int i = 0; i<10; i++){
            if(valores[i] % 2 == 0){
                System.out.println("Valor " + (i+1) + ": " + valores[i] + " é par");
            } else {
                System.out.println("Valor " + (i+1) + ": " + valores[i] + " é ímpar");
            }
        }
    }
    // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imprima elas.
    public static SortedSet<String> baralho() {
        TreeSet<String> baralho = new TreeSet<String>();
        String[] naipes = {"Paus", "Copas", "Ouros", "Espadas"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(valor + " de " + naipe);
            }
        }
        for(String carta : baralho) {
            System.out.println(carta);
        }
        return baralho;
    }
    // 6) Crie um programa que una duas listas de inteiros.
    public static Integer[] mergeIntList(int[] listaUm, int[] listaDois) {
        Integer[]  listaTres = new Integer[listaUm.length + listaDois.length];
        for(int i = 0; i < listaUm.length; i++) {
            listaTres[i] = listaUm[i];
        }
        for(int i = 0; i < listaDois.length; i++) {
            listaTres[i + listaUm.length] = listaDois[i];
        }
        return listaTres;
    }
    // 7) Crie um programa que simule a fila de atendimento de um banco.
    public static void filaBanco() {
        
    }
    // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
    public static double temperaturaMedia(double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.length;

    }
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
    public static int[] alternarArray(int[] listaUm, int[] listaDois) {
        int[] listaTres = new int[listaUm.length + listaDois.length];
        int k = 0;
        for(int i =0; i < listaUm.length; i++) {
            listaTres[k++] = listaUm[i];
        }
        for(int i =0; i < listaUm.length; i++) {
            listaTres[k++] = listaDois[i];
            k++;
        }

        return listaTres;
    }
    // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
    public static void mediaVinte(int[] valores) {
        int[] valoresInferiores = new int[valores.length];
        int soma = 0;
        int k = 0;
        for(int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;
        for(int i = 0; i < valores.length; i++) {
            if(valores[i] < media) {
                valoresInferiores[k++] = valores[i];
            }
        }
        for(int i = 0; i < valoresInferiores.length; i++) {
            System.out.println(valoresInferiores[i]);
        }
    }

    public static void detetive() {
        
    }
}
