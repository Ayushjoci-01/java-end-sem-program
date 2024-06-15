/*Write a java program to create an interface that consists of a method to display
volume () as an abstract method and redefine this method in the derived
2
classes to suit their requirements.
Create classes called Cone, Hemisphere and Cylinder that implements the
interface. Using these three classes, design a program that will accept
dimensions of a cone, cylinder and hemisphere interactively and display the
volumes.
Volume of cone = (1/3)πr2h Volume of hemisphere = (2/3)πr3Volume of
cylinder = πr2h*/
import java.util.Scanner;

interface Volume {
    void display();
}

class Cone implements Volume {
    int r;
    int h;

    Cone(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void display() {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
        System.out.println("Volume of cone: " + volume);
    }
}

class Hemisphere implements Volume {
    int r;

    Hemisphere(int r) {
        this.r = r;
    }

    @Override
    public void display() {
        double volume = (2.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume of hemisphere: " + volume);
    }
}

class Cylinder implements Volume {
    int r;
    int h;

    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void display() {
        double volume = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Volume of cylinder: " + volume);
    }
}

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius for cone: ");
        int coneRadius = sc.nextInt();
        System.out.print("Enter the height for cone: ");
        int coneHeight = sc.nextInt();
        Cone coneObj = new Cone(coneRadius, coneHeight);
        coneObj.display();

        System.out.print("Enter the radius for hemisphere: ");
        int hemisphereRadius = sc.nextInt();
        Hemisphere hemisphereObj = new Hemisphere(hemisphereRadius);
        hemisphereObj.display();

        System.out.print("Enter the radius for cylinder: ");
        int cylinderRadius = sc.nextInt();
        System.out.print("Enter the height for cylinder: ");
        int cylinderHeight = sc.nextInt();
        Cylinder cylinderObj = new Cylinder(cylinderRadius, cylinderHeight);
        cylinderObj.display();

        sc.close();
    }
}
