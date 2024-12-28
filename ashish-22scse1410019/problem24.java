24. WAP to check whether a character given by user is a vowel or consonant.
import java.util.*;
 public class questions
 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a alphabet : ");
         char ch = sc.next().charAt(0);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') System.out.print("Given alphabet is vowel.");
         else System.out.print("Given alphabet is constant.");
     }
}
