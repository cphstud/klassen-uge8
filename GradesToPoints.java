import java.util.Scanner;

public class GradesToPoints {
  static Scanner ms = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter Grade: ");
    String gradeString = ms.nextLine();
    char grade = gradeString.charAt(0);
    int points = doGrade(grade);
    String format = "the grade %c is given for points above %d%n";
    if (points == 0) {
      points=20;
      format = "the grade %c is given for points below %d%n";
    }
    System.out.printf(format, grade,points);
  }

  public static int doGrade(char c) {
    int retVal = 20;
    switch(c) {
      case 'A': retVal=80;break;
      case 'B': retVal=60;break;
      case 'C': retVal=40;break;
      case 'D': retVal=20;break;
      default: retVal=0;break;
    }
    return retVal;
  }

}
