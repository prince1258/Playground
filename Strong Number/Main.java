import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int i,p,fact=1,sum=0,rem;
      p=num;
      while(num>0)
        {
        fact=1;
        rem=num%10;
      for(i=1;i<=rem;i++)
      {
        fact=fact*i;
      }
      sum=sum+fact;
      num=num/10;
      }
      if(p==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}