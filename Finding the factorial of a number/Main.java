import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
      	Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println(factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
    
