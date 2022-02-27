package com.nicochess;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    byte age = 20;
        long viewsCount = 3_321_123_231L;
        float price = 10.90F;
        char letter = 'A';
        boolean isGreen = true;

        String name = "Nicolas Magno";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.endsWith("Magno"));
        System.out.println(name.indexOf("o"));
        System.out.println(name.replace("Magno", "Silva"));
        System.out.println(name.toLowerCase());
        Date now = new Date();
        System.out.println(now);

        int[] numbers = {2, 5, 7, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [][] matrix = new int[3][4];
        System.out.println(Arrays.deepToString(matrix));

        final float PI = 3.14F;

        int result =  3 + 7;
        System.out.println(result);
        
        int random = (int) (Math.random() * 100);
        System.out.println(random);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(2130.32);
        System.out.println(currencyResult);

        Scanner scan = new Scanner(System.in);
        System.out.print("What's your name? ");
        String username = scan.nextLine();
        System.out.println("Nice to meet you " + username);
    }
}
