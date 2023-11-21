public class Cellphone {

    //Attributes of my class
    private String brand;
    private double price;
    private long serialNumber;
    private static long serialNumberCounter = 1000000;

    // parameter constructor
    public Cellphone(String br, double pr) {
        brand = br;
        price = pr;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;
    }

    // Copy constructor
    public Cellphone(Cellphone c) {
        brand = c.brand;
        price = c.price;
        serialNumber = serialNumberCounter;
        serialNumberCounter++;

    }

    //Getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String br) {
        brand = br;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    // to string method
    @Override
    public String toString() {
        System.out.println("Cellphone brand is " + brand + "." + " The price is " + price + "$," + " and the serial number is " + serialNumber + ".");
        return "";
    }
}