package voved_vo_java_zadaci;

import java.util.*;

public class ReverseWord {

    public static void printReversed(String word) {
//        char[] charArray = word.toCharArray();
//        for (int i = charArray.length - 1; i >= 0; i--){
//            System.out.print(charArray[i]);
//        }
//        System.out.println();

        // oneliner
        System.out.println(new StringBuilder(word).reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> words = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }
        words.forEach(ReverseWord::printReversed);
    }

}

