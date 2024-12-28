4. WAP to take input rupees from the user and convert it into paise.
public class questions {
    public static int rupeeconverter(int rupee)
    {
        return rupee*100;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  rupees : ");
        int rupees = sc.nextInt();
        System.out.println("Paise : "+rupeeconverter(rupees));
    }
}
