package tehniki;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] lights = new int[n];

        for (int i = 0; i < n; i++) {
            lights[i] = scanner.nextInt();
        }

        int covered = 0;
        int i = 0;
        int counter = 0;

        while (covered < m && i < n){
            int bestPlacement = -1;

            while (i < n && lights[i] <= covered + 3){
                bestPlacement = lights[i] + 2;
                i++;
            }
            if (bestPlacement == -1) break;

            counter ++;
            covered = bestPlacement;
        }

        System.out.println(counter);


    }
}
