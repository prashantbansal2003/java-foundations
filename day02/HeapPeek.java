public class HeapPeek {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    long mb = 1024 * 1024;
    System.out.printf("Max heap    : %d MB%n", rt.maxMemory() / mb);
    System.out.printf("Used before : %d MB%n", (rt.totalMemory() - rt.freeMemory()) / mb);
    int[] big = new int[50_000_000]; // about 200 MB
    System.out.printf("Used after  : %d MB (array length %d)%n",
        (rt.totalMemory() - rt.freeMemory()) / mb, big.length);
  }
}
