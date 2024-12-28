23. WAP to input a character from user and check whether it is uppercase and lowercase.

import java.util.*;
public class questions
{
    public static boolean checkstring(String s)
    {
        String s1 = s.toLowerCase();
        if(s1.equals(s)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String s = sc.next();
        if(checkstring(s))
            System.out.print("String is in lower case ");
        else System.out.print("String is in UPPERCASE ");
    }
}
