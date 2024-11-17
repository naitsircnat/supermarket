import java.util.Scanner;
import java.util.ArrayList;


public class Main {

  public static void main(String[] args) {
    ArrayList<Item>Products=new ArrayList<>();

    Scanner sc=new Scanner(System.in);

    while (true){
      showMenu();

      String choice =getChoice(sc);

      if (choice.equals("1")){
        createItem();
      } else if (choice.equals("2")) {
        listItems();
      } else if (choice.equals("3")) {
        deleteItem();
      } else if (choice.equals("4")) {
        updateItem();
      } else if (choice.equals("x")) {
        break;
      }
    }
  }

  public static void showMenu(){
    System.out.println("Select an option:");
    System.out.println("1. Create item");
    System.out.println("2. List items");
    System.out.println("3. Delete item");
    System.out.println("4. Update item");
    System.out.println("x. Exit");
  }

  public static String getChoice(Scanner scanner){
    String choice=scanner.nextLine();
    return choice;
  }

  public static void createItem(Scanner scanner){
    System.out.println("Perishable item? Type \"y\" or \"n\"");
    
    String isPerishable=scanner.nextLine();
    
    if (isPerishable.equals("y")){
      System.out.println("Food or drink? Type \"f\" for food or \"d\" for drink");
    } else if (isPerishable.equals("n")){
      System.out.println("Item name?");
      String name=scanner.nextLine();

      System.out.println("Brand?");
      String brand=scanner.nextLine();

      System.out.println("Origin?");
      String origin=scanner.nextLine();

      System.out.println("Price?");
      double price=Integer.valueOf(scanner.nextLine());

      System.out.println("Dimensions?");
      String dimensions=scanner.nextLine();

      NonPerishable nonPerishable=new NonPerishable(name, brand, origin, price, dimensions);
    }
  }

  public static void listItems(){
    
  }

  public static void deleteItem(){
    
  }

  public static void updateItem(){
    
  }
}
