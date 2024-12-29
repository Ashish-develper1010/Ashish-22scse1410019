37. Define a class called MovieMagic with the following description :-
Instance variables :-
int year - to store the year of release of movie.
String title - to store the title of the movie.
float rating - to store the popularity rating of the movie.
Member methods :-
MovieMagic() - default constructor to initialise data members.
void accept() - to input and store year, title and rating.
void display() - to display the title of a movie and a message based on the rating as per the table.
0.0 to 2.0 - Flop
2.1 to 3.4 - Semi-hit
3.5 to 4.5 - Hit
4.6 to 5.0 - Super Hit
Write a main() method to create an object of the class and call the above member methods.

import java.util.Scanner;

class MovieMagic {
    // Instance variables
    private int year;
    private String title;
    private float rating;

    // Default constructor
    public MovieMagic() {
        this.year = 0;
        this.title = "";
        this.rating = 0.0f;
    }

    // Method to accept movie details
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of release: ");
        this.year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the title of the movie: ");
        this.title = scanner.nextLine();

        System.out.print("Enter the rating of the movie: ");
        this.rating = scanner.nextFloat();
    }

    // Method to display movie details
    public void display() {
        System.out.println("Movie Title: " + this.title);
        System.out.println("Year of Release: " + this.year);
        System.out.print("Rating: " + this.rating + " - ");

        if (this.rating >= 0.0 && this.rating <= 2.0) {
            System.out.println("Flop");
        } else if (this.rating > 2.0 && this.rating <= 3.4) {
            System.out.println("Semi-hit");
        } else if (this.rating > 3.4 && this.rating <= 4.5) {
            System.out.println("Hit");
        } else if (this.rating > 4.5 && this.rating <= 5.0) {
            System.out.println("Super Hit");
        } else {
            System.out.println("Invalid Rating");
        }
    }

    // Main method
    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept();
        movie.display();
    }
}
