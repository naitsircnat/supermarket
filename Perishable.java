public abstract class Perishable extends Item {
  protected String expiry;
  protected String isHalal;
  protected String storageInstructions;

  public Perishable(){
    super();
    this.expiry="";
    this.isHalal="No";
    this.storageInstructions="";
  }

  public Perishable(String name, String brand, String origin, double price, String expiry, String isHalal, String storageInstructions){
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

  public String isHalal() {
    return isHalal;
  }

  public void setHalal(String isHalal) {
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
    return super.toString() + "\nExpiry: " + expiry + "\nHalal?: " + isHalal + "\nStorage: " + storageInstructions;
  }
}
