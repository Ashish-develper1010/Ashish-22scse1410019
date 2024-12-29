32. WAP to print the reverse of a number given by user.

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String a = sc.nextLine();
        int n = a.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        System.out.println("The reversed string is : " + sb.toString());
    }
}

