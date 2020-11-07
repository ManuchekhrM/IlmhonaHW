package com.company.first;

public class Pokupatel {
    private String lastName;
    private String name;
    private String otchestvo;
    private String address;
    private int cardNumber;
    private int idNumber;


    public Pokupatel(String lastName, String name, String otchestvo, String  address, int cardNumber, int idNumber) {
        this.lastName = lastName;
        this.name = name;
        this.otchestvo = otchestvo;
        this.address = address;
        this.cardNumber = cardNumber;
        this.idNumber = idNumber;

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
    public int getCardNumber() {
        return this.cardNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
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
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
