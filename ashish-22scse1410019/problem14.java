14. WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
public class questions {
    public static int amtcalculator(int rate,int quantity)
    {
        int amt = rate*quantity;
        if(amt>=2000)
        {
            amt -= (amt*15/100);
        }
        return amt;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  rate of the product : ");
        int a = sc.nextInt();
        System.out.print("Enter quantity of the product : ");
        int b = sc.nextInt();
        System.out.println( "You have to pay amount : "+amtcalculator(a,b));
    }
}
