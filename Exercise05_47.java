public class Exercise05_47{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String s = stdin.next();
    try{
      int total = 0;
      for(int i = 0; i < 12; i++){
        total += ((int) s.charAt(i) - 48) * (i%2==0 ? 1 : 3);
      }
      System.out.println("The ISBN-13 number is "+s+(10-total%10 == 10 ? 0 : 10-total%10));
    } catch(Exception e){
      System.out.println(s+" is an invalid input");
    }
  }
}
