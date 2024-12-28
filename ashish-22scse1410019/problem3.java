3. WAP to calculate and print area of circle and circumference of circle.
  public class questions {
    public static int area(int rds)
    {
        int area = (int) (3.14*rds*rds);
        return area;
    }
    public static int circumference(int rds)
    {
        int crcmference = (int)(2*3.14*rds);
        return crcmference;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle ");
        int radius = sc.nextInt();
        System.out.println("Area of the ercle is : "+area(radius));
        System.out.println("Circumference of the circle is : "+circumference(radius));
    }
}


