package LabSheet8.exercise1;

public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        super();
        setHasBell(false);
        setGearCount(0);
    }

    public Bicycle(double price,double length,double height,double weight,String manufacturer,
                   String model,int gearCount,boolean hasBell){
        super(price,length,height,weight,manufacturer,model);
        setHasBell(hasBell);
        setGearCount(gearCount);
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public boolean getHasBell(){
        return hasBell;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    @Override
    public String toString() {
        String str;
        if(getHasBell()) str = "Yes";
        else str = "No";
        return super.toString() + "\nHas Bell: " + str + "\nGear Count: " + getGearCount();
    }
}
