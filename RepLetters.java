import java.util.*;
public class RepLetters
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s=sc.next();
        String s1="";
        char t=' ';
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(t!=c)
                  s1+=c;
            t=c;
        }
        System.out.println(s1);
    }
}