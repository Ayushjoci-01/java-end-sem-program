/*Write a java program to take input as a command line argument. Your name,
course, universityrollno and semester. Display the information.
Name: UniversityRollNo:Course:
2
2
Java Programming Lab
Semester:*/
public class program1{
    public static void main(String args[])
    {
        if(args.length<4)
        {
            System.out.println("insufficent argument");
        }
        String name=args[0];
        int roll=Integer.parseInt(args[1]);
        String course=args[2];
        int sem=Integer.parseInt(args[3]);
        System.out.println("name of the student is"+name);
        System.out.println("roll no of the student is"+roll);
        System.out.println("course of the studnent is"+course);
        System.out.println("sem of the student is"+sem);
    }
}
/*add two no progrma in java cla 
public class program1{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.println("sum of the no is"+c);
    }
}*/