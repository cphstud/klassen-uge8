import java.util.Scanner;

public class ComputeSum {
  static Scanner ms;

  public static void main(String[] args) {
    ms = new Scanner(System.in);
    System.out.println("Enter number for tværsum: ");
    int number = ms.nextInt();
    int sum = ComputeSum(number);
    System.out.printf("tværsum for %d er %d%n",number,sum);
  }
  public static int ComputeSum(int number){
    int sum = 0;
    int hundreder = number / 100;
    int rest = number % 100;
    int tiere = rest / 10;
    rest = rest % 10;
    sum = hundreder + tiere + rest;
    return sum;
  }
}
