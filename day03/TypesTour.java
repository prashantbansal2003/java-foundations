public class TypesTour {
  static byte b;
  static short s;
  static int i;
  static long l;
  static float f;
  static double d;
  static char c;
  static boolean flag;
  static String text;

  public static void main(String[] args) {
    System.out.println("=== Ranges ===");
    System.out.println("byte   : " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
    System.out.println("short  : " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
    System.out.println("int    : " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
    System.out.println("long   : " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
    System.out.println("float  : " + Float.MIN_VALUE + " .. " + Float.MAX_VALUE);
    System.out.println("double : " + Double.MIN_VALUE + " .. " + Double.MAX_VALUE);
    System.out.println("char   : " + (int) Character.MIN_VALUE + " .. " + (int) Character.MAX_VALUE);
    System.out.println();
    System.out.println("=== Default values of fields ===");
    System.out.println("byte=" + b + " short=" + s + " int=" + i + " long=" + l);
    System.out
        .println("float=" + f + " double=" + d + " char code=" + (int) c + " boolean=" + flag + " String=" + text);
    System.out.println();
    var year = 2026;
    var price = 99.5;
    var name = "Java";
    System.out.println(year + " " + price + " " + name);
  }
}
