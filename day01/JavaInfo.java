public class JavaInfo {
  public static void main(String[] args) {
    System.out.println("=== Meet your JVM ===");
    System.out.printf("Java version : %s%n", System.getProperty("java.version"));
    System.out.printf("Java vendor  : %s%n", System.getProperty("java.vendor"));
    System.out.printf("Java home    : %s%n", System.getProperty("java.home"));
    System.out.printf("OS           : %s (%s)%n", System.getProperty("os.name"), System.getProperty("os.arch"));
    System.out.printf("User         : %s%n", System.getProperty("user.name"));
    System.out.printf("Working dir  : %s%n", System.getProperty("user.dir"));
    Runtime rt = Runtime.getRuntime();
    System.out.printf("CPU cores    : %d%n", rt.availableProcessors());
    System.out.printf("Max heap     : %.1f MB%n", rt.maxMemory() / 1024.0 / 1024.0);
  }
}
