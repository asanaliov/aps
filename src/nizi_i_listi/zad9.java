package nizi_i_listi;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            list.insertLast(number);
        }

        System.out.println(list);

        int m = scanner.nextInt();
        int k = scanner.nextInt();

        DLLNode<Integer> node = list.getFirst();
        while (node != null && !node.element.equals(m)) {
            node = node.succ;
        }

        if (node != null) {
            int steps = k % list.getSize();

            for (int i = 0; i < steps; i++) {
                if (node.pred != null) {
                    Integer temp = node.element;
                    node.element = node.pred.element;
                    node.pred.element = temp;
                    node = node.pred;
                } else {
                    DLLNode<Integer> current = node;
                    while (current.succ != null) {
                        Integer temp = current.element;
                        current.element = current.succ.element;
                        current.succ.element = temp;
                        current = current.succ;
                    }
                    node = current;
                }
            }
            System.out.println(list);
        }
        else{
            System.out.println("Elementot ne postoi vo listata");
            System.out.println(list);
        }

    }
}
