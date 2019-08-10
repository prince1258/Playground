import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String str1=str.replaceAll("[AEIOUaeiou]","");
    System.out.print(str1);
  }
}