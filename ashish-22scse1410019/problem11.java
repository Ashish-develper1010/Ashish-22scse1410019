11. WAP to take input two numbers from the user and print the largest of them.
public class questions {
    public static void largenumber(int first,int sec)
    {
        if(first>sec) {
            System.out.println(first + " is larger");
        }
        else System.out.println(sec+" is larger");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  two numbers  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        largenumber(a,b);
    }
}
