public class Main {

  public static void main(String[] args) {
    
  }
}

/*
Common characteristics

ITEM (Abstract)
Name
Brand
Price
Origin

PERISHABLES EXTENDS ITEM
Expiry
Halal
Storage instructions

DRINKS EXTENDS PERISHABLES
Volume

FOOD EXTENDS PERISHABLES
Weight

ALCOHOLIC DRINKS IMPLEMENTS ISALCOHOLIC
Alcohol Percentage
Age Verification

NON-PERISHABLES EXTENDS ITEM
Dimensions

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