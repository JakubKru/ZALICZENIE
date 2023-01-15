import devices.Car;
import devices.Phone;
public class Animal
{
    String name;
    String species;
    private Double weight;

    public Animal(String n, String s, Double w)
    {
        name = n;
        species = s;
        weight = w;
    }

    public Animal(String n, String s)
    {
        name = n;
        species = s;
        if (species.equals("dog"))
        {
            weight = 15.0;
        }
        else if (species.equals("cat"))
        {
            weight = 7.5;
        }
        else if (species.equals("bird"))
        {
            weight = 0.5;
        }
        else
        {
            weight = 0.0;
        }
    }

    public void feed()
    {
        if (weight > 0)
        {
            weight += 1;
            System.out.println("Dzieki za jedzenie");
        }
        else
        {
            System.out.println("Zwierze umarło");
        }
    }
    public void takeForAWalk() {
        if (weight > 0) {
            weight -= 0.5;
            System.out.println("Fajny spacer, ruch to zdrowie");
        } else {
            System.out.println("Zwierze umarło");
        }
    }
}
