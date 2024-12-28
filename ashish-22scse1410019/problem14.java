14. WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
public class questions {
    public static void greater(int first,int sec,int third)
    {
        if (first > sec && sec>third)
        {
            System.out.println(first+" is greater among all.");
        } else if (first > sec && first < third) {
            System.out.println(third+" is gteater among all");
        } else if (first < sec && sec < third) {
            System.out.println(third+" is greater among all");
        }
        else if(first>sec && first>third) System.out.println(first+" is greater among all");
        else System.out.println(sec +" is greater among all");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  three numbers  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greater(a,b,c);
    }
}
