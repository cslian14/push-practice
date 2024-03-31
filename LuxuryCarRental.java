public class LuxuryCarRental extends CarRental {

  private boolean hasChauffeur;
  private double chauffeurFee;

  public LuxuryCarRental(String renterName, String renterZip, int rentalDays, boolean hasChauffeur) {
    super(renterName, renterZip, "luxury", rentalDays);
    this.hasChauffeur = hasChauffeur;
    if (hasChauffeur) {
      chauffeurFee = 200 * rentalDays;
    }
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Has chauffeur: " + hasChauffeur); 
    System.out.println("Chauffeur fee: " + chauffeurFee);
  }

}