package LabSheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(100000.0,4.5,1.25,2000.0,"Ferrari",
                "F2",2,"05KY1");
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle(500.0,1.5,1.0,50.0,"Raleigh",
                "Mountainbike",true,4);
        String str = "Testing the Car no-arg constructor: \n\n" + car1 +
                "\n\n\nTesting the Car multi-arg constructor: \n\n" + car2 +
                "\n\n\nTesting the Bicycle no-arg constructor: \n\n" + bicycle1 +
                "\n\n\nTesting the Bicycle multi-arg constructor: \n\n" + bicycle2;

        System.out.println(str);


    }
}
