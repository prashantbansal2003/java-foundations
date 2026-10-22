public class StackDemo {
  static void recurse(int depth) {
    if (depth % 5000 == 0) {
      System.out.println("depth " + depth);
    }
    recurse(depth + 1);
  }

  public static void main(String[] args) {
    recurse(1);
  }
}
