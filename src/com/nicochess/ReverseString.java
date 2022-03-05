package com.nicochess;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String newWord = "";
        for(int counter = arr.length - 1; counter >= 0; counter--){
            newWord += arr[counter];
        }

        System.out.println(newWord);
    }
}
