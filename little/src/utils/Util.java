package utils;

import java.util.Scanner;

public class Util {
    public static int inputInt(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.print(mensagem);
        return s.nextInt();
    }
    public static float inputFloat(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.print(mensagem);
        return s.nextFloat();
    }
    public static boolean inputSimNao(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.print(mensagem + " (S/N) ");
        return s.next().equalsIgnoreCase("S");
    }
    public static String solicitarPalavraLower(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.print(mensagem);
        return s.next().toLowerCase();
    }
    public static char solicitarCharLower(String mensagem) {
        Scanner s = new Scanner(System.in);
        System.out.print(mensagem);

        return Character.toLowerCase(s.next().charAt(0));
    }
}
