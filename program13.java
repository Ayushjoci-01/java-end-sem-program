/*Method overriding (Runtime Polymorphism), Abstract class and Abstract
method, Inheritance, interfaces:
Write a java program to calculate the area of a rectangle, a square and a circle.
Create an abstract class 'Shape' with three abstract methods namely
rectangleArea() taking two parameters, squareArea() and circleArea() taking
one parameter each.
Now create another class ‘Area’ containing all the three methods
rectangleArea(), squareArea() and circleArea() for printing the area of
rectangle, square and circle respectively. Create an object of class Area and call
all the three methods.
(Use Runtime Polymorphism)*/
abstract class shape{
    abstract int rectanglt(int l,int w);
    abstract int squre(int s);
    abstract int circle(int r);
}
class area extends shape{
    @Override
    int rectanglt(int l,int w)
    {
        return l*w;
    }
    @Override
    int squre(int s)
    {
        return s*s;
    }
    @Override
    int circle(int r)
    {
        return (int) (3.14*r*r);
    }
   
}
public class program13
{
    public static void main(String[] args) {
        area obj1=new area();
        int rec=obj1.rectanglt(2, 4);
        System.out.println(rec);

       int bi= obj1.squre(4);
       System.out.println(bi);
       int ci= obj1.circle(4);
       System.out.println(ci);
    }
}