public class InitDemo {
  static class Lazy {
    static int CONSTANT = 42; // compile-time constant
    static int counter = 0; // ordinary static field
    static {
      System.out.println("  [Lazy] static initialiser runs");
    }

    static void touch() {
      System.out.println("  [Lazy] touch() called");
    }
  }

  public static void main(String[] args) {
    System.out.println("main started");
    System.out.println("Reading constant: " + Lazy.CONSTANT);
    System.out.println("About to call touch()");
    Lazy.touch();
    System.out.println("main finished");
  }
}
