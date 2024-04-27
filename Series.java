import java.util.*;
public class Series
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                int b = 1;
                for(int i=1; i<=10; i++)
                {
                    if(i%2==0)
                        System.out.print(-b + ",");
                    else
                        System.out.print(b + ",");
                    b += 2;
                }
                break;
            case 2:
                System.out.println("Enter n and a: ");
                int n=sc.nextInt();
                int a=sc.nextInt();
                double sum=0;
                for(int i=1; i<=n; i++)
                {
                    sum+=i/Math.pow(a,i+1);
                }
                System.out.println("The sum is: "+sum);
                break;
            default: 
                System.out.println("Invalid input");
        }
    }
}