import java.util.Scanner;
class MovieTicket {

    String movieName;
    double ticketPrice;
    int numberOfTickets;
    
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }
    
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 10 / 100;
        } else {
            return 0;
        }
    }
    
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " +ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Discount: " +calculateDiscount());
        System.out.println("Final Amount: " +calculateFinalAmount());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        double ticketPrice = sc.nextDouble();
        int numberOfTickets = sc.nextInt();
        MovieTicket obj = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        obj.displayBill();
    }
}
