public class Exercise01_11{
  public static void main(String[] args) {
    double spy = 31536000;
    double prev = 312032486;
    for(int i = 0; i < 5; i++){
      double temp = prev;
      temp += spy / 7;
      temp -= spy / 13;
      temp += spy / 45;
      prev = temp;
      System.out.println("Population after "+(i+1)+" year: "+temp);
    }
  }
}
