/*String Handling in Java (using String and StringBuffer class):
Program to find all the patterns of 0(1+)0 in the given string. Given a string
containing 0's and 1's, find the total number of 0(1+)0 patterns in the string
and output it.
0(1+)0 - There should be at least one '1' between the two 0's.
For example, consider the following string.
Input: 01101111010
Output: 3
Explanation: 01101111010 - count = 1*/
import java.util.*;
public class program8 {
    public static int  countpattern(String name)
    {
        int c=0;
        for(int i=0;i<name.length()-2;i++)
        {
            if(name.charAt(i)=='0' && name.charAt(i+2)=='0' && name.charAt(i+1)=='1')
            {
                c++;
                i++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String name="0110111010";
        int count=countpattern(name);
        System.out.println("pattern of the pattern is"+count);
    }
}
