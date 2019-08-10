import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int i = 0; i <= arr_size - 1; i++){
           arr[i] = in.nextInt();
       }
       // Function call
       subsets_of_size_3(arr_size, arr);
    }
    public static void subsets_of_size_3(int arr_size, int arr[])
    {
        for(int l= 0; l<= arr_size - 2; l++)
        {
            for(int m =l + 1;m<= arr_size - 1; m++)
            {
                for(int n= m+ 1; n<= arr_size - 1;n++)
                {
                    System.out.print("(" + arr[l] + "," + " " + arr[m] + "," + " " + arr[n] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}
