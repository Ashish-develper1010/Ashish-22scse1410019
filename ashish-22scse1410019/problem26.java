26. WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int lw = sc.nextInt();
        System.out.print("Enter upper limit : ");
        int up = sc.nextInt();
        for(int i=lw+1;i<up;i++)
        {
            System.out.print(i+" ");
        }
    }
}
