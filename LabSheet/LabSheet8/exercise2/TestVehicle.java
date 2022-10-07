package LabSheet8.exercise2;

public class TestVehicle {
    public static void main(String[] args) {
        Car car2 = new Car(100000.0,4.5,1.25,2000.0,"Ferrari",
               "F2",2,"05KY1");
        car2.setRegistrationNumber("08-KY-1234");
        System.out.println("Loading Car2 constructor:\n\n" + car2);

        car2.setRegistrationNumber("97-L-985671");
        System.out.println("\n\n" + car2);

        car2.setRegistrationNumber("2008-C-12");
        System.out.println("\n\n" + car2);

        car2.setRegistrationNumber("89-LKK-234");
        System.out.println("\n\n" + car2);



    }
}
