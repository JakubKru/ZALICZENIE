package devices;

abstract class Device
{
    String producer;
    String model;
    int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract double getValue();

    public String getProducer()
    {
        return producer;
    }

    public String getModel()
    {
        return model;
    }
    public abstract void turnOn();
}





