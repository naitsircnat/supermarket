public class Food extends Perishable {
  private int weight;

  public Food(){
    super();
    this.weight=0;
  }
  
  public Food(String name, String brand, String origin, double price, String expiry, String isHalal, String storageInstructions, int weight){
    super(name, brand, origin, price, expiry, isHalal, storageInstructions);
    this.weight=weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Food [name=" + name + ", weight=" + weight + ", expiry=" + expiry + ", brand=" + brand + ", isHalal="
        + isHalal + ", origin=" + origin + ", storageInstructions=" + storageInstructions + ", price=" + price
        + ", isHalal()=" + isHalal() + "]";
  }
}
