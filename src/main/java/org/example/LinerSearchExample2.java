package org.example;

import java.util.*;

//class Source
class LinerSearchExample2{
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int size = inputArr.length;
        for (int i = 0; i < size; i++) {
            if (inputArr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)throws Exception {
        LinerSearchExample2 ls = new LinerSearchExample2();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(ls.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}
