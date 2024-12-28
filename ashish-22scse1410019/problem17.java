17. WAP to input year from user and check whether it is a leap year or not.
public class questions {
    public static void leapyearcheck(int year)
    {
        if(year%400==0||year%4==0&&year%100!=0)
        {
            System.out.println(year+" is a leap year");
        }
        else System.out.println(year+" is not a leap year");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any year  : ");
        int year = sc.nextInt();
        leapyearcheck(year);
    }
}
