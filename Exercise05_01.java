public class Exercise05_01{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static void main(String[] args){
    java.util.ArrayList<Integer> array = new java.util.ArrayList<>();
    for(;;){
      int n = stdin.nextInt();
      if(n == 0){
        break;
      }
      array.add(n);
    }
    if(array.isEmpty()){
      System.out.println("No numbers are entered except 0");
    } else {
      int positive_count = 0;
      int negative_count = 0;
      int total = 0;
      for(int i = 0; i < array.size(); i++){
        if(array.get(i) > 0){
          positive_count++;
        } else {
          negative_count++;
        }
        total += array.get(i);
      }
      System.out.println("The number of positives is "+positive_count);
      System.out.println("The number of negatives is "+negative_count);
      System.out.println("The total is "+total);
      System.out.println("The average is "+((double) total / array.size()));
    }
  }
}
