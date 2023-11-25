import java.util.Scanner;
public class MatrixBool {
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n:");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    for(int k=0;k<n;k++)
                    {
                        res[i][k]=1;
                    }
                    for(int r=0;r<m;r++)
                    {
                        res[r][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}

//Time Complexity: O(m*n)
//Space Complexity: O(m*n)