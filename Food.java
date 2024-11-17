public class Food extends Perishable {
  private double weight;

  public Food(){
    super();
    this.weight=0;
  }
  
  public Food(String name, String brand, String origin, double price, String expiry, String isHalal, String storageInstructions, double weight){
    super(name, brand, origin, price, expiry, isHalal, storageInstructions);
    this.weight=weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nBrand: " + brand + "\nOrigin:" + origin + "\nPrice($): " + price + "\nExpiry: " + expiry + "\nHalal?: " + isHalal + "\nStorage: " + storageInstructions + "\nWeight(Kg): " + weight; 
  }
}
