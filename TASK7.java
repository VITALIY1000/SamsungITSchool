package ua.com.samsungitschool;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] array = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        printMaxOfArray(array);
    }

    static void printMaxOfArray(int[] array) {
    	int tmp = 0;
        
        for (int i = 0; i < array.length; i++) {
        	tmp = Math.max(array[i], tmp);
        }
        
        System.out.println(tmp);
    }
}