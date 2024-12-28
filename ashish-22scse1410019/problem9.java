9. WAP to check whether a number is even or odd.
public class questions {
    public static void evenodd(int n)
    {
        // even
        if(n%2==0)
        {
            System.out.println(n+" is even");
        }
        // odd
        else System.out.println(n+"is odd");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number  : ");
        int n = sc.nextInt();
        evenodd(n);
    }
}
