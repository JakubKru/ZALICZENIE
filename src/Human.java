public class Human
{
    String name;
    int age;
    String gender;
    Animal pet;
    private Car car;
    private Double salary;

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
    public void setCar(Car car)
    {
        this.car = car;
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



}
