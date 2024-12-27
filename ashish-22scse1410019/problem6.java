6. WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
public class questions {
    public static void sumof1and3(int n)
    {
        int sum =0 ;
        int first = n/100;
        int sec = n%100;
        int third = sec%10;
        System.out.println(first+third);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any three digit number  : ");
        int n = sc.nextInt();
        sumof1and3(n);
    }
}
