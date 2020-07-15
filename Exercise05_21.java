public class Exercise05_21{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static void main(String[] args){
    double percentage = 5.0;
    System.out.print("Loan Amount: ");
    int amount = stdin.nextInt();
    System.out.print("Numer of Years: ");
    int n = stdin.nextInt()*12;//number of years
    System.out.println("Interest Rate Monthly Payment Total Payment");
    while(percentage <= 8.0){
      System.out.print(String.format("%.3f ",percentage));
      double r = percentage/100/12;
      double monthly = amount/((Math.pow(1+r,n)-1)/(r*Math.pow(1+r,n)));
      System.out.print(monthly+" ");
      System.out.println(monthly*n);
      percentage += 0.125;
    }
  }
}
