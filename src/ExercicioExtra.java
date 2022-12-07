import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ExercicioExtra {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCICIOS - LISTA EXTRA ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 01 - Palindromo                                       |");
        System.out.println("| 02 - Juros                                            |");
        System.out.println("| 03 - Fibonacci                                        |");
        System.out.println("| 04 - Inteiro para Binário                             |");
        System.out.println("| 05 - Tabuada e Sequencia                              |");
        System.out.println("| 06 - Data de Nascimento (Anos, Meses, Dias)           |");
        System.out.println("| 07 - Número Sorteado                                  |");
        System.out.println("| 08 - Pirâmide                                         |");
        System.out.println("| 09 - Sexo e Idade                                     |");
        System.out.println("| 10 - Adivinhar Número                                 |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Escreva um programa que determine se uma cadeia de caracteres é um palíndromo ou não. Um palíndromo é uma cadeia que é igual à sua inversa.
            case 1:
                // palindromo(String palavra) 
                break;
                          
            case 2:
                // juros(double p, double a, double i);
                break;
            // 3) Escreva um programa que carregue um carregue um número inteiro pelo teclado e indique se ele faz parte da sequência de Fibonacci.
            case 3:
                // isFibonacci(int number);
                break;
            case 4:
                // toBinary(int number);
                break;
           
            case 5:
                // tabuadaESequencia(int number);
                // tabuadaESequencia(int first, int last)
                break;
            case 6:
                // printDataDeNascimento(Date dataNascimento);
                break;
            case 7:
                // sortNumber(int min, int max
                break;
           
            case 8:
                // piramid(int number);
                break;
            // 9) Escreva um programa que pergunte o sexo e a idade de uma lista indeterminada de pessoas. O usuário deverá informar a quantidade de pessoas e ao final deverá imprimir a quantidade de homens e mulheres maiores e menores de idade
            case 9:
                // countPessoas()
                break;
            // 10) Escreva um programa que sorteie um número de 0 a 100 e que permita tentar acertar este número, o programa só irá parar ao acertar. A cada tentativa, deverá exibir se o número é maior ou menor do que o informado.
            case 10:
                // sortNumber();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }
    
    public static boolean palindromo(String palavra) {
        return false;
    }

    public static ArrayList<Double[]> juros(double p, double a, double i) throws Exception {
        return new ArrayList<Double[]>();
    }

    public static boolean isFibonacci(int number) {
        return false;
    }

    public static String toBinary(int number) {
        return "";
    }

    public static void tabuadaESequencia(int number) {
        
    }

    public static void tabuadaESequencia(int first, int last) {
        
    }

    public static int[] printDataDeNascimento(Date dataNascimento) {
        return new int[3];

    }

    public static int sortNumber(int min, int max) {
        return -1;
    }

    public static void piramid(int number) {
        
    }

    public static void countPessoas() {
        
    }

    public static void sortNumber() {
        
    }
}
