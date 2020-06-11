public class Exercise02_07{
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    int minutes = scanner.nextInt();
    int years = minutes/60/24/365;
    int days = (minutes-(years*365*24*60))/(24*60);
    System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
  }
}
