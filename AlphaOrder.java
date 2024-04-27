import java.util.Scanner;
public class AlphaOrder
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s = s.toUpperCase();
        String s1 = "";
        for (char l = 'A'; l <= 'Z'; l++) 
        {
            for (int i = 0; i < s.length(); i++) 
            {
                char c = s.charAt(i);
                if (l == c)
                    s1 += c;
            }
        }
        System.out.println("Alphabetical order: "+s1);
    }
}