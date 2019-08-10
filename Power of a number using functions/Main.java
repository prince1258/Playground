import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner (System.in);
    int x=in.nextInt();
     int y=in.nextInt();
   //  int z=in.nextInt();
    int i,pow=1;
    for(i=1;i<=y;i++)
    {
      pow=pow*x;
    }
    System.out.print(pow);
  }
}