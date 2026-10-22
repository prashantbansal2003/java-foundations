public class LoaderLab {
  public static void main(String[] args) {
    System.out.println("String         : " + String.class.getClassLoader());
    System.out.println("ArrayList      : " + java.util.ArrayList.class.getClassLoader());
    System.out.println("java.sql.Driver: " + java.sql.Driver.class.getClassLoader());
    System.out.println("LoaderLab      : " + LoaderLab.class.getClassLoader());
    System.out.println("Parent of app  : " + LoaderLab.class.getClassLoader().getParent());
    System.out.println("Parent of that : " + LoaderLab.class.getClassLoader().getParent().getParent());
    System.out.println(LoaderLab.class.getClassLoader().getClass().getName());
  }
}
