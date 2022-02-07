public class Exercise05_47{
  public static void main(String[] args) {
    var stdin = new java.util.Scanner(System.in);
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String s = stdin.next();
    try{
      int total = 0;
      for(int i = 0; i < 12; total += ((int) s.charAt(i) - 48) * (i++%2==0 ? 1 : 3));
      System.out.println("The ISBN-13 number is "+s+(total%10==0?0:10-total%10));
    } catch(Exception e){
      System.out.println(s+" is an invalid input");
    }
  }
}
