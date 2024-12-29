33. WAP to take input a number from the user and check whether it is palindrome.
import java.util.Scanner;

public class questions {
    public static boolean ispalindrome(int n)
    {
        int original = n;
        int reversed = 0;

        while(n!=0)
        {
            int digit = n%10;
            reversed = reversed*10+digit;
            n = n/10;
        }
        if(original==reversed) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(ispalindrome(a)) System.out.println("Yes, this nnumber is palindrome.");
        else System.out.println("No, this number is not palindrome");

    }
}
