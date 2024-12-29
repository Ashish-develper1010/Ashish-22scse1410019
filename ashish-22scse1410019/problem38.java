38. Define a class called ParkingLot with the following description :-
Instance variables :-
int vehicleNumber - to store vehicle number.
double hours - to storee the number of hours the vehicle is parked.
double bill - to store the bill amount.
Member methods :-
ParkingLot - to initialise data members.
void input() - to input and store the vehicleNumber and hours.
void calculate() - to compute the parking charge at rate of 3 rs for the first hour or part thereof and 1.5 rs for each additional hour.
void display() - to display details.
Write a main() method to create an object of the class and call the above methods.

import java.util.Scanner;

class ParkingLot {
    // Instance variables
    private int vehicleNumber;
    private double hours;
    private double bill;

    // Constructor to initialize data members
    public ParkingLot() {
        this.vehicleNumber = 0;
        this.hours = 0.0;
        this.bill = 0.0;
    }

    // Method to input vehicle number and hours
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        this.vehicleNumber = scanner.nextInt();
        System.out.print("Enter the number of hours parked: ");
        this.hours = scanner.nextDouble();
    }

    // Method to calculate the parking charge
    public void calculate() {
        if (hours <= 1) {
            bill = 3.0; // Flat rate for the first hour or part thereof
        } else {
            bill = 3.0 + (hours - 1) * 1.5; // 3 rs for the first hour + 1.5 rs for each additional hour
        }
    }

    // Method to display the details
    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Hours Parked: " + hours);
        System.out.println("Total Bill: Rs " + bill);
    }

    // Main method to create an object of the class and call the member methods
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.input();
        parkingLot.calculate();
        parkingLot.display();
    }
}
