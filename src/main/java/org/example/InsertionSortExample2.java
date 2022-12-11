package org.example;

import java.util.Scanner;

class InsertionSortExample2 {



    public static void main (String ss[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        //Write your code here
        // For FirstName
        String tem = "";
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (firstNames[i].compareToIgnoreCase(firstNames[j]) > 0) {
                    tem = firstNames[i];
                    firstNames[i] = firstNames[j];
                    firstNames[j] = tem;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(firstNames[i]);
        }

        //For LastName
        String tem2 = "";
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (lastNames[j].compareToIgnoreCase(lastNames[i]) > 0) {
                    tem2 = lastNames[j];
                    lastNames[j] = lastNames[i];
                    lastNames[i] = tem2;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(lastNames[i]);
        }

    }
}
