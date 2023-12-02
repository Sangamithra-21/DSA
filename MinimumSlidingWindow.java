class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
        {
            return "";
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0,j=0,count=map.size();
        int left=0,right=s.length()-1, min = s.length();
        boolean found=false;
        while(j<s.length())
        {
            char b=s.charAt(j++);
            if(map.containsKey(b))
            { 
                map.put(b,map.get(b)-1);
                if(map.get(b)==0)
                {
                    count=count-1;
                }
            }
            if(count > 0)
            {
                continue;
            }
            while(count == 0)
            {
                char c=s.charAt(i++);
                 if(map.containsKey(c))
            { 
                map.put(c,map.get(c)+1);
                if(map.get(c)>0)
                {
                    count=count+1;
                }
            }
            }
            if((j-i)<min)
            {
                left=i;
                right=j;
                min=j-i;
                found=true;
            }


        }

        return !found ? "" : s.substring(left-1,right);
    }
}

// Time Complxity : O(T+S)
// Space Complexity : O(T)