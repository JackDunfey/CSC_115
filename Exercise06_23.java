public class Exercise06_23{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static int count(String str, char a){
    int n = 0;
    for(char c : str.toCharArray()){
      if(c == a)
        n++;
    }
    return n;
  }
  public static void main(String[] args) {
    System.out.print("Enter a string: ");
    String text = stdin.nextLine();
    System.out.print("Enter a character: ");
    char c = stdin.next().charAt(0);
    System.out.printf("The number of occurrences of %c in %s is %d",c,text,count(text,c));
  }
}
