package org.example;

import java.util.*;
class BinarySearchExample {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int l = 0,res=0,r=inputArr.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(key == inputArr[mid]){
                break;
            } else if (key > inputArr[mid]) {
                l=mid+1;
                res++;
            }
            else{
                r = mid -1;
                res++;
            }
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        BinarySearchExample bs = new BinarySearchExample();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
