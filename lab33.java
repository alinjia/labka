package com.example.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class lab33 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<Double> rr = new ArrayList<>();
            System.out.println("Введите элементы, после чего введите quit для дальнейшей работы");
            do{
                double input = Double.parseDouble(in.nextLine());
                rr.add(input);
            }while (!in.hasNext("quit"));
            System.out.print("Исходный массив: ");
            for (double elements : rr)
                System.out.print(elements + " ");
            System.out.println();
            System.out.print("Полученный массив: ");
            System.out.print(rr.get(0)+" ");
            for (int i = 0; i < rr.size()-1; i++) {
                if(rr.get(i)<rr.get(i+1)){
                    System.out.print(rr.get(i+1) + " ");
                }
            }
            in.close();
        }
    }

