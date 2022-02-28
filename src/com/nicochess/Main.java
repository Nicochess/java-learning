package com.nicochess;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Number: ");
            int number = input.nextInt();

            if (number == 0)
                break;
            else if (number % 5 == 0 && number % 3 == 0)
                System.out.println("FizzBuzz");
            else if (number % 5 == 0)
                System.out.println("Fizz");
            else if (number % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(number);
        }
    }
}
