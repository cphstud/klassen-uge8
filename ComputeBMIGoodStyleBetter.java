import java.util.Scanner;
public class ComputeBMIGoodStyleBetter {

  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg (med max én decimal):");
    double weightKg = myScan.nextDouble();
    System.out.println("Indtast din højde i meter(med max to):");
    double heightM = myScan.nextDouble();
    // now compute returnval
    int retVal = doMasking(heightM,weightKg);
    return retVal;

  }

  public static int doMasking(double height, double weight) {
    int retVal = (int)(height * 100000 * 100) + (int)(weight*1000);
    return retVal;
  }

  public static double doMath(int totalVal) {
    // vi modtager 17563400
    double tmpH = (totalVal/100000)/100.0 ;
    double tmpW = (totalVal%100000)/1000.0 ;
    System.out.println(tmpH); 
    System.out.println(tmpW); 
    double BMI = tmpW/(tmpH*tmpH);
    return BMI;
  }

  public static void doPrint(double BMI) {
    System.out.println("BMI: " + BMI);
  }

  public static void main(String[] args){
    int retVal = doDiag();
    double bmi = doMath(retVal);
    doPrint(bmi);
  }
}
