import java.util.*;
public class FrameWord
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        String s1 = "";
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isWhitespace(c))
                s1+=s.charAt(i+1);
            else if(i==0)
                s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}