package tehniki;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m){
                found = true;
                System.out.println(i);
            }
        }
        if (!found){
            System.out.println("Ne postoi");
        }
    }
}
