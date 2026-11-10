package com.pluralsight;

public class Room {
    // Backing variables: private so only this class can change them
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // A new room starts empty and clean
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    // Boolean getters start with "is" instead of "get"
    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Derived getter: no variable called "available", the answer is calculated
    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn(){
        occupied = true;
        dirty = true;
    }

    public void checkOut(){
        occupied = false;
    }

    public void cleanRoom(){
        dirty = false;
    }
}
