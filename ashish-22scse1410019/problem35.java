35. WAP to take input a number from user and print in the form of series:
1, 3, 6, 10, 15, ... nth term
1, 11, 111, 1111, ... nth term
1, 12, 123, 1234, … nth term
0, 7, 26, 63, … nth term
0, 1, 1, 2, 3, 5, 8, … nth term
0, 1, 3, 7, 15, … nth term
x - x ^ 2 + x ^ 3 - x ^ 4 + x ^ 5 … nth term (do sum here also)

import java.util.Scanner;

public class questions {
    // series 1, 3, 6, 10, 15, ... nth term
    public static void series(int n )
    {
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum += i;
            System.out.print(sum+((i==n)?"\n":","));
        }
    }
    // series 1, 11, 111, 1111, ... nth term
    public static void print1addseries(int n)
    {
        String num = "";
        for(int i = 1;i<=n;i++)
        {
            num += "1";
            System.out.print(num+((i==n)?"\n":","));
        }
    }
    // series 1, 12, 123, 1234, … nth term
    public static void printcount(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print(((i==n)?"\n":","));
        }
    }
    // series 0, 7, 26, 63, … nth term
    public static void printseries(int m )
    {
        for(int i=1;i<=m;i++)
        {
            System.out.print((i*i*i)-1+((i==m)?"\n":","));
        }
    }
    // series 0, 1, 1, 2, 3, 5, 8, … nth term
    public static void fibonacci(int n){
        int a = 0 , b =1 ,c;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+((i==n-1)?"\n":","));
            c = a+b;
            a = b;
            b = c;
        }
    }
    // series 0, 1, 3, 7, 15, … nth term
    public static void expseries(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(((int)Math.pow(2,i)-1)+(i==n-1?"\n":","));
        }
    }
    // series
    public static void xseries(int n )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m ");
        int m = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            double term = Math.pow(m, i) * (i % 2 == 0 ? -1 : 1);
            sum += term;
            System.out.print(term + (i == n ? "\n" : ", "));
        }
        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        series(a);
        print1addseries(a);
        printcount(a);
        printseries(a);
        fibonacci(a);
        expseries(a);
        xseries(a);
    }
}
