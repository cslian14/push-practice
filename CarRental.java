public class CarRental {

  private String renterName;
  private String zipCode;
  private String carSize;
  private double dailyFee;
  private int rentalDays; 
  private double totalFee;

  public CarRental(String renterName, String zipCode, String carSize, int rentalDays) {
    this.renterName = renterName;
    this.zipCode = zipCode;
    this.carSize = carSize;
    this.rentalDays = rentalDays;

    if(carSize.equals("economy")) {
      dailyFee = 29.99; 
    } else if(carSize.equals("midsize")) {
      dailyFee = 38.99;
    } else if(carSize.equals("full size")) {
      dailyFee = 43.50;
    }

    totalFee = dailyFee * rentalDays; 
  }

  public void display() {
    System.out.println("Renter name: " + renterName);
    System.out.println("Renter zip: " + zipCode);
    System.out.println("Car size: " + carSize);
    System.out.println("Daily fee: " + dailyFee);
    System.out.println("Rental days: " + rentalDays);
    System.out.println("Total fee: " + totalFee);

}
}