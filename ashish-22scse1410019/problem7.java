7. WAP to take input 3 digit numbers from the user and print the square of the middle digit.
  public class questions {
    public static void squareofmid(int n)
    {
        int sec = n%100;
        int third = sec%10;
        int second = (sec-third)/10;
        System.out.println(second*second);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any three digit number  : ");
        int n = sc.nextInt();
        squareofmid(n);
    }
}
