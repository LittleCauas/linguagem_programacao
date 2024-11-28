package aula03listaswitchcase1;

import utils.Util;

//Escreva um programa em Java que solicite ao usuário um número de 1 a 4 e,
// com base nesse número, exiba o quadrante correspondente no plano cartesiano:
//1: Primeiro quadrante (x positivo, y positivo)
//2: Segundo quadrante (x negativo, y positivo)
//3: Terceiro quadrante (x negativo, y negativo)
//4: Quarto quadrante (x positivo, y negativo)
//Caso o número inserido esteja fora do intervalo de 1 a 4, exiba a mensagem “Número inválido”.
public class Exerc05 {
    public static void main(String[] args) {
        int numero = Util.inputInt("Digite um número de 1 a 4: ");
        switch (numero) {
            case 1:
                System.out.println("Primeiro quadrante (x positivo, y positivo)");
                break;
            case 2:
                System.out.println("Segundo quadrante (x negativo, y positivo)");
                break;
            case 3:
                System.out.println("Terceiro quadrante (x negativo, y negativo)");
                break;
            case 4:
                System.out.println("Quarto quadrante (x positivo, y negativo)");
                break;
            default:
                System.out.println("Número inválido");
                break;
            }
        }

    }

