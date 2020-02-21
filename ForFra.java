class ForFra {
  public static void main(String[] args) {
    int age = 19;
    int mage = 39;
    int fage;
    double wage = 199.4;
    long storeNumer = (long) 1E18;
    boolean gameOver = false;
    String name = "Kurt";

    int sumage = age+mage;


    int length = name.length();
    if ((length > 1) && (wage > 200)) {
      // så gør et eller andet
      System.out.println("Du heddder " + name);
    }  else if (wage > 400) {
      System.out.println("du er ok som du er " + name);
    } else {
    System.out.println("Farvel");
    }

  }

}

