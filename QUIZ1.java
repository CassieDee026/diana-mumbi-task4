import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class QUIZ1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int check;
        int[] array = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115 };

        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("Please type a number ");
        check = read.nextInt();
        for (int i : array) { // Check if input value is in range or not
            if (i == check) {
                System.out.println("the array is found");
                // ...
            } else {
                System.out.println("Not found");
            }
            // ...
        }
    }

}
