package com.company.second;

public class Abonent {
    private int idNumber;
    private String lastName;
    private String name;
    private String otchestvo;
    private String address;
    private int timeIntercityCall;
    private int timeCityCall;



    public Abonent(int idNumber, String lastName, String name, String otchestvo, String  address,
                   int timeIntercityCall, int timeCityCall) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.name = name;
        this.otchestvo = otchestvo;
        this.address = address;
        this.timeIntercityCall = timeIntercityCall;
        this.timeCityCall = timeCityCall;






    }
    public int getIdNumber() {
        return this.idNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getOtchestvo() {
        return this.otchestvo;
    }

    public String getAddress() {
        return this.address;
    }
    public int getTimeIntercityCall() {
        return this.timeIntercityCall;
    }

    public int getTimeCityCall() {
        return this.timeCityCall;
    }




    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTimeIntercityCall(int timeIntercityCall) {
        this.timeIntercityCall = timeIntercityCall;
    }
    public void setTimeCityCall(int timeCityCall) {
        this.timeCityCall = timeCityCall;
    }
}
