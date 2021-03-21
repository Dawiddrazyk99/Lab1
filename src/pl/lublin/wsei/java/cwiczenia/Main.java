//Zadanie 10f
package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj liczby, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            if ((num1 == 0) || (num2 == 0))
                break;

            int suma = num1 + num2;
            String sumaString = Integer.toString(suma);

            char character = '0';
            int charWidth = 8;

            System.out.printf("Wynik dodawania %d + %d:%n", num1, num2);
            System.out.println("DEC: " + leftPad(sumaString, character, charWidth));
            System.out.println("HEX: " + leftPad(Integer.toHexString(suma).toUpperCase(), character, charWidth));
            System.out.println("BIN: " + leftPad(Integer.toBinaryString(suma), character, charWidth));
        } while (true);
    }

    private static String leftPad(String aText, char aChar, int aWidtch)
    {
        String res  = aText;
        for (int i = 0; i < aWidtch - aText.length(); i++ )
            res =aChar + res;

        return  res;
    }

}