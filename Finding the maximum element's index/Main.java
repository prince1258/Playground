import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int max_index=0;
    if(arr[0]<arr[1])
      max_index=1;
    else
      max_index=0;
    for(int j=2;j<n;j++)
    {
      if(arr[max_index]<arr[j])
        max_index=j;
    }
    System.out.print(max_index);
  }
}