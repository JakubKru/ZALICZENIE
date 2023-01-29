import Creatures.Animal;
import devices.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human
{
    String name;
    int age;
    String gender;
    Animal pet;
    private Car[] garage;
    private Double salary;
    private Double cash;

    public Human(String n, int a, String g, int garageSize)
    {
        name = n;
        age = a;
        gender = g;
        this.garage = new Car[garageSize];
    }
    public void setPet(Animal pet)
    {
        this.pet = pet;
    }
    public Car getCar()
    {
        return car;
    }
    public void setCar(Car newCar)
    {
        if (salary > newCar.value)
        {
            System.out.println("Auto kupione za gotówkę.");
            car = newCar;
        } else if (salary > (newCar.value / 12))
        {
            System.out.println("Auto wzięte na kredyt.");
            car = newCar;
        } else
        {
            System.out.println("Idź na studia i znajdź nową robotę albo idź po podwyżkę.");
        }
    }

    public void setSalary(Double salary)
    {
        if (salary < 0)
        {
            System.out.println("Wypłata musi być większa niż 0.");
        }
        else
        {
            System.out.println("Dane dotyczące wypłaty zostały wysłane do księgowości.");
            System.out.println("Proszę odebrać aneks do umowy od Pani Hani z HR.");
            System.out.println("ZUS and US wiedzą o zmianach w zarobkach, nie ma powodu tego ukrywać.");
            this.salary = salary;
        }
    }
    public Double getSalary()
    {
        System.out.println("Pobieranie danych o wypłacie...");
        System.out.println("Wypłata wynosi: " + salary);
        return salary;
    }
    public void setCash(Double cash)
    {
        this.cash = cash;
    }
    public Double getCash()
    {
        return cash;
    }

    public void getPet()
    {
        this.pet = pet;
    }



    public Car getCar(int parkingSpot) {
        return garage[parkingSpot];
    }

    public void setCar(int parkingSpot, Car car)
    {
        garage[parkingSpot] = car;
    }

    public double getGarageValue()
    {
        double sum = 0;
        for (Car car : garage)
        {
            if (car != null)
            {
                sum += car.getValue();
            }
        }
        return sum;
    }

    public void sortGarageByYear()
    {
        Arrays.sort(garage, new Comparator<Car>()
        {
            @Override
            public int compare(Car car1, Car car2)
            {
                if (car1 == null && car2 == null)
                {
                    return 0;
                } else if (car1 == null)
                {
                    return 1;
                } else if (car2 == null)
                {
                    return -1;
                }
                return car1.getYearOfProduction() - car2.getYearOfProduction();
            }
        }
        );
    }
}



