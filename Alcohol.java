public class Alcohol extends Drink implements CheckAge {
  private double alcoholPercent;

  public Alcohol(){
    super();
    this.alcoholPercent=0;
  }
  
  public Alcohol(String name, String brand, String origin, double price, String expiry, boolean isHalal, String storageInstructions, int vol, double alcoholPercent){
    super(name, brand, origin, price, expiry, isHalal, storageInstructions, vol);
    this.alcoholPercent=alcoholPercent;
  }

  public boolean allowedToDrink(int age){
    return age>=18;
  }
}
