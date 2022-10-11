package LabSheet9.exercise2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse() {
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(String type, double majorAxis, double minorAxis) {
        super(type);
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis > 0)
            this.majorAxis = majorAxis;
        else
            this.majorAxis = 0;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis > 0)
            this.minorAxis = minorAxis;
        else
            this.minorAxis = 0;
    }

    @Override
    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

    @Override
    public double area() {
        return Math.PI * getMajorAxis() * getMinorAxis();
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * (Math.sqrt((Math.pow(getMajorAxis(), 2) + Math.pow(getMinorAxis(), 2)) / 2));
    }
}
