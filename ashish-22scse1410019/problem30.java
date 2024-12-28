30. WAP to print the sum of the divisors of a number given by user.
  import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum =0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                sum += i;
        }
        System.out.println("The sum of the divisor is : "+sum);
    }
}
