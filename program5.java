/*Array in Java:
Printing an array into Zigzag fashion. Suppose youwere given an array of
integers, and you are told to sort the integers in a zigzag pattern. In general, in
a zigzag pattern, the first integer is less than the second
integer, which is greater than the third integer, which is less than the fourth
integer, and so on. Hence, the converted array should be in the form of e1 < e2
> e3 < e4 > e5 < e6.
Test cases: Input 1:
7
4 3 7 8 6 2 1
Output 1:
3 7 4 8 2 6 1
Input 2:
4
1 4 3 2
Output 2:
1 4 2 3*/
import java.util.*;
public class program5 {
    public static void zigzag(int n,int arr[])
    {
        boolean flag=true;
        for(int i=0;i<arr.length;i++)

        {
            if(flag)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else{
                    if(arr[i]<arr[i+1])
                    {
                        int temp;
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    }
                }
            }
           flag=!flag;
        }
        
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number range");
        n=sc.nextInt();
        System.out.println("enter the element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        zigzag(n,arr);
         for(int i=0;i<n;i++)
         {
            System.out.println(arr[i]);
         }

    }
}
