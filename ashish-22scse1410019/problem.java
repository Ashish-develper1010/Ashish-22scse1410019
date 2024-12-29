36. WAP to calculate the average of even and odd numbers given by user until user press -1.
  import java.util.Scanner;

public class questions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counteven  =0 , sum = 0;
        int countodd = 0, sumodd =0;
        Boolean ch = true;
        while (ch)
        {
            System.out.print("Enter a number || is calulated as even : ");
            int a = sc.nextInt();
            if(a%2==0||a==0)
            {
                counteven++;
                sum += a;
                int avg = sum/counteven;
                System.out.println("The Current avg of even number is : "+avg);
            } else if (a == -1) {
                System.out.println("\n\n\n\nThank you for using this programme: ");
                ch = false;
            }
            else
            {
                countodd++;
                sumodd += a;
                int avgodd = sumodd/countodd;
                System.out.println("The current avg of odd number is : "+avgodd);
            }
        }
    }
}
