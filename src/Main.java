import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // Default Array size
    public static int SORT_MAX_SIZE = 16;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[SORT_MAX_SIZE];

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int[] temp = Arrays.copyOf(array, size);


        System.out.println("Enter element (From 1 to 9999): ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(temp));


        HelperM helper = new HelperM();


    }
}