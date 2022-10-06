package LabSheet8.exercise1;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle(){
        setPrice(0.0);
        setLength(0.0);
        setHeight(0.0);
        setWeight(0.0);
        setManufacturer("No manufacturer specified");
        setModel("No model specified");
    }

    public Vehicle(double price,double length,double height,double weight,String manufacturer,String model){
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Price: " + getPrice() + "\nLength: " + getLength() + "\nHeight: " + getHeight() +
                "\nWeight: " + getWeight() + "\nManufacturer: " + getManufacturer() + "\nModel: " + getModel();
    }
}
