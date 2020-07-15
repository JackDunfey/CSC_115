public class Exercise06_37{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static String format(int number, int width){
    StringBuilder str = new StringBuilder(String.valueOf(number));
    if(str.length() >= width)
      return str.toString();
    while (str.length() < width)
      str.insert(0,'0');
    return str.toString();
  }
  public static void main(String[] args) {
    System.out.print("Enter an Integer: ");
    int number = stdin.nextInt();
    System.out.print("Enter the width: ");
    int width = stdin.nextInt();
    System.out.println(format(number, width));
  }
}
