import java.util.*;
public class Floyd_Triangle
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                int a=1;
                for(int i=1; i<=5; i++)
                {
                    for (int j=1; j<=i; j++)
                    {
                        System.out.print(a+" ");
                        a++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter the word: ");
                String s=sc.next();
                int l=s.length();
                for(int i=1; i<=l; i++)
                {
                    int pos=0;
                    for(int j=1; j<=i; j++)
                    {
                        char b=s.charAt(pos);
                        System.out.print(b+" ");
                        pos++;
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}