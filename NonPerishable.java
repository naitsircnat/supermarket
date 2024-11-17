public class NonPerishable extends Item {
  private String dimensions;

  public NonPerishable(){
    super();
    this.dimensions="";
  }

  public NonPerishable(String name, String brand, String origin, double price, String dimensions) {
    this.name = name;
    this.brand = brand;
    this.origin = origin;
    this.price = price;
    this.dimensions="";
  }

  public String getDimensions() {
    return dimensions;
  }

  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

  @Override
  public String toString() {
    return "Homeware [name=" + name + ", dimensions=" + dimensions + ", brand=" + brand + ", origin=" + origin
        + ", price=" + price + "]";
  }
}
