public class SwapLab {
  public static void main(String[] args) {
    int a = 7, b = 12;
    int temp = a;
    a = b;
    b = temp;
    System.out.println("temp swap     : a=" + a + " b=" + b);

    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("add/sub swap  : a=" + a + " b=" + b);

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("xor swap      : a=" + a + " b=" + b);

    int p = Integer.MAX_VALUE, q = 5;
    p = p + q;
    q = p - q;
    p = p - q;
    System.out.println("int overflow  : p=" + p + " q=" + q);

    double x = 1e16, y = 1.0;
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("double swap   : x=" + x + " y=" + y);
  }
}
