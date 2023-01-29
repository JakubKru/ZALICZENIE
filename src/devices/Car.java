package devices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Car
{
    String model;
    String producer;
    int year;
    String color;
    public Double value;
private int yearOfProduction;

    public int getYearOfProduction()
    {
        return yearOfProduction;
    }
    @Override
    public double getValue()
    {
        return value;
    }
    static class Electric extends Car
    {
        public Electric(String model, int yearOfProduction, double value) {
            super(model, yearOfProduction, value);
        }

        public void refuel() {
            System.out.println("Refueling electric car with electricity.");
        }
    }

    class Diesel extends Car
    {
        public Diesel(String model, int yearOfProduction, double value) {
            super(model, yearOfProduction, value);
        }

        public void refuel() {
            System.out.println("Refueling diesel car with diesel.");
        }
    }

    class LPG extends Car
    {
        public LPG(String model, int yearOfProduction, double value)
        {
            super(model, yearOfProduction, value);
        }

        public void refuel()
        {
            System.out.println("Refueling LPG car with LPG.");
        }

        public Car(String m, String p, int y, String c, Double v)
        {
            model = m;
            producer = p;
            year = y;
            color = c;
            value = v;
        }
    }
}


