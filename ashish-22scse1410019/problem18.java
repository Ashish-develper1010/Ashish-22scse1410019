18. WAP to take input 3 numbers from the user and print the numbers in the descending order.
import java.util.Scanner;
public class questions {
    public static void sorting(int first , int sec , int third)
    {
        if(first>sec&&first>=third)
        {
            if(sec>=third) System.out.println("Decreasing order of number is : "+first + " "+sec+" "+third);
            else System.out.println("Decreasing order of number is : "+first + " "+third+" "+sec);
        }
        else if(sec>=first&&sec>=third)
        {
            if(first>=third) System.out.println("Decreasing order of number is : "+sec + " "+first+" "+third);
            else System.out.println("Decreasing order of number is : "+sec + " "+third+" "+first);
        }
        else if (third>first&&third>=sec)
        {
            if(first>=sec) System.out.println("Decreasing order of number is : "+third + " "+first+" "+sec);
            else System.out.println("Decreasing order of number is : "+third + " "+sec+" "+first);
        }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number  : ");
        int first = sc.nextInt();
        System.out.print("Enter  second number  : ");
        int second = sc.nextInt();
        System.out.print("Enter  third number  : ");
        int third = sc.nextInt();
        sorting(first,second,third);
    }
}
