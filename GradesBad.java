import java.util.Scanner;

public class Grades {
  static Scanner ms = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter points: ");
    int points = ms.nextInt();
    char Grade = doGrade(points);
  }

  public static char doGrade(int p) {
    char retVal = 'F';
    if (p > 80) {
      retVal = 'A';
    }
    if (p > 60) {
      retVal = 'B';
    }
    if (p > 40) {
      retVal = 'C';
    }
    if (p > 20) {
      retVal = 'D';
    }

    return retVal;

  }

}
