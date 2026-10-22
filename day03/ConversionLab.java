public class ConversionLab {
  public static void main(String[] args) {
    int big = Integer.MAX_VALUE;
    System.out.println("MAX_VALUE        : " + big);
    System.out.println("MAX_VALUE + 1    : " + (big + 1));
    long safe = (long) big + 1;
    System.out.println("(long) + 1       : " + safe);
    System.out.println("(byte) 130       : " + (byte) 130);
    System.out.println("(byte) 200       : " + (byte) 200);
    System.out.println("(int) 3.99       : " + (int) 3.99);
    System.out.println("(int) -3.99      : " + (int) -3.99);
    System.out.println("Math.round(3.5)  : " + Math.round(3.5));
    System.out.println("10 / 3           : " + 10 / 3);
    System.out.println("10 / 3.0         : " + 10 / 3.0);
    System.out.println("-7 / 2           : " + -7 / 2);
    System.out.println("-7 % 2           : " + -7 % 2);
    System.out.println("0.1 + 0.2        : " + (0.1 + 0.2));
    System.out.println("0.1f + 0.2f      : " + (0.1f + 0.2f));
    System.out.println("0.1 + 0.2 == 0.3 : " + (0.1 + 0.2 == 0.3));
    System.out.println("'a' + 1          : " + ('a' + 1));
    System.out.println("(char)('a' + 1)  : " + (char) ('a' + 1));
    System.out.println("1.0 / 0          : " + 1.0 / 0);
    System.out.println("0.0 / 0          : " + 0.0 / 0);
  }
}
