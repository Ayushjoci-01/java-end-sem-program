/*Program to find the saddle point coordinates in a given matrix. A saddle point
is an element of the matrix,which is the minimum element in its row and the
maximum in its column.
2
For example, consider the matrix given belowMat [3][3]
1 2 3
4 5 6
7 8 9
Here, 7 is the saddle point because it is the minimum element in its row and
maximum element in its column.
Steps to find the saddle point coordinates in a givenmatrix.
1. Input the matrix from the user.
2. Use two loops, one for traversing the row andthe other for
traversing the column.
3. If the current element is the minimum element inits row and
maximum element in its column, then return its coordinates.
Else, continue traversing.*/
import java.util.*;
public class program7 {
    public static void main(String[] args) {
        int arr[][]=new int[10][10];
        int i,j,c=0,f=0,n,k;
        int min=0,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of row and column");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("enter the no of poket["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is..");
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
       
        //check min or not//
        for(i=0;i<n;i++)
        {
            min=arr[i][0];
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    c=j;
                }
            }
        }
        max=arr[0][c];
        for(k=0;k<n;k++)
        {
            if(arr[k][c]>max)
            {
                max=arr[k][c];
            }
        }
        if(min==max)
        {
            System.out.println("saddle point of matrix is"+max);
            f=1;
        }
        if(f==0)
        {
            System.out.println("not a saddle point");
        }

    }

    
}
