34. WAP to take input a number from the user and check whether it is armstrong.
import java.util.Scanner;

public class questions {
    public static boolean isarmstrome(int n)
    {
        int original = n;
        int rem = 0;
        int x = String.valueOf(n).length();

        while(n!=0)
        {
            int digit = n%10;
            rem += Math.pow(digit,x);
            n = n/10;
        }
        return (original==rem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(isarmstrome(a)) System.out.println("Yes, this nnumber is armstrome.");
        else System.out.println("No, this number is not armstrome");

    }
}
