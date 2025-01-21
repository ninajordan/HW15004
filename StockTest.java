package stock;

public class StockTest {
  public static void main(String[] args) {
    testGetChangePercent();
    testSettersAndGetters();
  }

  // getChangePercent() method Tests
  public static void testGetChangePercent() {
    try {
      // changePercent is postive
      Stock stock1 = new Stock("AAPL", "Apple Computer", 150.00);
      stock1.setCurrentPrice(165.00); // 10% gain
      double result1 = stock1.getChangePercent();
      assert Math.abs(result1 - 10.0) < 0.001 : "Test failed: Expected 10.0, got " + result1;

      // changePercent is negative
      Stock stock2 = new Stock("GOOG", "Google Inc.", 200.00);
      stock2.setCurrentPrice(180.00); // 10% loss
      double result2 = stock2.getChangePercent();
      assert Math.abs(result2 + 10.0) < 0.001 : "Test failed: Expected -10.0, got " + result2;

      // test for no change percent or 0%
      Stock stock3 = new Stock("MSFT", "Microsoft Corp.", 100.00);
      stock3.setCurrentPrice(100.00); // No gain or loss
      double result3 = stock3.getChangePercent();
      assert result3 == 0.0 : "Test failed: Expected 0.0, got " + result3;

      // zero error for cost basis, should fail
      try {
        Stock stock4 = new Stock("TSLA", "Tesla Inc.", 0.00);
        stock4.setCurrentPrice(100.00);
        stock4.getChangePercent();
        assert false : "Test failed: Expected ArithmeticException for zero cost basis";
      } catch (ArithmeticException e) {
        System.out.println("Test passed: ArithmeticException thrown for zero cost basis");
      }

      System.out.println("All tests for getChangePercent() passed.");
    } catch (AssertionError e) {
      System.err.println(e.getMessage());
    }
  }

  // getters and setters test
  public static void testSettersAndGetters() {
    Stock stock = new Stock("NFLX", "Netflix Inc.", 300.00);
    stock.setCurrentPrice(350.00);
    stock.setCostBasis(320.00);

    assert stock.getSymbol().equals("NFLX") : "Test failed: Expected symbol 'NFLX'";
    assert stock.getName==().equals("Netflix Inc.") : "Test failed: Expected name 'Netflix Inc.'";
    assert stock.getCostBasis() == 320.00 : "Test failed: Expected cost basis 320.00";
    assert stock.getCurrentPrice() == 350.00 : "Test failed: Expected current price 350.00";

    System.out.println("passed.");
  }
}
