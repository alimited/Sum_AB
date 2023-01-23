import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //call Scanner input
        Scanner input = new Scanner(System.in);

        //Prompt user first number
        System.out.print("First number: ");
        int a = input.nextInt();

        //Prompt user second number
        System.out.print("Second number: ");
        int b = input.nextInt();

        //Print results
        int result = Integer.sum(a, b);
        System.out.println("Result: " + result);
    }
}
