import java.util.Scanner;

public class ComputePayments {
  static Scanner ms;

  public static void main(String[] args) {
    ms = new Scanner(System.in);
    System.out.println("Antal år: ");
    int totalYear = ms.nextInt();
    System.out.println("Årlig rentesats: ");
    double yIR = ms.nextDouble();
    System.out.println("Hovedstol: ");
    double HS = ms.nextDouble();
    int monthlyP = (int) computeMonthlyPay(totalYear,yIR,HS);
    System.out.printf("for %r er %d%n",HS,monthlyP);
  }

  public static double computeMonthlyPay(int ty, double yIR, double HS) {
    // 4.25
    // månedlig termin n
    double retVal=0;
    int mR = ty*12;
    double mIR = yIR / 12.0 / 100.0;
    retVal=HS*(mIR*Math.pow(1+mIR,mR)/((Math.pow(1+mIR,mR))-1));
    System.out.println(retVal);
    return retVal;
  }

  

}
