package LabSheet10.exercise1;

import java.util.Date;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment,int hoursWorked){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public int getPointOnScale() {
        Date doa = getDateOfAppointment().getTime();
        Date currDate = GregorianCalendar.getInstance().getTime();

        int yearsWorked = (int)Math.floor(currDate.getYear() - doa.getYear());
        if(yearsWorked >= 3) {
            if (getHoursWorked() > 1500)
                return 4;
            else if (getHoursWorked() > 1000)
                return (int) Math.floor(((getHoursWorked() * 1.33) / 700) + 1);
        }
        return yearsWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }
}
