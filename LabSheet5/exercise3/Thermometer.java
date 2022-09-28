package LabSheet5.exercise3;

public class Thermometer {
    private int cTemp;
    private int maxTemp;
    private int minTemp;

    //constructors
    public Thermometer(){
        setcTemp(0);
        setMaxTemp(Integer.MAX_VALUE);
        setMinTemp(Integer.MIN_VALUE);
    }

    public Thermometer(int temp){
        setcTemp(temp);
        setMaxTemp(temp);
        setMinTemp(temp);
    }

    //getters
    public int getcTemp() {
        return cTemp;
    }

    public int getMaxTemp(){
        return maxTemp;
    }

    public int getMinTemp(){
        return minTemp;
    }

    //setters

    public void setcTemp(int cTemp) {
        this.cTemp = cTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String toString(){
        return "Current temperature: " + getcTemp() +"\nMaximum temperature: " + getMaxTemp() +
                "\nMinimum temperature: " + getMinTemp();
    }

    public void setTemperature(int SetTemp){
        setcTemp(SetTemp);
        if(this.maxTemp == Integer.MAX_VALUE) this.maxTemp = SetTemp;
        if(this.minTemp == Integer.MIN_VALUE) this.minTemp = SetTemp;
        updateMaxMinTemp(SetTemp);
    }
    //methods
    private void updateMaxMinTemp(int CurrTemp){
        if(CurrTemp > this.maxTemp)
            this.maxTemp = CurrTemp;
        if(CurrTemp < this.minTemp)
            this.minTemp = CurrTemp;
    }
}
