public class Exercise06_07{
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter investment amount: ");//1000.56
    double investmentAmount = scanner.nextDouble();
    System.out.print("Enter annual interest rate in percentage: ");//4.25
    double monthlyInterestRate = scanner.nextDouble()/100/12;
    System.out.println("Years Future Value");
    for(int i = 1; i <= 30; i++){
      System.out.printf("%d %11.2f\n",i,futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
    }
  }
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
    return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
  }
}
