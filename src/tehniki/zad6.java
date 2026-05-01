package tehniki;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> outliers = new LinkedHashMap<>();

        for (int i = 0; i < n - 1; i++) {
           if (arr[i] > arr[i+1]){
               int stray = arr[i+1];
               int z = i;
               int count = 0;

               while (z >= 0 && arr[z] > stray){
                    z--;
                    count++;
               }
               outliers.put(stray, count);
           }
        }


        System.out.println(outliers.size());
        outliers.forEach((key1, value1) -> {
            int key = key1;
            int value = value1;

            System.out.println(key + " " + value);
        });
    }
}
