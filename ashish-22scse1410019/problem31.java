31. WAP to check whether a number is perfect or not.

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum =0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
                sum += i;
        }
        if(sum==a) System.out.println("This is a perfect number .");
        else System.out.println("This is not a perfect number.");
    }
}
