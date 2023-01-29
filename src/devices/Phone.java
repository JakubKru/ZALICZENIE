package devices;

public class Phone
{
    String model;
    String color;
    int storage;

    String appName;

    String version;
    String serverAddress;


    static final String SERVER_ADDRESS = "https://appstore.com";
    static final String PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "1.0";

    public Phone(String producer, String model, int yearOfProduction, String color, int storage) {
        super(producer, color, yearOfProduction );
        this.color = color;
        this.storage = storage;


        String appName1 = appName;
        String Version1 = version;
        String serverAddress1 = serverAddress;

        public void installApp(String appName, String version, String serverAddress)
        {
            System.out.println("Installing " + appName + " version " + version + " from " + serverAddress + " using " + PROTOCOL + " protocol.");
        }



    }
}
