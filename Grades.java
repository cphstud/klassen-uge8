import java.util.Scanner;

public class Grades {
  static Scanner ms = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter points: ");
    int points = ms.nextInt();
    char grade = doGrade(points);
    System.out.printf("points:%d gave %c%n ",points,grade);
  }

  public static char doGrade(int p) {
    char retVal = 'F';
    if (p >= 80) {
      retVal = 'A';
    } else if (p >= 60) {
      retVal = 'B';
    } else if (p >= 40) {
      retVal = 'C';
    }else if (p >= 20) {
      retVal = 'D';
    }
    return retVal;
  }

}
