12. WAP to take input 2 numbers from the user and print their difference.
public class questions {
    public static int diffrence(int first,int sec)
    {
        return first-sec;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  two numbers  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(diffrence(a,b));
    }
}
