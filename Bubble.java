package ru.sonic;


public class Bubble {
    public static void main(String[] args) {
        String arr[] = {"Hi", "hatty", "you", "are", "well", "come", "to", "my", "smoke", "freak"};
        printArr(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
        printArr(arr);
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArr(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}