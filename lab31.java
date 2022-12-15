package com.example.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class lab31 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<Double> Yo = new ArrayList<>();
            System.out.println("Введите элементы, после чего введите quit для дальнейшей работы");
            do{
                double input = Double.parseDouble(in.nextLine());
                Yo.add(input);
            }while (!in.hasNext("quit"));
            System.out.print("Исходный массив: ");
            for (double elements : Yo)
                System.out.print(elements + " ");
            System.out.println();
            System.out.print("Полученный массив: ");
            System.out.print(Yo.get(0)+" ");
            for (int i = 0; i < Yo.size()-1; i++) {
                if(Yo.get(i)<Yo.get(i+1)){
                    System.out.print(Yo.get(i+1) + " ");
                }
            }
            in.close();
        }
    }

