package nizi_i_listi;

import java.util.Scanner;

public class kol1_vlezna {
    public static void main(String[] args) {
        SLL<Integer> list = new SLL<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(scanner.nextInt());
        }

        SLLNode<Integer> firstEven = null;
        SLLNode<Integer> lastOdd = null;
        int firstEvenIndex = -1, lastOddIndex = -1;

        SLLNode<Integer> tmp = list.getFirst();
        int index = 0;
        while (tmp != null) {
            if (tmp.element % 2 == 0 && firstEven == null) {
                firstEven = tmp;
                firstEvenIndex = index;
            }
            if (tmp.element % 2 != 0) {
                lastOdd = tmp;
                lastOddIndex = index;
            }
            tmp = tmp.succ;
            index++;
        }

        System.out.println(firstEven.element + " " + firstEvenIndex);
        System.out.println(lastOdd.element + " " + lastOddIndex);
        System.out.println(list);

        Integer temp = firstEven.element;
        firstEven.element = lastOdd.element;
        lastOdd.element = temp;

        System.out.println(list);
    }
}
