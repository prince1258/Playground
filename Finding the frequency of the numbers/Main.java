import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int freq[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            freq[i] = 0;
        }
        for(int j = 0; j <= n - 1; j++){
           freq[arr[j] - 1]++;
        }
        for(int j = 0; j <= k - 1; j++){
           System.out.println((j + 1) + " " + freq[j]);
        }
    }
}