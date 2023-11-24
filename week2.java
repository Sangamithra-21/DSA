// 1)Additive Number 

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n=num.length();
        if(n<3)
        {
            return false;
        }
        for(int i=1;i<=n;i++)
        {
            if(i>1 && num.charAt(0)=='0')
            {
                break;
            }
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && num.charAt(i)=='0')
                {
                    break;
                }
                long first=Long.parseLong(num.substring(0,i));
                long second=Long.parseLong(num.substring(i,j));
                int k=j;
                while(k<n)
                {
                    long target=first+second;
                    String s=String.valueOf(target);
                    if(k+s.length() <=n && num.substring(k,k+s.length()).equals(s))
                    {
                        k+=s.length();
                        first=second;
                        second=target;
                    }
                    else
                    {
                        break;
                    }
                    if(k==n)
                    {
                        return true;
                    }
                }
          
            }

        }
         return false;
}
}

// ----------------------------------------------------------------------------------------------------------------------------------------

// 2)Add Num

class Addnum {
   {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 4};
        int n1 = A.length;
        int n2 = B.length;
        int a = 0;
        int b = 0;
        
        int power1 = (int) Math.pow(10, n1 - 1);
        int power2 = (int) Math.pow(10, n2 - 1);
        
        for (int i = 0; i < n1; i++) {
            a = a + (A[i] * power1);
            power1 /= 10; }
        
        for (int i = 0; i < n2; i++) {
            b = b + (B[i] * power2);
            power2 /= 10; 
        }
        
        int sum = a + b;
        System.out.println("Value of Addition: " + sum);
       
    }
}
//---------------------------------------------------------------------------------------------
//3) 4Sum
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (nums == null || n < 4) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];

                    if (sum == target) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        result.add(res);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
//-------------------------------------------------------------------------------------------------------------------
//4)Shortest Palindrome

class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
         String l = s + "#" + rev;
          int[] val=new int[l.length()];

          for(int i=1;i<l.length();i++)
          {
              int j=val[i-1];
               while(j>0 && l.charAt(i)!=l.charAt(j))
                     j=val[j-1];

            if(l.charAt(i) == l.charAt(j))
            {
                val[i]=j+1;
            }
          }
          return rev.substring(0,s.length()- val[l.length()- 1])+s;
             }
}
//----------------------------------------------------------------------------------------------------------------
//5) Subarray with given sum

class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int i=0;
        int j=0;
        int sum=arr[0];
        
        ArrayList<Integer> result=new ArrayList<>();
        while(j<n)
        {
        if(sum==s)
        {
            result.add(i+1);
            result.add(j+1);
            return result;
        }
        else if(sum<s)
        {
            j++;
            sum=sum+arr[j];
        }
        else
        {
            
            sum=sum-arr[i];
            i++;
            
        }
    }
    return null;
}
}

//--------------------------------------------------------------------------------------------------------------------------------

//6) Longest subsequence

class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> s=new HashSet<>();
        for(int a: nums)
             s.add(a);
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(s.contains(num-1)) 
            {
                continue;
            }
            int len=0;
            while(s.contains(num))
            {
                len+=1;
                num+=1;
            }
            max=Math.max(max,len);
        }
        return max;

    }
}

// Time Complexity: O(n^2) -> n*n matrix...
// Space Complexity: O(n^2) -> n*n matrix > result
