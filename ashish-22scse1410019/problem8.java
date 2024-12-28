8. WAP to take input 4 digit numbers from the user and print its all digits.
  public class questions {
    public static void printdigit(int n)
    {
        int first = n/1000;
        n=n%1000;
        int sec = n/100;
        n = n%100;
        int third = n/10;
        n = n%10;
        int four = n;
        System.out.println("First : "+first+" Second : "+sec+" Third : "+third+" Fourth : "+four);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any four digit number  : ");
        int n = sc.nextInt();
        printdigit(n);
    }
}
