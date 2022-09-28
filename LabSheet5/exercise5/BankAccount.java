package LabSheet5.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int counts = 0;

    public BankAccount(){
        setOwner("Owner not Available");
        incrementCount();
        setNumber(counts);
        setInterestRate(0);

    }

    public BankAccount(String owner,  double interestRate){
        setOwner(owner);
        incrementCount();
        setNumber(counts);
        setInterestRate(interestRate);
    }

    public String getOwner(){
        return owner;
    }

    public static int getNumber() {
        return counts;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    private static void incrementCount(){
        counts++;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void setNumber(int number) {
        counts = number;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString(){
        return "Owner: " + getOwner() + " Account Nunber: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
