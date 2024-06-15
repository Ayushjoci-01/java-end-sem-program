/*Program to replace all 0's with 1 in a given integer. Given an integer as an input,
all the 0's in the number has to be replaced with 1.
For example, consider the following number Input: 102405
Output: 112415
Input: 56004
Output: 56114
Steps to replace all 0's with 1 in a given integer
2
• Input the integer from the user.
• Traverse the integer digit by digit.
• If a '0' is encountered, replace it by '1'.
• Print the integer.*/
import java.util.*;
public class program4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the num");
        num=sc.nextInt();
        //convert integer into a string//
        String name=String.valueOf(num);
        //string into a string Bilder//
        StringBuilder result=new StringBuilder();
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='0')
            {
                result.append('1');
            }
            else{
                result.append(name.charAt(i));
            }
        }
        System.out.println("output"+Integer.parseInt(result.toString()));

    }
}
