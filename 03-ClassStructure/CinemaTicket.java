
/**
 * 7.	Define a class CinemaTicket to describe cinema tickets.
 * The ticket attributes are: cinema name, film title, row, seat, and price.
 * Since the name of cinema is the same for all tickets, use a static field.
 * Then define a method to display ticket data.
 * Try to create two tickets and display ticket details. 
 * 
 * 12.	Modify the class describing cinema tickets. Add a constructor that creates a ticket for the specified movie,
 * with row and seat numbers. Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25.
 * Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”,
 * the first one is in row 2 and the second one in row 7.
 * Print the created tickets. 
 */
public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    float price;
    
    public CinemaTicket(String filmTitle, int rowNumber, int seatNumber) {
        //filmTitle = movieTitle;
        this.filmTitle = filmTitle;
        row = rowNumber;
        seat = seatNumber;
        if (row<=2){
            price = 10;
        }
        else{
            price = 25;
        }
    }
    
    public CinemaTicket() {}
    
    public void displayTicket() {
        System.out.println(cinemaName+" "+filmTitle+" "+row+" "+seat+" "+price);
    }
    
    public static void main(String[] args){
        CinemaTicket ticket1 = new CinemaTicket();
        ticket1.filmTitle = "Hobbit";
        ticket1.row = 5;
        ticket1.seat = 11;
        ticket1.price = 13.50f;
        ticket1.displayTicket();
        
        CinemaTicket ticket2 = new CinemaTicket();
        ticket2.filmTitle = "Bridget Jones";
        ticket2.row = 9;
        ticket2.seat = 36;
        ticket2.price = 16.50f;
        ticket2.displayTicket();
        
        CinemaTicket ticket3 = new CinemaTicket("Gladiator", 2, 10);
        ticket3.displayTicket();
        
        CinemaTicket ticket4 = new CinemaTicket("Gladiator", 7, 11);
        ticket4.displayTicket();
        
    }
}
