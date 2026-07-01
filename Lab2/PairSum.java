import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("  Element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        int comparisons = 0;
        int foundI = -1;
        int foundJ = -1;

        for (int i = 0; i < n - 1 && foundI == -1; i++) {
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (array[i] + array[j] == target) {
                    foundI = i;
                    foundJ = j;
                    break;
                }
            }
        }

        System.out.println("\n----- Search Results -----");
        System.out.println("Comparisons made: " + comparisons);

        if (foundI != -1) {
            System.out.println("Pair found!");
            System.out.println("Indices: (" + foundI + ", " + foundJ + ")");
            System.out.println("Values: " + array[foundI] + " and " + array[foundJ]);
            System.out.println("Equation: " + array[foundI] + " + " + array[foundJ] + " = " + target);
        } else {
            System.out.println("No pair found whose sum equals " + target + ".");
        }

        scanner.close();
    }
}
