public class Alcohol extends Drink implements CheckAge {
  private double alcoholPercent;

  public Alcohol(){
    super();
    this.alcoholPercent=0;
  }
  
  public Alcohol(String name, String brand, String origin, double price, String expiry, String isHalal, String storageInstructions, int vol, double alcoholPercent){
    super(name, brand, origin, price, expiry, isHalal, storageInstructions, vol);
    this.alcoholPercent=alcoholPercent;
  }

  public boolean allowedToDrink(int age){
    return age>=18;
  }

  public String toString() {
    return "Name: " + name + "\nBrand: " + brand + "\nOrigin:" + origin + "\nPrice: " + price + "\nExpiry: " + expiry + "\nHalal?: " + isHalal + "\nStorage: " + storageInstructions + "\nVolume(ml): " + vol + "\nAlcohol %: " + alcoholPercent; 
  }
}
