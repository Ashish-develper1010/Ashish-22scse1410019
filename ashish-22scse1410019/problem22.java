 22. Wap that takes a character input from the user and checks whether it is an alphabet, digit, or special symbol:

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special symbol.");
        }
    }
}
