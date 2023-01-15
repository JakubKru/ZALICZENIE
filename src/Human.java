public class Human
{
    String name;
    int age;
    String gender;
    Animal pet;

    public Human(String n, int a, String g)
    {
        name = n;
        age = a;
        gender = g;
    }
    public void setPet(Animal pet)
    {
        this.pet = pet;
    }
}
