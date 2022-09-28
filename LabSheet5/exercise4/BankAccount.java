package LabSheet5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;

    public BankAccount(){
        setOwner("Owner not Available");
        setNumber(0);
        setInterestRate(0);
    }

    public BankAccount(String owner, int number, double interestRate){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
    }

    public String getOwner(){
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public static double getInterestRate() {
        return BankAccount.interestRate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString(){
        return "Owner: " + getOwner() + " Account Nunber: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
