public class Exercise01_01Extra{
  public static void main(String[] args) {
    String equation = "3x^2 + 4x + 5";
    String[] terms = equation.replace(" ", "").split("(\\+|-)");
    double a = Double.valueOf(terms[0].substring(0,terms[0].indexOf("x")));
    double b = Double.valueOf(terms[1].replaceAll("[^0-9\\+-]",""));
    double c = Double.valueOf(terms[2]);
    System.out.println(Math.pow(b,2)-4*a*c);
  }
}
