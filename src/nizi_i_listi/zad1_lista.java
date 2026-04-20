package nizi_i_listi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zad1_lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> elementsList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            elementsList.add(element);
            sum += element;
        }

        double avg = (double)sum / n;

        System.out.println(elementsList);

        elementsList = elementsList.stream()
                .filter(e -> e >= avg)
                        .collect(Collectors.toList());

        System.out.println(elementsList);

    }
}
