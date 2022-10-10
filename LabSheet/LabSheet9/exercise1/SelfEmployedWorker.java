package LabSheet9.exercise1;

public final class SelfEmployedWorker extends Employee {

    private double estimatedIncome = 400 + Math.random()*500;


    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = estimatedIncome;
    }

    @Override
    public double earnings() {
        return estimatedIncome;
    }

    @Override
    public String toString() {
        return "Self-employed worker's name is " + super.toString();
    }
}


