/*
 * FORMÅL:
 * At få kendskab til scanner-klassen, at bygge metoder og returnere
 * værdier
 *
 * Opgave
 * 1) Lad brugeren indtaste en pris.
 * Definér en konstant som er momssatsen
 * Lav en metode som returnerer momsdelen af beløbet
 * exempel:
 * minPris = 345,25
 *
 * Programmet skal udskrive flg i main-metoden:
 * Momsen udgør: 86,31
 *
 *
 */

//TODO: Skriv hele java-filen med en main-metode og én metode
//der returner momsen
import java.util.Scanner;
public class ComputeVAT {
  final static int PRCVAT = 25;

  public static void main(String[] args){

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast varens pris: ");
    double number = myScan.nextDouble();
    double moms = doVAT(number);
    System.out.printf("Momsen udgør: %.2f%n",moms);

  }
  public static double doVAT(double number){
    double VAT = number / 100.0 * PRCVAT; 
    return VAT;
  }
}
