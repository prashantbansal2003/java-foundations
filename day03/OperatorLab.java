public class OperatorLab {
  public static void main(String[] args) {
    System.out.println("1) 7 / 2              = " + 7 / 2);
    System.out.println("2) -7 % 3             = " + -7 % 3);
    System.out.println("3) 7 / 2.0            = " + 7 / 2.0);
    System.out.println("4) 2 + 3 * 4 - 6 / 2  = " + (2 + 3 * 4 - 6 / 2));
    System.out.println("5) 10 - 4 - 3         = " + (10 - 4 - 3));
    System.out.println("6) \"1\" + 2 + 3        = " + ("1" + 2 + 3));
    System.out.println("7) 1 + 2 + \"3\"        = " + (1 + 2 + "3"));
    int a = 5;
    int r = a++ + ++a;
    System.out.println("8) a++ + ++a          = " + r + " (a is now " + a + ")");
    System.out.println("9) 5 > 3 || 1 / 0 > 0 = " + (5 > 3 || 1 / 0 > 0));
    System.out.println("10) 6&3, 6|3, 6^3     = " + (6 & 3) + ", " + (6 | 3) + ", " + (6 ^ 3));
    System.out.println("11) 1<<4, -16>>2      = " + (1 << 4) + ", " + (-16 >> 2));
    int x = 10;
    x += 3.7;
    System.out.println("12) x += 3.7          = " + x);
  }
}
