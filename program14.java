/*Write a java program to implement abstract class and abstract method with
following details:
Create a abstract Base Class TemperatureData members:
double temp;
Method members:
void setTempData(double) abstact void changeTemp()
Sub Class Fahrenheit (subclass of Temperature) Data members:
double ctemp;
method member:
Override abstract method changeTemp() to convert Fahrenheit temperature into
degree Celsius by using formula C=5/9*(F-32) and display converted
temperature
Sub Class Celsius (subclass of Temperature)
Data member:
double ftemp;
Method member:
Override abstract method changeTemp() to convert degree Celsius into
Fahrenheit temperature by using formula F=9/5*c+32 and display converted
temperature*/
abstract class temp {
    double temp;
    void settempdata(double temp) {
        this.temp = temp;
    }
    abstract void changetemp();
}
class changeset extends temp {
    double ctemp;
    @Override
    void changetemp() {
        ctemp = 5.0 / 9.0 * (temp - 32);
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}
class celcius extends temp {
    double ftemp;
    @Override
    void changetemp() {
        ftemp = 9.0 / 5.0 * temp + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}
public class program14 {
    public static void main(String args[]) {
        changeset obj1 = new changeset();
        obj1.settempdata(68); 
        obj1.changetemp(); 
    }
}
