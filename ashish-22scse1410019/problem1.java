1. WAP to take input 2 numbers from the user and print the sum of the numbers.
  import java.util.Scanner;

public class questions {
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int first = sc.nextInt();
        System.out.print("Enter second number ");
        int second = sc.nextInt();
        int sum = first+second;
        System.out.println("Sum of "+first+" and "+second+" is : "+ sum);
    }
}
