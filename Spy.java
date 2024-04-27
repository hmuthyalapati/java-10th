import java.util.*;
public class Spy
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, prod = 1;
        while(temp > 0)
        {
            int d = temp%10;
            sum += d;
            prod *= d;
            temp = temp/10;
        }
        if(prod == sum)
            System.out.println(n + " is a spy number");
        else
            System.out.println(n + " is not a spy number");
    }
}