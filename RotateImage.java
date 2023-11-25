class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=i;j<columns;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int start=0;
        int end=columns-1;
        while(start<end)
        {
            for(int i=0;i<rows;i++)
            {  
                    int temp=matrix[i][start];
                    matrix[i][start]=matrix[i][end];
                    matrix[i][end]=temp;
            }
            
            start++;
            end--;
        }
        return;
        
    }
}

//Time Complexity: O(m*n)
//Space Complexity: O(1)