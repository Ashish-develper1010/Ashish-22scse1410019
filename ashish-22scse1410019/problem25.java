25. WAP to convert a character into its toggle case.
public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        String s2 = s.toUpperCase();
        char ch = s1.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        for(int i=1;i<s2.length();i++)
        {
            sb.append(s2.charAt(i));
        }
        System.out.print(sb.toString()+" is a toggle case of "+s);
    }
}
