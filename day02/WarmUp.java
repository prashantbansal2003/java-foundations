public class WarmUp {
  static long work(int n) {
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += i % 7;
    }
    return sum;
  }

  public static void main(String[] args) {
    for (int round = 1; round <= 6; round++) {
      long start = System.nanoTime();
      long result = work(20_000_000);
      long ms = (System.nanoTime() - start) / 1_000_000;
      System.out.printf("Round %d: %d ms (result %d)%n", round, ms, result);
    }
  }
}
