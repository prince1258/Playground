import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int largest=arr[0];
      for(int i=0;i<n;i++)
      {
        if(largest<arr[i])
          largest=arr[i];
      }
      System.out.print(largest);
    }
}