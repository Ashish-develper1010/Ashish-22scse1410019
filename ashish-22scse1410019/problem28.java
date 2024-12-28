28. WAP to input a number from user and print its factorial.
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int f = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=f;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of given number is : "+fact);
    }
}
