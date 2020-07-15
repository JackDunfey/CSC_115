public class Exercise05_09{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static void main(String[] args){
    double max = 0;
    String mname = "";
    double backup = 0;
    String bname = "";
    System.out.print("Enter a number of students: ");
    int numberOfStudents = stdin.nextInt();
    for(int i = 0; i < numberOfStudents; i++){
      System.out.print("Enter a student name: ");
      String s = stdin.next();
      System.out.print("Enter a student score: ");
      double grade = stdin.nextDouble();
      if(grade > max){
        backup = max;
        bname = mname;
        max = grade;
        mname = s;
      } else if (grade > backup) {
        backup = grade;
        bname = s;
      }
    }
    System.out.println(mname+"'s score is "+max);
    System.out.println(bname+"'s score is "+backup);
  }
}
