20. WAP to perform arithmetic operations as per user's choice.
import java.util.Scanner;
public class questions {
    public static void calculator(int a , int b,char ch)
    {
        if(ch=='+') {
            int c= a+b;
            System.out.println("Sum of "+a+" and "+b+" is "+c);
        }
        else if (ch=='-')
        {
            int c = a-b;
            System.out.println("Difference of "+b+" and "+a+" is "+c);
        }
        else if(ch=='*')
        {
            int c = a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is "+c);
        }
        else
        {
            int c = a/b;
            System.out.println("Division of "+a+" and "+b+" is "+c);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  your first number : ");
        int first = sc.nextInt();
        System.out.print("Enter  your second number  : ");
        int second = sc.nextInt();
        System.out.println("Enter your operator to perfom calculation : + - * / ");
        char ch = sc.next().charAt(0);
        calculator(first,second,ch);
    }
}
