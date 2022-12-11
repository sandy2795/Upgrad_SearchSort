package org.example;

import java.util.Scanner;

//class Source {
class QuickSortExample{

    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    //Write your code here
    public static int partition(String ar[],int start, int end){
        //String pivot = ar[end];
        int pivot = ar[end].length();
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length()<pivot) {  //.compareToIgnoreCase(pivot)<0  ){
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        String[] words= new String[count];
        for(int i = 0;i<count;i++){
            words[i]=s.next();
        }
        quickSort(words,0,count-1);
        for (int i=0; i<count; ++i) {
            System.out.print(words[i]);
            System.out.println();
        }
    }
}

