package com.nicochess;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

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

        int[] numbers = new int[5];
        numbers[0] = 3;
        Arrays.toString(numbers);
        System.out.println(numbers);
    }
}
