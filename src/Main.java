import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Character> alphabetAZ = new LinkedList<>();
        for (char j = 'A'; j <= 'Z'; j++) {
            alphabetAZ.add(j);
        }
        System.out.print(alphabetAZ);

        System.out.println(" ");
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.print(numbers);

        System.out.println(" ");
        ArrayList<Character> alphabetZA = new ArrayList<>();
        alphabetZA.addAll(alphabetAZ);
        Collections.reverse(alphabetZA);
        System.out.println(alphabetZA);

        System.out.println(" ");
        ArrayList<Integer> numbersReverse = new ArrayList<>();
        numbersReverse.addAll(numbers);
        Collections.reverse(numbersReverse);
        System.out.println(numbersReverse);


    }
}