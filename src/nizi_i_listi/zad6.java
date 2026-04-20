package nizi_i_listi;

import java.util.Scanner;

public class zad6 {
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

        SLLNode<String> toDeleteNode = null;
        while(node != null){
            SLLNode<String> next = node.succ;

            if (node.element.length() == l){
                toDeleteNode = node;
            }
            node = next;
        }


        if (toDeleteNode != null) {
            list.insertFirst(toDeleteNode.element);
            list.delete(toDeleteNode);
        }
        if (toDeleteNode != null) {
            System.out.println(list);
        }else{
            System.out.println(list);
        }


    }
}
