public abstract class Item {
  protected String name;
  protected String brand;
  protected String origin;
  protected double price;

  public Item() {
    this.name = "";
    this.brand = "";
    this.origin = "";
    this.price = 0;
  }
  
  public Item(String name, String brand, String origin, double price) {
    this.name = name;
    this.brand = brand;
    this.origin = origin;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nBrand: " + brand + "\nOrigin:" + origin + "\nPrice: " + price; 
  }
}

