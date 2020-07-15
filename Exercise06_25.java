public class Exercise06_25{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static String convertMillis(long millis){
    long hours = millis/1000/60/60;
    long minutes = millis/1000/60-hours*60;
    long seconds = millis/1000-minutes*60-hours*60*60;
    return String.format("%d:%d:%d",hours,minutes,seconds);
  }
  public static void main(String[] args) {
    System.out.print("Enter time in milliseconds: ");
    long millis = stdin.nextLong();
    System.out.println(convertMillis(millis));
  }
}
