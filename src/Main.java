import devices.Car;

public class Main
{
    public static void main(String[] args)
    {
        Animal myPet = new Animal("Burek", "dog");
        myPet.feed();
        myPet.takeForAWalk();
        myPet.feed();
        myPet.takeForAWalk();

        Human H1 = new Human("Jan", 25, "male");
        Car C1 = new Car("M3", "BMW", 2022, "zielony", 50000.00);
        H1.setCar(C1);
        Car myCurrentCar = H1.getCar();

        H1.setSalary(8000.00);
        Double mySalary = H1.getSalary();




    }

}