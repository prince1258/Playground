import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int i,j,z=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(z%2==0)
            System.out.print("#");
          else
            System.out.print("*");
          z++;
        }
        System.out.print("\n");
    }
}
}