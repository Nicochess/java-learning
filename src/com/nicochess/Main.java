package com.nicochess;

import java.text.DecimalFormat;
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

        int[] numbers = {2, 5, 7, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [][] matrix = new int[3][4];
        System.out.println(Arrays.deepToString(matrix));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(2130.32);
        System.out.println(currencyResult);

        Scanner scanning = new Scanner(System.in);
        DecimalFormat pattern = new DecimalFormat("#.##");

        System.out.print("Qual sua altura? (m): ");
        double height = scanning.nextDouble();

        System.out.print("Qual seu peso? (Kg): ");
        float weight = scanning.nextFloat();

        double imc = weight / Math.pow(height, height);


        System.out.println("O seu IMC é " + pattern.format(imc));
    }
}
