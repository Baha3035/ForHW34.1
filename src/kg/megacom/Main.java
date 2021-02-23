package kg.megacom;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> seconds = new ArrayList<>();
        seconds.add(60);
        seconds.add(60 * 60);
        seconds.add(60 * 24 * 60);
        seconds.add(7 * 24 * 60 * 60);
        seconds.add(4 * 7 * 24 * 60 * 60);

        Collections.sort(seconds);
            //seconds.forEach(System.out::println);
        System.out.println("Sorted List is: " + seconds);

        System.out.println(" ");

        System.out.println("Index of the Seconds in an hour is: " + Collections.binarySearch(seconds, 60 * 60));

        System.out.println(" ");
        Collections.reverse(seconds);
        System.out.println("Reversed List is: " + seconds);

        System.out.println("");
        Collections.shuffle(seconds);
        System.out.println("After shuffling: " + seconds);
        System.out.println("Maximum is: " + Collections.max(seconds));
        System.out.println("Minimum is: " + Collections.min(seconds));

        System.out.println("");
        Collections.fill(seconds, 42);
        System.out.println(seconds);
    }
}
