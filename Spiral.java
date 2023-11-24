class Solution {
    public int[][] generateMatrix(int n) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int[][] arr=new int[n][n];
        int val=1;
        int up=0,right=n-1,down=n-1,left=0;
        while(left<=right && up<=down)
        {
            for(int p=up;p<=right;p++)
            {
                arr[up][p]=val;
                val++;
            }
            up++;
            for(int q=up;q<=down;q++)
            {
                arr[q][right]=val;
                val++;
            }
            right--;
            for(int r=right;r>=left;r--)
            {
                arr[down][r]=val;
                val++;
            }
            down--;
            for(int s=down;s>=up;s--)
            {
                arr[s][left]=val;
                val++;
            }
            left++;
        }
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                a.add(arr[i][j]);
            }
            result.add(a);
        }
      return arr;
    }
}
