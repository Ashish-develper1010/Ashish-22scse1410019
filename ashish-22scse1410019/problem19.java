19. WAP to take input income from the user and calculate the amount of tax to be paid as per rules.
Less or equal to 10,000 -> no tax
Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
Greater than 50,000 -> 5000 + 30% of income above 50,000
import java.util.Scanner;
public class questions {
    public static int taxclaculator(int income)
    {
        if(income<=10000) System.out.print("No tax : ");
        else if (income>10000&&income<=25000) {
            income = income-(income/10);
            System.out.print("10% tax applies on your income : ");
        } else if (income > 25000 && income <= 50000) {
            income = income-(income*25/100);
            income =income- 2500;
            System.out.print("20% +2500 tax applies on your income : ");
        }
        else
        {
            income = income-(income*30/100);
            income = income-5000;
            System.out.print("30%  + 5000 tax applies on your income : ");
        }
        return income;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  your  : ");
        int income = sc.nextInt();
        System.out.println(taxclaculator(income));
    }
}
