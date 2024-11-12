public class Main {

  public static void main(String[] args) {
    
  }
}

/*
ITEM 
Name
Brand
Price
Origin
Weight

PERISHABLES EXTENDS ITEM
Expiry
Halal
Storage instructions

DRINKS EXTENDS PERISHABLES IMPLEMENTS ISLIQUID

ALCOHOLIC DRINKS EXTENDS DRINKS 
Alcohol Percentage

FOOD EXTENDS PERISHABLES
Weight

HOMEWARE EXTENDS ITEM

DETERGENTS EXTENDS ITEM IMPLEMENTS ISLIQUID

TOILETRIES EXTENDS ITEM IMPLEMENTS ISLIQUID


------

Classes
perishables
- dairy
- vegetables
- meats
- canned
- bread, cereals
- snacks

- Drinks
-- alcoholic
-- non-alcoholic

Interface / Abstract Base Class: 
- house brand?
- local brand?
- healthier choice
- halal?
- alcoholic?
- promo?
 */