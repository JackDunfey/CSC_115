import java.util.*;
public class Exercise05_41{
  public static void main(String[] args){
    var scanner = new Scanner(System.in);
    int max = 0;
    int count = 1;
    for(;;){
      System.out.print("Enter an integer (0: for end of input): ");
      int n = scanner.nextInt();
      if(n == 0)
        break;
      if(n > max){
        max = n;
        count = 1;
      } else if (n == max)
        count++;
    }
    if(max == 0)
      System.out.println("No numbers are entered except 0");
    System.out.println("The largest number is "+max);
    System.out.println("The occurrence count of the largest number is "+count);
  }
}
