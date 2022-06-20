import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter an integer between 1 and 20");
       int user = scan.nextInt();

        int[] array = new int[user];
        int current = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = current;
            current *= 2;
            System.out.println(array[i]);

        }

    }

}
