21. WAP to calculate the area of rectangle, circle and triangle as per user's choice.
import java.util.Scanner;
public class questions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice to calculate the Area : ");
        System.out.println("For rectangle Enter 'r' || For circle Enter 'c' || For trangle Enter 't' ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'r':
                System.out.print("Enter length & breadth of rectangle : ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int area = l*b;
                System.out.print("Area of rectangle is : "+area);
                break;
            case 't':
                System.out.print("Enter height & base of triangle : ");
                int h = sc.nextInt();
                int ba = sc.nextInt();
                int ar = h*ba/2;
                System.out.print("Area of triangle is : "+ar);
                break;
            case 'c':
                System.out.print("Enter radius of circle : ");
                int r = sc.nextInt();
                int arr = (int)3.14*r*r;
                System.out.println("Area of circle is : "+arr);
                break;
            default:
                System.out.println("Invalid Choice : ");
        }
    }
}
