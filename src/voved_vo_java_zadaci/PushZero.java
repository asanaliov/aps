package voved_vo_java_zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class PushZero {
    static void pushZerosToBeginning(int arr[], int n) {
        int insertPosition = n - 1;
        for (int i = n - 1; i >= 0 ; i--) {
            if (arr[i] != 0){
                arr[insertPosition] = arr[i];
                insertPosition --;
            }
        }
        while (insertPosition >= 0){
            arr[insertPosition] = 0;
            insertPosition --;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        pushZerosToBeginning(arr, n);

        System.out.println("Transformiranata niza e:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
