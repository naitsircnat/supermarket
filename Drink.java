public class Drink extends Perishable {
  protected int vol;

  public Drink(){
    super();
    this.vol=0;
  }

  public Drink(String name, String brand, String origin, double price, String expiry, boolean isHalal, String storageInstructions, int vol){
    super(name, brand, origin, price, expiry, isHalal, storageInstructions);
    this.vol=vol;
  }

  public int getVol() {
    return vol;
  }

  public void setVol(int vol) {
    this.vol = vol;
  }

  @Override
  public String toString() {
    return "Drink [name=" + name + ", vol=" + vol + ", expiry=" + expiry + ", brand=" + brand + ", isHalal=" + isHalal
        + ", origin=" + origin + ", storageInstructions=" + storageInstructions + ", price=" + price + ", isHalal()="
        + isHalal() + "]";
  }
}
