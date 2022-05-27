package com.example.mainprog;

public class car {
    public int id;
    public String nameCar;
    public String numCar;
    public int priceCar;
    public String bodyType;
    public int countSeats;
    public boolean statusBooking;
    public boolean statusIssuance;
    public int horsePower;


    public car(int id, String nameCar, String numCar, int priceCar, String bodyType, int countSeats, boolean statusBooking,
               boolean statusIssuance, int horsePower) {
        this.id = id;
        this.nameCar = nameCar;
        this.numCar=numCar;
        this.priceCar = priceCar;
        this.bodyType = bodyType;
        this.countSeats = countSeats;
        this.statusBooking= statusBooking;
        this.statusIssuance=statusIssuance;
        this.horsePower=horsePower;
    }

    public car() {}

    public car(String number_car) {
        number_car= this.numCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNumCar(String numCar) {
        this.numCar = numCar;
    }

    public String getNumCar() {
        return numCar;
    }

    public int getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(int priceCar) {
        this.priceCar = priceCar;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setStatusBooking(boolean statusBooking) {
        this.statusBooking = statusBooking;
    }

    public boolean getStatusBooking() {
        return statusBooking;
    }

    public void setStatusIssuance(boolean statusIssuance) {
        this.statusIssuance = statusIssuance;
    }

    public boolean getStatusIssuance() {
        return statusIssuance;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
