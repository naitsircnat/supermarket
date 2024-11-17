import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Item>products=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    while (true){

      showMenu();

      String choice=getChoice(sc);

      if (choice.equals("1")){
        createItem(sc, products);
      } else if (choice.equals("2")) {
        listItems(products);
      } else if (choice.equals("3")) {
        deleteItem(sc, products);
      } else if (choice.equals("4")) {
        updateItem(sc, products);
      } else if (choice.equals("x")) {
        break;
      }
    }
  }

  public static void showMenu(){
    System.out.println();
    System.out.println("Select an option:");
    System.out.println("1. Create item");
    System.out.println("2. List items");
    System.out.println("3. Delete item");
    System.out.println("4. Update item");
    System.out.println("x. Exit");
  }

  public static String getChoice(Scanner sc){
    String choice=sc.nextLine();
    return choice;
  }

  public static void createItem(Scanner sc, ArrayList<Item>products){
    System.out.println("Perishable item? Type \"y\" or \"n\"");
    
    String isPerishable=sc.nextLine();
    
    if (isPerishable.equals("y")){
      System.out.println("Food or drink? Type \"f\" for food or \"d\" for drink");

      String foodOrDrink=sc.nextLine();

      if (foodOrDrink.equals("f")){
        createFood(sc, products);
      } else if (foodOrDrink.equals("d")){
        System.out.println("Non-alcoholic or alcoholic? Type \"n\" for non-alcoholic, \"a\" for alcoholic");

        String isAlcoholic=sc.nextLine();

        if(isAlcoholic.equals("n")){
          createDrink(sc, products);
        } else if (isAlcoholic.equals("a")){
          createAlcohol(sc, products);
        }
      }

    } else if (isPerishable.equals("n")){
      createNonPerishable(sc, products);
    }
  }

  public static void listItems(ArrayList<Item>products){
    System.out.println();
    for (int i=0; i<products.size(); i++){
      System.out.println(i + ") ");
      System.out.println(products.get(i));
      System.out.println();
    }
  }

  public static void deleteItem(Scanner sc, ArrayList<Item>products){
    System.out.println("Provide item no.");
    int itemNum=Integer.valueOf(sc.nextLine());

    if (itemNum>=0 || itemNum<products.size()) {
      products.remove(itemNum);
    }
  }

  public static void updateItem(Scanner sc, ArrayList<Item>products){
    System.out.println("Provide item no.");
    int itemNum=Integer.valueOf(sc.nextLine());

    if (itemNum>=0 || itemNum<products.size()) {
      Item item=products.get(itemNum);

      if (item instanceof NonPerishable){
        updateNonPerishable(sc, products, item);        
      } else if (item instanceof Food){
        updateFood(sc, products, item);        
      } else if (item instanceof Alcohol){
        updateAlcohol(sc, products, item);        
      } else if (item instanceof Drink){
        updateDrink(sc, products, item);        
      } 
    } 
  }

  public static void createNonPerishable(Scanner sc, ArrayList<Item>products){
    System.out.println("Item name?");
    String name=sc.nextLine();

    System.out.println("Brand?");
    String brand=sc.nextLine();

    System.out.println("Origin?");
    String origin=sc.nextLine();

    System.out.println("Price?");
    double price=Integer.valueOf(sc.nextLine());

    System.out.println("Dimensions?");
    String dimensions=sc.nextLine();

    NonPerishable nonPerishable=new NonPerishable(name, brand, origin, price, dimensions);

    products.add(nonPerishable);
  }

  public static void createFood(Scanner sc, ArrayList<Item>products){
    System.out.println("Item name?");
    String name=sc.nextLine();

    System.out.println("Brand?");
    String brand=sc.nextLine();

    System.out.println("Origin?");
    String origin=sc.nextLine();

    System.out.println("Price?");
    double price=Double.valueOf(sc.nextLine());

    System.out.println("Expiry?");
    String expiry=sc.nextLine();

    System.out.println("Halal?");
    String isHalal=sc.nextLine();

    System.out.println("Storage instructions?");
    String storageInstructions=sc.nextLine();

    System.out.println("Weight(kg)?");
    double weight=Double.valueOf(sc.nextLine());

    Food food=new Food(name, brand, origin, price, expiry, isHalal, storageInstructions, weight);

    products.add(food);
  }

  public static void createDrink(Scanner sc, ArrayList<Item>products){
    System.out.println("Item name?");
    String name=sc.nextLine();

    System.out.println("Brand?");
    String brand=sc.nextLine();

    System.out.println("Origin?");
    String origin=sc.nextLine();

    System.out.println("Price?");
    double price=Double.valueOf(sc.nextLine());

    System.out.println("Expiry?");
    String expiry=sc.nextLine();

    System.out.println("Halal?");
    String isHalal=sc.nextLine();

    System.out.println("Storage instructions?");
    String storageInstructions=sc.nextLine();

    System.out.println("Volume(ml)?");
    int vol=Integer.valueOf(sc.nextLine());

    Drink drink=new Drink(name, brand, origin, price, expiry, isHalal, storageInstructions, vol);

    products.add(drink);
  }

  public static void createAlcohol(Scanner sc, ArrayList<Item>products){
    System.out.println("Item name?");
    String name=sc.nextLine();

    System.out.println("Brand?");
    String brand=sc.nextLine();

    System.out.println("Origin?");
    String origin=sc.nextLine();

    System.out.println("Price?");
    double price=Double.valueOf(sc.nextLine());

    System.out.println("Expiry?");
    String expiry=sc.nextLine();

    System.out.println("Halal?");
    String isHalal=sc.nextLine();

    System.out.println("Storage instructions?");
    String storageInstructions=sc.nextLine();

    System.out.println("Volume(ml)?");
    int vol=Integer.valueOf(sc.nextLine());

    System.out.println("Alcohol percentage?");
    double alcoholPercent=Double.valueOf(sc.nextLine());

    Alcohol alcohol=new Alcohol(name, brand, origin, price, expiry, isHalal, storageInstructions, vol, alcoholPercent);

    products.add(alcohol);
  }

  public static void updateNonPerishable(Scanner sc, ArrayList<Item>products, Item item){
    System.out.println("New item name?");
    String name=sc.nextLine();
    item.setName(name);

    System.out.println("New brand?");
    String brand=sc.nextLine();
    item.setBrand(brand);

    System.out.println("New origin?");
    String origin=sc.nextLine();
    item.setOrigin(origin);

    System.out.println("New price?");
    double price=Integer.valueOf(sc.nextLine());
    item.setPrice(price);

    System.out.println("New dimensions?");
    String dimensions=sc.nextLine();
    ((NonPerishable)item).setDimensions(dimensions);
  }

  public static void updateFood(Scanner sc, ArrayList<Item>products, Item item){

    System.out.println("New item name?");
    String name=sc.nextLine();
    item.setName(name);

    System.out.println("New brand?");
    String brand=sc.nextLine();
    item.setBrand(brand);

    System.out.println("New origin?");
    String origin=sc.nextLine();
    item.setOrigin(origin);

    System.out.println("New price?");
    Double price=Double.valueOf(sc.nextLine());
    ((Food)item).setPrice(price);

    System.out.println("New expiry?");
    String expiry=sc.nextLine();
    ((Food)item).setExpiry(expiry);

    System.out.println("Halal?");
    String isHalal=sc.nextLine();
    ((Food)item).setHalal(isHalal);

    System.out.println("Storage instructions?");
    String storageInstructions=sc.nextLine();
    ((Food)item).setStorageInstructions(storageInstructions);

    System.out.println("Weight(kg)?");
    double weight=Double.valueOf(sc.nextLine());
    ((Food)item).setWeight(weight);
  }

  public static void updateDrink(Scanner sc, ArrayList<Item>products, Item item){

    System.out.println("New item name?");
    String name=sc.nextLine();
    item.setName(name);

    System.out.println("New brand?");
    String brand=sc.nextLine();
    item.setBrand(brand);

    System.out.println("New origin?");
    String origin=sc.nextLine();
    item.setOrigin(origin);

    System.out.println("New price?");
    Double price=Double.valueOf(sc.nextLine());
    item.setPrice(price);

    System.out.println("New expiry?");
    String expiry=sc.nextLine();
    ((Drink)item).setExpiry(expiry);

    System.out.println("Halal?");
    String isHalal=sc.nextLine();
    ((Drink)item).setHalal(isHalal);

    System.out.println("New storage instructions?");
    String storageInstructions=sc.nextLine();
    ((Drink)item).setStorageInstructions(storageInstructions);

    System.out.println("New volume(ml)?");
    int vol=Integer.valueOf(sc.nextLine());
    ((Drink)item).setVol(vol);

    System.out.println("Test");
  }

  public static void updateAlcohol(Scanner sc, ArrayList<Item>products, Item item){

    System.out.println("New item name?");
    String name=sc.nextLine();
    item.setName(name);

    System.out.println("New brand?");
    String brand=sc.nextLine();
    item.setBrand(brand);

    System.out.println("New origin?");
    String origin=sc.nextLine();
    item.setOrigin(origin);

    System.out.println("New price?");
    Double price=Double.valueOf(sc.nextLine());
    item.setPrice(price);

    System.out.println("New expiry?");
    String expiry=sc.nextLine();
    ((Alcohol)item).setExpiry(expiry);

    System.out.println("Halal?");
    String isHalal=sc.nextLine();
    ((Alcohol)item).setHalal(isHalal);

    System.out.println("New storage instructions?");
    String storageInstructions=sc.nextLine();
    ((Alcohol)item).setStorageInstructions(storageInstructions);

    System.out.println("New volume(ml)?");
    int vol=Integer.valueOf(sc.nextLine());
    ((Alcohol)item).setVol(vol);

    System.out.println("New alcohol percentage?");
    double alcoholPercent=Double.valueOf(sc.nextLine());
    ((Alcohol)item).setAlcoholPercent(alcoholPercent);
  }
}

/*Refactor toStrings */


