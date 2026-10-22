import java.math.BigDecimal;

public class MoneyLab {
  public static void main(String[] args) {
    double total = 0;
    for (int i = 0; i < 10; i++) {
      total += 0.10;
    }
    System.out.println("double     10 x 0.10 = " + total);

    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < 10; i++) {
      sum = sum.add(new BigDecimal("0.10"));
    }
    System.out.println("BigDecimal 10 x 0.10 = " + sum);

    long paise = 0;
    for (int i = 0; i < 10; i++) {
      paise += 10;
    }
    System.out.printf("integer paise        = %d (= %d.%02d)%n", paise, paise / 100, paise % 100);
  }
}
