5. WAP to take input days from the user and convert it into years, months, and remaining days.
public class questions {
    public static void calender(int days)
    {
        int year = 0 , month = 0 ,value = 0, rem = 0;
        while(days>=365)
        {
            days = days-365;
            year++;
        }
        while(days>=31)
        {
            if(value==0)
            {
                days = days-30;
                month++;
            }
            else {
                days = days-31;
                month++;
            }

        }
        rem = days;
        System.out.println("You have "+year+" years "+month+" months "+days+" days ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number of days : ");
        int days = sc.nextInt();
        calender(days);
    }
}
