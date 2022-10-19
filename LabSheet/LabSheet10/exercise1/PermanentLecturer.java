package LabSheet10.exercise1;

import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID,
                             String[] coursesTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements,
                             String status){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int getPointOnScale() {
        Date doa = getDateOfAppointment().getTime();
        Date currDate = GregorianCalendar.getInstance().getTime();

        int yearsWorked = (int)Math.floor(currDate.getYear() - doa.getYear());
        if(yearsWorked > 20)
            return 20;
        else
            return yearsWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }
}
