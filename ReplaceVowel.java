import java.util.*;
public class ReplaceVowel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        String s1 = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                s1+=(char)(c+1);
            else
                s1+=c;
        }
        System.out.println(s1);
    }
}