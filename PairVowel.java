import java.util.*;
public class PairVowel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        String s1 = "";
        int vc = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                char d = s.charAt(i+1);
                if(d=='A'||d=='E'||d=='I'||d=='O'||d=='U')
                {
                    s1 += Character.toString(c)+Character.toString(d)+",";
                    vc++;
                }
            }
        }
        System.out.println("Pair of vowels: "+s1);
        System.out.println("No. of pair of vowels: "+vc);
    }
}