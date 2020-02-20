import java.util.Scanner;
public class ComputeVATBlock {
  final static int PRCVAT = 25;
  static boolean enter = true;

  public static void main(String[] args){

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast varens pris: ");
    if (enter) 
    {
      int x = 12;
      x++;
      System.out.println("Kurt " + x);
    }
    
    double number = 345.34;
    double moms = doVAT(number);
    System.out.printf("Momsen udgør: %.2f%n",moms);

  }
  public static double doVAT(double number){
    double VAT = number / 100.0 * PRCVAT; 
    return VAT;
  }
}
