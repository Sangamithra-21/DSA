class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0;
       int j=0;
       int len=0;
       int max=0;
       HashMap<Character,Integer> str=new HashMap<>();
       while(i<s.length())
       {
           while(str.get(s.charAt(i))!=null)
           {
              str.remove(s.charAt(j));
              j++;
            }
            str.put(s.charAt(i),0);
            len=i-j+1;
            max=Math.max(len,max);
            i++;
       }
       return max;
    }
}

//Time Complexity: O(n)