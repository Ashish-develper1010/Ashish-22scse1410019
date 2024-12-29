39. WAP to input a string from the user and count the number of alphabets, digits & special symbols in the string.
import java.util.Scanner;

public class questions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        int countdigit = 0, countalphabet = 0,countsymbol = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)) countalphabet++;
            if(Character.isDigit(ch)) countdigit++;
            else countsymbol++;
        }
        System.out.print("The given String has "+countalphabet+" alphabet , "+countdigit+" digits and "+countsymbol+" symbols.");
    }
}
