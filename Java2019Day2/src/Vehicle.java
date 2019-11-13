public class Vehicle {
    private int numWheels;
    private int numWindows;
    private String make;
    private String model;
    private String year;
    private String engine;
    private boolean automatic;
    private String fuelType;

    public int getNumWheels() {
        return numWheels;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Vehicle(int numWheels, int numWindows, String make, String model, String year, String engine, boolean automatic, String fuelType) {
        this.numWheels = numWheels;
        this.numWindows = numWindows;
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.automatic = automatic;
        this.fuelType = fuelType;
    }
}
