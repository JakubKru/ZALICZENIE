import Creatures.Animal;
import devices.Car;
import devices.Phone;

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




        Human seller = new Human("John", 25, "male");
        Human buyer = new Human("Mike", 30, "male");
        seller.setCash(5000.00);
        buyer.setCash(8000.00);
        Animal pet = new Animal("Azor", "dog", 15.0);
        seller.setPet(pet);
        pet.sell(seller, buyer, 1000.00);


    }

}