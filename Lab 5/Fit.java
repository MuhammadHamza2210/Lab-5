

package fact;
import java.util.Scanner;

public class Fit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter workout duration (negative number to exit): ");
            input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Exiting the app. Stay fit!");
                break;
            }

            int primeCalories = calculatePrimeCalories(input);
            int oddCalories = calculateOddCalories(input);
            int evenCalories = calculateEvenCalories(input);

            System.out.println("Calories burned for prime numbers: " + primeCalories);
            System.out.println("Calories burned for odd numbers: " + oddCalories);
            System.out.println("Calories burned for even numbers: " + evenCalories);
            System.out.println();
        }

        scanner.close();
    }

    public static int calculatePrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }
}