27. WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int lw = sc.nextInt();
        System.out.print("Enter upper limit : ");
        int up = sc.nextInt();
        int i=0;
        if(lw%2==0)
            i=lw+2;
        else i = lw+1;
        while(i<up)
        {
            System.out.print(i+" ");
            i = i+2;
        }
    }
}
