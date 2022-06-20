import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput;

        do {
            System.out.println("Enter an integer between 1 and 20");
            userInput = scan.nextInt();

        } while (userInput > 20 || userInput < 1);


        int[] array = new int[userInput];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = counter;
            counter *= 2;
            System.out.println(array[i]);

        }

        System.out.println(Arrays.toString(array));

    }

}
