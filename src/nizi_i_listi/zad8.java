package nizi_i_listi;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            list.insertLast(number);
        }

        int k = scanner.nextInt();

        int size = list.getSize();
        k = k % size;

        for (int i = 0; i < k; i++) {
            DLLNode<Integer> first = list.getFirst();
            list.deleteFirst();
            list.insertLast(first.element);
        }
        System.out.println(list);
    }
}
