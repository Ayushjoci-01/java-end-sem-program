import java.util.*;
public class program3{
    public static int sumofdivisor(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("enter the num1");
        num1=sc.nextInt();
        System.out.println("enter the num2");
        num2=sc.nextInt();
        int sum1=sumofdivisor(num1);
        int sum2=sumofdivisor(num2);
        if(num1==sum2 && num2==sum1)
        {
            System.out.println("friendly pair");
        }
        else{
            System.out.println("not a friendly pair");
        }
    }
}