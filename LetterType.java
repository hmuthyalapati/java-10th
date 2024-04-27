import java.util.*;
public class LetterType
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int lc=0, uc=0, sco=0, dc=0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isWhitespace(c))
                continue;
            if(Character.isUpperCase(c))
                uc++;
            else if(Character.isLowerCase(c))
                lc++;
            else if(Character.isDigit(c))
                dc++;
            else
                sco++;
        }
        System.out.println("Number of uppercase letters: "+uc);
        System.out.println("Number of lowercase letters: "+lc);
        System.out.println("Number of digits: "+dc);
        System.out.println("Number of special characters: "+sco);
    }
}