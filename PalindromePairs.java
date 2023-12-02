// 1)Solution 1
import java.util.ArrayList;
import java.util.List;
public class PalindromePairs{
    public static void main(String[] args)
    {
        String[] words={"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(checkPalindrome(words[i],words[j]))
                {
                    List<Integer> val=new ArrayList<>();
                    val.add(i);
                    val.add(j);
                    result.add(val);
                }
                if(checkPalindrome(words[j],words[i]))
                {
                    List<Integer> val=new ArrayList<>();
                    val.add(j);
                    val.add(i);
                    result.add(val);
                }
              
            }
        }
        for(List s : result)
        {
             System.out.println(s);
        }
    }
        private static boolean checkPalindrome(String words1,String words2)
        {
            String s=words1+words2;
            int t=s.length();
            for(int k=0;k<t/2;k++)
            {
                if(s.charAt(k) != s.charAt(t-k-1))
                {
                    return false;
                }
            }
            return true;
        }
    }
