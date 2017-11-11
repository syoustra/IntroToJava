public class Example {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new Pez dispenser");
    System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n",
                      PezDispenser.MAX_PEZ);
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName()
                     );
    
  }

}