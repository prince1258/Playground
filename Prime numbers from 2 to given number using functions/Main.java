import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++)
      {
        int c=0;
        for(int j=1;j<=i;j++)
        {
          if(i%j==0)
          {
            c++;
          }
        }
        if(c==2)
        {
          System.out.println(i);
      }
	}
}
}