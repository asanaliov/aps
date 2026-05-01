package tehniki;

import java.util.Scanner;
import java.util.stream.IntStream;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] start = new int[1000];
        int[] end = new int[1000];

        int minCapacity = 0;
        int currCapacity = 0;
        IntStream.range(0, n).forEach(i -> {
            start[scanner.nextInt()]++;
            end[scanner.nextInt()]++;
        });

        for (int i = 0; i < end.length; i++) {
            currCapacity += start[i];
            minCapacity = Math.max(minCapacity, currCapacity);
            currCapacity -= end[i];
        }

        System.out.println(minCapacity);
    }
}
