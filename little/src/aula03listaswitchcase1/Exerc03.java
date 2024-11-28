package aula03listaswitchcase1;

import utils.Util;

//Escreva um programa em Java que solicite ao usuário um número de 1 a 12 e,
// com base nesse número, exiba o nome do mês correspondente.
// Por exemplo, se o número for 1, o programa deve exibir “Janeiro”, se for 2, “Fevereiro”,
// e assim por diante. Caso o número esteja fora do intervalo de 1 a 12, exiba a mensagem “Número inválido”.
public class Exerc03 {
    public static void main(String[] args) {
        int numero = Util.inputInt("Digite um número inteiro: ");

        switch (numero) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
