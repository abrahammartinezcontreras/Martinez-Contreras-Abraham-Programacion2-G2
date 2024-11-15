package Lab_3;

public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    public ElectricVehicle(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}