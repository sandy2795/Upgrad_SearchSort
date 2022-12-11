package org.example;
/*
Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order.
Do not print anything when the element is not present in the given array.
Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.
*/
import java.util.Arrays;
import java.util.Scanner;
class LinerSearchExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int [] array= new int[count];
        int temp;
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //write your code here
        Arrays.sort(array);
        for(int i = 0;i<count;i++){
            for(int j = i+1;j<count;j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<count;i++){System.out.print(array[i]+" ");}
        for(int i=0;i<count;i++){
            if(key == array[i]){
                System.out.println("op:"+i);
                return;
            } }
    }
}
