package org.example;

import java.util.Scanner;
//class Source {
class InsertionSortExample{
    //Write your code here
    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]<v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
    }

    public static void main(String[] args) {
        //int arr[] = {7,1,0,9,5,13};
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        insertSort(array);
        //System.out.println("Sorted array");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}


