public class Exercise05_49{
  static java.util.Scanner stdin = new java.util.Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter a string: ");
    String s = stdin.nextLine();
    char[] vowels = {'a','e','i','o','u'};
    int vowel = 0;
    for(int i = 0; i < s.length(); i++){
      for(int j = 0; j < vowels.length; j++){
        if(s.charAt(i) == vowels[j]){
          vowel++;
          break;
        }
      }
    }
    System.out.println("The number of vowels is "+vowel);
    System.out.println("The number of consonants is "+(String.join("",s.split(" ")).length()-vowel));
  }
}
