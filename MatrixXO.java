import java.util.Scanner;
public class MatrixXO
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n:");
        m=sc.nextInt();
        n=sc.nextInt();
        char[][] arr=new char[m][n];
        int up=0,left=0,right=n-1,down=m-1;
        while(left<=right && up<=down)
        {
            for(int p=up;p<=right;p++)
            {
                if(up%2==0)
                {
                arr[up][p]='X';
                }
                else{
                    arr[up][p]='O';
                }
            }
            up++;
            for(int q=up;q<=down;q++)
            {
                if(right%2==0)
                {
                    arr[q][right]='X';
                }
                else{
                    arr[q][right]='O';
                }
            }
            right--;
            for(int r=right;r>=left;r--)
            {
                if(left%2==0)
                {
                    arr[down][r]='X';
                }
                else{
                    arr[down][r]='O';
                }
            }
            down--;
            for(int s=down;s>=up;s--)
            {
               if(left%2==0)
                {
                    arr[s][left]='X';
                }
                else{
                    arr[s][left]='O';
                }
            }
            left++;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(m*n) 
//Space Complexity: O(m*n)
