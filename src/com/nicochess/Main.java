package com.nicochess;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, "Olá, "+name);

        while (true){
            int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

            if (number == 0)
                break;
            else if (number % 5 == 0 && number % 3 == 0)
                JOptionPane.showMessageDialog(null,"FizzBuzz");
            else if (number % 5 == 0)
                JOptionPane.showMessageDialog(null,"Fizz");
            else if (number % 3 == 0)
                JOptionPane.showMessageDialog(null,"Buzz");
            else
                JOptionPane.showMessageDialog(null, number);
        }

        ArrayList<String> foods = new ArrayList<String>();

        foods.add("maça");
        foods.add("batata");

        System.out.println(foods);

        Car myCar = new Car();
        System.out.println(myCar.color);

        Human mySelf = new Human("Nicolas", 20, 65);
    }

    static void userId(String name, Integer age){
        JOptionPane.showMessageDialog(null, "Oi, sou "+name+"e tenho "+age);
    }
}
