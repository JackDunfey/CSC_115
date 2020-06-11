import java.util.Scanner;
public class Exercise02_05{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gravity rate: ");
    double subtotal = scanner.nextDouble();
    double percentage = scanner.nextDouble();
    double tip = subtotal*percentage/100;
    System.out.print("The gratuity is $"+tip+" and total is $"+(subtotal+tip));
  }
}
