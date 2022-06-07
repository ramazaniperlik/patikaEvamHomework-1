package ramazaniperlik;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + ". stringi yazınız.");
            stringList.add(scanner.nextLine());
        }

        String[] words = new String[stringList.size()];
        words = stringList.toArray(words);

        Word word = new Word();
        String[] findString = word.List(words);

        if (!word.getFindIndis().isEmpty()) {
            System.out.println("Tanımlı value'yu içeren string degerler:");
            for (String newString : findString) {
                System.out.print(newString + ",");
            }
        }
        else{
            System.out.println("NOT FOUND THE WORD!");
        }
    }
}
