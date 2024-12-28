15. WAP to take input 3 numbers and print the 2nd largest number among them.
public class questions {
    public static void seclargest(int first ,int sec , int third)
    {
        int res = Math.max(first,Math.max(sec,third));
        if(res==first)  res= 1;
        if(res==sec) res=2;
        else res = 3;
        switch (res)
        {
            case 1:
                if(sec>third)  System.out.println(sec+" is second  greater number among all. ");
                else System.out.println(third+" is second  greater number among all. ");
                break;
            case 2:
                if(first>third)  System.out.println(first+" is second  greater number among all. ");
                else System.out.println(third+" is second  greater number among all. ");
                break;
            case 3:
                if(first>sec)  System.out.println(first+" is second  greater number among all. ");
                else  System.out.println(sec+" is second  greater number among all. ");
                break;
            default:
                System.out.println("Invalid number : " +first+" " +sec+" "+third);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        seclargest(a,b,c);
    }
}
