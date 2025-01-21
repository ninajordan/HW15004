//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package stock;

public class StockMain {
  public static void main(String[] args) {
    Stock appleStock = new Stock("AAPL", "Apple Computer", 192.12);
    appleStock.setCurrentPrice(202.12);

    // Print the stock information
    System.out.println(appleStock);
  }
}
