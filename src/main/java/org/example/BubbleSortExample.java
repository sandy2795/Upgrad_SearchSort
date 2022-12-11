package org.example;

import java.util.Scanner;
//class Source{
class BubbleSortExample{
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        boolean isDone;
        for (int k = 0; k < ( size-1 ); k++) {
            isDone=true;
            for (int j = 0; j < size-k-1; j++) {
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    totalSwaps++;

                }
            }
            if(isDone){
                break;
            }
        }
       // return array;
        return totalSwaps;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result:"+totalBubbleSortSwaps(array, m));
    }
}
