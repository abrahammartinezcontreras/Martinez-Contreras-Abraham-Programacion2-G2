package Lab_3;

private int range;

public ElectricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
    super(brand, model, price);
    this.batteryCapacity = batteryCapacity;
    this.range = range;
}

public void displayRange() {
    System.out.println("Range: " + range + " km");
}