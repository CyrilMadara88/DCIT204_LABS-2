import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = readArray(scanner);
        int[] result = findMaxAndIndex(numbers);

        displayResults(numbers, result[0], result[1]);

        scanner.close();
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("How many elements will you enter? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integer values:");

        for (int i = 0; i < size; i++) {
            System.out.print("  Value " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int[] findMaxAndIndex(int[] arr) {
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return new int[] { maxValue, maxIndex };
    }

    private static void displayResults(int[] arr, int maxValue, int maxIndex) {
        System.out.println();
        System.out.println("              SEARCH SUMMARY            ");
        System.out.printf("%-20s: %d%n", "Array size", arr.length);
        System.out.printf("%-20s: %s%n", "Array contents", arrayToString(arr));
        System.out.printf("%-20s: %d%n", "Maximum value", maxValue);
        System.out.printf("%-20s: %d%n", "Index of maximum", maxIndex);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
