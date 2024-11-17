
package fabona;
import java.util.Scanner ;

public class Fabonacciii {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int number=sc.nextInt();
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
    }

    public static int fibonacci(int n) {
       
        if (n <= 1) {
            return n;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
