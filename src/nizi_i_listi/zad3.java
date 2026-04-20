package nizi_i_listi;
import java.util.Scanner;


public class zad3 {
    public static void main(String[] args) {
        SLL<String> list = new SLL<String>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            list.insertLast(word);
        }

        int l = scanner.nextInt();

        SLLNode<String> node = list.getFirst();
        System.out.println(list);
        while (node != null){
            SLLNode<String> next = node.succ;
            if(node.element.length() == l){
                list.insertAfter("Target", node);
            }
            node = next;
        }

        System.out.println(list);
    }
}
