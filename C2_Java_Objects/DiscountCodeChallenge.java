// For this first task, create a new private method named normalizeDiscountCode. It should take the discount code that is passed into the method and return the uppercase version. Call it from the current applyDiscountCode method and set this.discountCode to the result.
// In the normalizeDiscountCode verify that only letters or the $ character are used. If any other character is used, throw a IllegalArgumentException with the message Invalid discount code.

public class Order {
  private String itemName;
  private int priceInCents;
  private String discountCode;

  public Order(String itemName, int priceInCents) {
    this.itemName = itemName;
    this.priceInCents = priceInCents;
  }
  
  private String normalizeDiscountCode(String discountCode) {
    for (char letter : discountCode.toCharArray()) {
      if (! Character.isLetter(letter) && letter != '$') {
        throw new IllegalArgumentException("Invalid discount code.");
      }
    }
    return discountCode.toUpperCase();
  }

  public String getItemName() {
    return itemName;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public String getDiscountCode() {
    return discountCode;
  }

  public void applyDiscountCode(String discountCode) {
    this.discountCode = normalizeDiscountCode(discountCode);
  }
}

