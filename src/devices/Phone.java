package devices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Phone
{
    String model;
    String color;
    int storage;

    String appName;

    String version;
    String serverAddress;
    private List<Application> installedApps;
    private double cash;


    static final String SERVER_ADDRESS = "https://appstore.com";
    static final String PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "1.0";

    public Phone(String producer, String model, int yearOfProduction, String color, int storage, double cash) {
        super(producer, color, yearOfProduction);
        this.color = color;
        this.storage = storage;
        installedApps = new ArrayList<>();
        this.cash = cash;


        String appName1 = appName;
        String Version1 = version;
        String serverAddress1 = serverAddress;
    }

        public void installApp(String appName, String version, String serverAddress)
        {
            System.out.println("Installing " + appName + " version " + version + " from " + serverAddress + " using " + PROTOCOL + " protocol.");
        }

    public void installApplication(Application app)
    {
        if (cash >= app.getPrice()) {
            installedApps.add(app);
            cash -= app.getPrice();
        } else {
            System.out.println("Not enough money to install the app");
        }
    }

    public boolean isAppInstalled(Application app)
    {
        return installedApps.contains(app);
    }

    public boolean isAppInstalled(String appName)
    {
        for (Application app : installedApps)
        {
            if (app.getName().equals(appName))
            {
                return true;
            }
        }
        return false;
    }

    public List<Application> getFreeApps()
    {
        List<Application> freeApps = new ArrayList<>();
        for (Application app : installedApps)
        {
            if (app.getPrice() == 0)
            {
                freeApps.add(app);
            }
        }
        return freeApps;
    }

    public double getInstalledAppsValue()
    {
        double value = 0;
        for (Application app : installedApps)
        {
            value += app.getPrice();
        }
        return value;
    }

    public List<String> getInstalledAppsNames()
    {
        List<String> names = new ArrayList<>();
        for (Application app : installedApps)
        {
            names.add(app.getName());
        }
        Collections.sort(names);
        return names;
    }

    public List<Application> getInstalledAppsByPrice()
    {
        List<Application> apps = new ArrayList<>(installedApps);
        Collections.sort(apps, (app1, app2) -> Double.compare(app1.getPrice(), app2.getPrice()));
        return apps;
    }


}

