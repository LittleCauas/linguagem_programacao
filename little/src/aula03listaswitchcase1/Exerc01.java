package aula03listaswitchcase1;

//Escreva um programa em Java que solicite ao usuário um número de 1 a 7 e, com base nesse número,
// exiba o dia da semana correspondente. Por exemplo, se o número for 1, o programa deve exibir
// “Domingo”, se for 2, “Segunda-feira”, e assim por diante. Caso o número esteja fora do intervalo
// de 1 a 7, exiba a mensagem “Número inválido”.

import utils.Util;

public class Exerc01 {
    public static void main(String[] args) {

        int numero = Util.inputInt("Digite um número de 1 a 7: ");

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}