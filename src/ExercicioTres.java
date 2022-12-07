import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {
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
            // 1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado em um arquivo de texto.
            case 1:
                // tabuada(int number);
                break;
            // 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.
            case 2:
                // lerArquivoTexto(String arquivo);
                break;
            // 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações básicas com eles.
            case 3:
                // operacoesBasicas(int numeroUm, int numeroDois)
                break;
            // 4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
            case 4:
                // bigIntExpo(BigInteger base, int pow);
                break;
            // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles.
            case 5:
                // aleatorizarPessoas();
                break;
            // 6) Crie um programa que calcule o raio e a área de uma circunferência (`C = 2πr` e `A = π(r²)`).
            case 6:
                // areaECircunferencia(double raio);
                break;
            // 7) Crie um programa que avalie se um arquivo de texto possui a string "JAVA".
            case 7:
                // hasJava(String arquivo);
                break;
            // 8) Crie um programa que leia as linhas de um arquivo e imprima no console apenas os 10 primeiros digitos de cada linha.
            case 8:
                // dezDigitos()
                break;
            // 9) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule a área dos valores (`area = lado1 * lado2`).
            case 9:
                // calculaArea(double numeroUm, double numeroDois);
                break;
            // 10) Crie um programa que receba como entrada da classe Main o nome de um arquivo de texto que contenha valores numéricos e some todos os valores, imprimindo no console a soma.
            case 10:
                // somaValoresArquivo(String arquivo);
                break;
            // ## DESAFIO - Crie um Jogo da Forca com Arquivos de Texto**
            case 11:
                // forcaComTxt();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        
    }

    public static void tabuada(int numero) {
        int resultado = 0;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("tabuada.txt"));
            for (int i = 1; i <= 10; i++) {
                resultado = numero * i;
                writer.write(numero + " x " + i + " = " + resultado);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void lerArquivoTexto(String arquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] operacoesBasicas(int numeroUm, int numeroDois) {
        int[] resultado = new int[4];
        resultado[0] = numeroUm + numeroDois;
        resultado[1] = numeroUm - numeroDois;
        resultado[2] = numeroUm * numeroDois;
        resultado[3] = numeroUm / numeroDois;
        return resultado;
    }

    public static BigInteger bigIntExpo(BigInteger base, int pow) {
        return base.pow(pow);
    }

    public static void aleatorizarPessoas(String pessoas[]) {
        Random random = new Random();
        for (int i = 0; i < pessoas.length; i++) {
            int index = random.nextInt(pessoas.length);
            String temp = pessoas[index];
            pessoas[index] = pessoas[i];
            pessoas[i] = temp;
        }
    }

    public static double[] areaECircunferencia(double raio) {
        double[] resultado = new double[2];
        resultado[0] = 2 * Math.PI * raio;
        resultado[1] = Math.PI * Math.pow(raio, 2);
        return resultado;
    }

    public static boolean hasJava(String arquivo) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha = reader.readLine();
            while (linha != null) {
                if (linha.contains("JAVA")) {
                    return true;
                }
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public static void dezDigitos(String arquivo) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha.substring(0, 10));
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double calculaArea(double numeroUm, double numeroDois) {
        return  numeroUm * numeroDois;
    }

    public static double somaValoresArquivo(String arquivo) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha = reader.readLine();
            double soma = 0;
            while (linha != null) {
                soma += Double.parseDouble(linha);
                linha = reader.readLine();
            }
            reader.close();
            return soma;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    public static void forcaComTxt() {
        String palavra = "";
        String palavraOculta = "";
        String letras = "";
        int tentativas = 0;
        int acertos = 0;
        int erros = 0;
        int maxErros = 6;
        boolean acertou = false;
        boolean enforcou = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("palavras.txt"));
            String linha = reader.readLine();
            while (linha != null) {
                palavra = linha;
                linha = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (int i = 0; i < palavra.length(); i++) {
            palavraOculta += "*";
        }
        while (!acertou && !enforcou) {
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Letras já digitadas: " + letras);
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Erros: " + erros);
            System.out.println("Acertos: " + acertos);
            System.out.println("Digite uma letra: ");
            String letra = new Scanner(System.in).nextLine();
            if (letras.contains(letra)) {
                System.out.println("Você já digitou essa letra!");
                continue;
            } else {
                letras += letra;
            }
            tentativas++;
            boolean temLetra = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    temLetra = true;
                    palavraOculta = palavraOculta.substring(0, i) + letra + palavraOculta.substring(i + 1);
                }
            }
            if (temLetra) {
                acertos++;
            } else {
                erros++;
            }
            acertou = palavraOculta.equals(palavra);
            enforcou = erros == maxErros;
        }
        if (acertou) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você foi enforcado!");
        }
        System.out.println("Fim de jogo!");
    }
}