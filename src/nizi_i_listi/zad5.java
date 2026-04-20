package nizi_i_listi;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        SLL<String> list = new SLL<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            list.insertLast(word);
        }

        int l = scanner.nextInt();

        System.out.println(list);

        SLLNode<String> node = list.getFirst();
        int counter = n;
        while (node != null && counter != 0){
            SLLNode<String> next = node.succ;

            if(node.element.length() == l){
                list.insertLast(node.element);
                list.delete(node);
            }

            node = next;
            counter --;
        }
        System.out.println(list);
    }
}
