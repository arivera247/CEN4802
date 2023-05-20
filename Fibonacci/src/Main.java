import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fibonacci Sequence");
        System.out.println("Enter a value for n to calculate the Fibonacci sequence:");
        //Output message example: "The nth term of the Fibonacci sequence is y."

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The number " + n + " term in the Fibonacci sequence is " + Fibonacci.sequence(n) + ".");
    }
}

class Fibonacci {
    static int sequence(int n) {
        if (n <= 1)
            return n;
        return sequence(n - 1) + sequence(n - 2);
    }
}

//Reference: https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
