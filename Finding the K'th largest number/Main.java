import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int k=in.nextInt();
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]<arr[j])
          {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }  
        }
        if(i==k-1)
          System.out.print(arr[i]+" ");
      }
    }   
}