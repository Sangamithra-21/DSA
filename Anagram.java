import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
/* 
public class Anagram
{
    public static void main(String[] args)
    {
        String a="xyz";
        String b="afdgzyksidfm";
        int len=a.length();
        int i;
        int flag=0;
        for(i=0;i<=b.length()-len;i++)
        {
            String str=b.substring(i,i+len);
            if(checkAnagram(a,str))
            {
                flag=1;
                System.out.println("True");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("False");
        }

    }
    private static boolean checkAnagram(String a,String str)
    {
        char arr1[]=a.toCharArray();
        char arr2[]=str.toCharArray();
         
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
        return Arrays.equals(arr1,arr2);

    }
}

*/

public class Anagram{
    public static void main(String[] args)
    {
        String a="zte";
        String b="agreztxuiw";
        int len=a.length();
        int flag=0;
        char[] str1=a.toCharArray();
        Arrays.sort(str1);
        String s1=new String(str1);
        int i;
        for(i=0;i<b.length()-len;i++)
        {
            String an1=b.substring(i,i+len);
            char[] str2=an1.toCharArray();
            Arrays.sort(str2);
            String s2=new String(str2);
            if(s1.equals(s2))
            {
                flag=1;
                System.out.println("True");
                break;
            }
            
        }
         if(flag==0)
            {
                System.out.println("False");
            }
    }
}
