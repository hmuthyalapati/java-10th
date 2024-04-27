import java.util.*;
public class VowConso
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 letters: ");
        String s = sc.nextLine();
        if(s.length() != 20)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        s = s.toUpperCase();
        int vCount = 0, cCount = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                vCount++;
            else
                cCount++;
        }
        System.out.println("Number of vowels: "+vCount);
        System.out.println("Number of consonants: "+cCount);
    }
}