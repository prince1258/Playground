import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int i,p,sum=0,rem;
      p=num;
      while(num>0)
      {
        rem=num%10;
        sum=(rem*rem*rem)+sum;
          num=num/10;
      }
      if(p==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}