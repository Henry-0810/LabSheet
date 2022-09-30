package LabSheet5.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int counts = 0;

    public BankAccount(){
        setOwner("Owner not Available");
        incrementCount();
        setNumber();
        setInterestRate(0);

    }

    public BankAccount(String owner,  double interestRate){
        setOwner(owner);
        incrementCount();
        setNumber();
        setInterestRate(interestRate);
    }

    public String getOwner(){
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    private  void incrementCount(){ counts++;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private void setNumber() {
        this.number = counts;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString(){
        return "Owner: " + getOwner() + " Account Nunber: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
