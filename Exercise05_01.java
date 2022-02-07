import java.util.*;
public class Exercose05_01{
  public static void main(String[] args){
    var stdin = new Scanner(System.in);
    var array = new ArrayList<Integer>();
    for(;;){
      int n = stdin.nextInt();
      if(n == 0)
        break;
      array.add(n);
    }
    if(array.isEmpty()){
      System.out.println("No numbers are entered except 0");
    } else {
      int[] count = new int[2];
      int total = 0;
      for(int i = 0; i < array.size(); count[array.get(i)>0?0:1]++, total+=array.get(i++));
      System.out.println("The number of positives is "+count[0]);
      System.out.println("The number of negatives is "+count[1]);
      System.out.println("The total is "+total);
      System.out.println("The average is "+((double) total / array.size()));
    }
  }
}
