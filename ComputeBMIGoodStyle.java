import java.util.Scanner;
public class ComputeBMIGoodStyle {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til scanner-klassen, integerdivision
     * typecasting, order-of-precedence, at bygge metoder og returnere
     * værdier
     *
     * OPGAVE:
     * Abstrakt formuleret: At kunne gemme to tal i ét tal 
     * konkret eksempel:
     * 1,75 og 65,5 gemmes i hver sin del af 100000
     * Så opgaven består i at lave en beregning på de to decimal-tal
     * så de bliver til ét heltal - i dette eksempel til 175655
     *
     * Det vil være en god øvelse at løse opgaven som beskrevet i bogens kap
     * 4.8. Dvs man bygger først en skal omkring selve den algoritmiske udfordring:
     * At gemme to tal i ét tal. Man kan jo bygge videre på den foregående opgave hvor
     * man istedet for de "globale" klassevariablerne benytter sig af "lokale" variabler, dvs variabler
     * som kun er kendt af den enkelte metode.
     *
     */

    int userRetVal=doDiag();
    double userBMI = computeBMI(userRetVal);
    doPrint(userBMI);
  }

  public static int doDiag() {
    int heightWeight;
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg (ex:63,4):");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde i meter(ex: 1,75):");
    double meterHoejde = myScan.nextDouble();
    // TODO: gemme højden i den øverste del af tallet (1750000) og vægten i den nederste del 175.63400
    heightWeight= (int)(meterHoejde * 100) * 100000; //til cm og så flyt 4 pladser
    heightWeight = heightWeight + (int)(kiloVægt * 1000);//til gr 
    return heightWeight;

  }
  public static double computeBMI(int userVal) {
    double height,weight;
    //TODO: regne baglæns så den øverste og nederste del trækkes ud
    // i to variable:
    height = userVal / 100000 / 100.0; // fjern alt under 4 pladser, derpå cm til m
    weight = (userVal % 100000) / 1000.0; // resten laves fra gr til kg
    double bmi = weight / ( height * height);
    return bmi;
  }

  public static void doPrint(double BMI) {
    System.out.println("BMI: " + BMI);
  }
}
