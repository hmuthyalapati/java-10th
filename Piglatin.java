import java.util.*;
public class Piglatin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s = sc.next();
        s = s.toUpperCase();
        String s1 = "", s2 = "", s3 = "";
        int pos = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                pos = i;
                break;
            }
        }
        s1=s.substring(pos);
        s2=s.substring(0,pos);
        s3=s1+s2+"AY";
        System.out.println(s3);
    }
}