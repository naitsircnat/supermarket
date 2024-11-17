public class Perishable extends Item {
  protected String expiry;
  protected boolean isHalal;
  protected String storageInstructions;

  public Perishable(){
    super();
    this.expiry="";
    this.isHalal=false;
    this.storageInstructions="";
  }

  public Perishable(String name, String brand, String origin, double price, String expiry, boolean isHalal, String storageInstructions){
    super(name, brand, origin, price);
    this.expiry=expiry;
    this.isHalal=isHalal;
    this.storageInstructions=storageInstructions;
  }

  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public boolean isHalal() {
    return isHalal;
  }

  public void setHalal(boolean isHalal) {
    this.isHalal = isHalal;
  }

  public String getStorageInstructions() {
    return storageInstructions;
  }

  public void setStorageInstructions(String storageInstructions) {
    this.storageInstructions = storageInstructions;
  }

  @Override
  public String toString() {
    return "Perishable [name=" + name + ", expiry=" + expiry + ", brand=" + brand + ", isHalal=" + isHalal + ", origin="
        + origin + ", storageInstructions=" + storageInstructions + ", price=" + price + ", isHalal()=" + isHalal()
        + "]";
  }

  
}
