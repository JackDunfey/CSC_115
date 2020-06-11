public class Exercise02_21{
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter investment amount: ");//1000.56
    double investmentAmount = scanner.nextDouble();
    System.out.print("Enter annual interest rate in percentage: ");//4.25
    double monthlyInterestRate = scanner.nextDouble()/100/12;
    System.out.print("Enter number of years: ");//1
    double numberOfYears = scanner.nextDouble();
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,numberOfYears * 12);
    System.out.print("Future value is $"+futureInvestmentValue);//$1043.92
  }
}
