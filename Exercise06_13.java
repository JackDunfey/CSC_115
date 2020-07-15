public class Exercise06_13{
  public static double m(double n){
    if(n == 1)
      return 0.5;
    return (n/(n+1))+m(n-1);
  }
  public static void main(String[] args) {
    System.out.printf("i%-5sm(i)\n","");
    for(int i = 1; i <= 20; i++)
      System.out.printf("%-5d%.4f\n",i,m(i));
  }
}
