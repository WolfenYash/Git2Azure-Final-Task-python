/**
 * FibonacciChallenge.java
 */
public class FibonacciChallenge {
    
    public static void main(String[] args) {
        // HINT: Should we allow negative numbers as input?
        System.out.println("Fibonacci(5) = " + fibonacci(5));
        System.out.println("Fibonacci(10) = " + fibonacci(10));
        
        // HINT: What happens with this test case?
        System.out.println("First 8 Fibonacci numbers:");
        printFibonacciSequence(8);
        
        System.out.println("\nUsing efficient algorithm:");
        System.out.println("Fibonacci(40) = " + efficientFibonacci(40));
    }
    
    public static int fibonacci(int n) {
        // HINT: Remember, Fibonacci sequence starts with 0, 1, ...
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void printFibonacciSequence(int n) {
        // HINT: Off-by-one error?
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    
    public static int efficientFibonacci(int n) {
        // HINT: How can you avoid recalculating the same Fibonacci numbers repeatedly?
        int a = 0;
        int b = 1;
        
        if (n == 0) {
            return a;
        }
        
        for (int i = 2; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + a;
        }
        
        return b;
    }
}
