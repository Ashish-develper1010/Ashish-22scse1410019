WAP to take input a number (range 1 to 7) from the user and print the corresponding week.
using if else 
using switch 
public class questions {
    public static void printweekwithif(int day)
    {
        // Using if Conditions
        if(day==1) System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        if(day==3) System.out.println("Wednesday");
        if(day==4) System.out.println("Thursday");
        if(day==5) System.out.println("Friday");
        if(day==6) System.out.println("Saturday");
        if(day==7) System.out.println("Sunday");
    }
    public static void printweekwithswitch(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any day number : ");
        int day = sc.nextInt();
        printweekwithif(day);
        printweekwithswitch(day);
    }
}
