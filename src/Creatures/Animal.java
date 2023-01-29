package Creatures;

interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
public class Animal implements Sellable {
    String name;
    String species;
    private Double weight;

    public Animal(String n, String s, Double w) {
        name = n;
        species = s;
        weight = w;
    }

    public Animal(String n, String s) {
        name = n;
        species = s;
        if (species.equals("dog")) {
            weight = 15.0;
        } else if (species.equals("cat")) {
            weight = 7.5;
        } else if (species.equals("bird")) {
            weight = 0.5;
        } else {
            weight = 0.0;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("Dzieki za jedzenie");
        } else {
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

    public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.setPet() != this) {
            System.out.println("Sprzedawca nie jest właścicielem.");
        }
        else if (buyer.getCash() < price)
        {
            System.out.println("Kupiec nie ma kasy.");
        }
        else
        {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
        }
    }
}
