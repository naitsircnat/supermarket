public class Item {
  protected String name;
  protected String brand;
  protected String origin;
  protected double price;
  protected int weight;
  
  public Item(String name, String brand, String origin, double price, int weight) {
    this.name = name;
    this.brand = brand;
    this.origin = origin;
    this.price = price;
    this.weight = weight;
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

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Item [name=" + name + ", brand=" + brand + ", origin=" + origin + ", price=" + price + ", weight=" + weight
        + "]";
  }
}
