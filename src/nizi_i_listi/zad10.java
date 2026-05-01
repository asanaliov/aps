package nizi_i_listi;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        DLL<Integer> list = new DLL<>();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            list.insertLast(number);
        }

        int m = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(list);

        DLLNode<Integer> foundNode = list.find(m);

        if (foundNode != null){
            for (int i = 0; i < k; i++) {
                if (foundNode.succ != null){
                    DLLNode<Integer> next = foundNode.succ;

                    if (foundNode.pred != null){
                        foundNode.pred.succ = foundNode.succ;
                    }else{
                        list.insertFirst(foundNode.succ.element);
                    }

                    foundNode.succ.pred = foundNode.pred;

//                    foundNode.pred

                    foundNode.pred = next;
                    foundNode.succ = next.succ;

                    if(foundNode.succ != null){
                        foundNode.succ.pred = foundNode;
                    }

                }else {
                    list.delete(foundNode);
                    list.insertFirst(foundNode.element);
                    foundNode = list.getFirst();
                }
            }
         }

        System.out.println(list);

    }
}
