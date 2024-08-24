import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array A
        System.out.print("Enter the number of elements in array A: ");
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        System.out.println("Enter " + n + " elements for array A:");
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }

        // Input for array B
        System.out.print("Enter the number of elements in array B: ");
        int m = scanner.nextInt();
        int[] arrayB = new int[m];
        System.out.println("Enter " + m + " elements for array B:");
        for (int i = 0; i < m; i++) {
            arrayB[i] = scanner.nextInt();
        }

        // Swap elements between array A and array B
        int[] temp = arrayA;
        arrayA = arrayB;
        arrayB = temp;

        // Output the swapped arrays
        System.out.print("Array A: ");
        for (int i : arrayA) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array B: ");
        for (int i : arrayB) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
