import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int [n];
      
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int element1=in.nextInt();
      int element2=in.nextInt();
      int element1_pos=-1;
      int element2_pos=-1;
      for(int i=0;i<n;i++)
      {
        if(element1==arr[i])
          element1_pos=i;
        if (element2==arr[i])
          element2_pos=i;
      }
      System.out.println(element1_pos);
      System.out.println(element2_pos);
      }
    }
