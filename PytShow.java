public class Simple {
  public static void main(String[] args) {
    int a = 23;
    boolean t = false;
    if(t) {
      System.out.println("what??");
      t=false;
    } else if (!t) {
      System.out.println("ok");
      t=true;
    }
    if (t) {
      System.out.println("last ok");
    }
  }
}
