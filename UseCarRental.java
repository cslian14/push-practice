import java.util.Scanner;

public class UseCarRental {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter renter name: ");
    String name = input.nextLine();

    System.out.print("Enter renter zip code: ");  
    String zip = input.nextLine();

    System.out.print("Enter rental days: ");
    int days = input.nextInt();

    System.out.print("Is this a luxury rental (y/n)? ");
    String response = input.next();
    
    if(response.equalsIgnoreCase("y")) {
      System.out.print("Add chauffeur (y/n)? ");
      boolean chauffeur = input.next().equalsIgnoreCase("y");
      LuxuryCarRental rental = new LuxuryCarRental(name, zip, days, chauffeur);
      rental.display(); 
    } else {
      CarRental rental = new CarRental(name, zip, "economy", days);
      rental.display();
    }

  }

}