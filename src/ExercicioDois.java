import java.util.Scanner;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCICIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
                // calculaMedia(double notaUm, double notaDois, double notaTres);
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                // qualMes(int mes);
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                // letraALetra(String palavra);
                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                // numerosImpares();
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                // imc(double altura, double peso);
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) / 3;
    }

    public static String qualMes(int mes) {
        if(mes == 1) {
            return "Janeiro";
        } else if(mes == 2) {
            return "Fevereiro";
        } else if(mes == 3) {
            return "Março";
        } else if(mes == 4) {
            return "Abril";
        } else if(mes == 5) {
            return "Maio";
        } else if(mes == 6) {
            return "Junho";
        } else if(mes == 7) {
            return "Julho";
        } else if(mes == 8) {
            return "Agosto";
        } else if(mes == 9) {
            return "Setembro";
        } else if(mes == 10) {
            return "Outubro";
        } else if(mes == 11) {
            return "Novembro";
        } else if(mes == 12) {
            return "Dezembro";
        } else {
            return "Mês inválido";
        }
        
    }

    public static int[] tabuada(int numero) {
        int[] tabuada = new int[11];
        int j = 1;
        for(int i = 0; i < tabuada.length; i++) {
            tabuada[i] = numero * j;
            j++;
        }
        return tabuada;
    }

    public static char[] letraALetra(String palavra) {
        char[] letras = new char[palavra.length()];
        for(int i = 0; i < palavra.length(); i++) {
            letras[i] = palavra.charAt(i);
            System.out.println(letras[i]);
        }
        return letras;
    }

    public static int numerosImpares() {
        int soma = 0;
        for(int i = 0; i < 500; i++) {
            if(i % 2 != 0 && i % 7 == 0 && i%500 == 0) {
                soma += i;
            }
        }
        return soma;
    }

    public static double calculaMedia(double[] notas) {
        double media = 0;
        for(int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media / notas.length;
    }

    public static int fatorial(int numero) {
        int fatorial = 1;
        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static double imc(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        double resultado = 0;
        switch(operacao) {
            case '+':
                resultado = valorUm + valorDois;
                break;
            case '-':
                resultado = valorUm - valorDois;
                break;
            case '*':
                resultado = valorUm * valorDois;
                break;
            case '/':
                resultado = valorUm / valorDois;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        return resultado;
    }

    public static int[] notasNecessarias(int valor) {
        int[] notas = new int[6];
        int[] valores = {200, 100, 50, 10, 5, 1};
        for(int i = 0; i < notas.length; i++) {
            notas[i] = valor / valores[i];
            valor = valor % valores[i];
        }
        return notas;
    }
}
