import java.util.Scanner;

public class Main {

    /**
     * Prompts the user for an n value via the console.
     *
     * @param args the command line arguments entered by the user
     */
    public static void main(String[] args) {

        System.out.println("Fibonacci Sequence");
        System.out.println("Enter a value for n to calculate the Fibonacci sequence:");
        //Output message example: "The nth term of the Fibonacci sequence is y."

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The number " + n + " term in the Fibonacci sequence is " + sequence(n) + ".");
    }


    //Reference: https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

    /**
     * Calculates the nth term of the Fibonacci sequence.
     * Value n cannot exceed 46 to avoid integer overflow.
     * @param n the sequence number to determine the final value of the Fibonacci sequence.
     * @return the calculated nth term of the Fibonacci sequence.
     */
    static int sequence(int n) {
        if (n <= 1)
            return n;
        return sequence(n - 1) + sequence(n - 2);
    }
}