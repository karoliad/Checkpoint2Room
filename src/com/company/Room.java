package com.company;

public class Room {
    //instansvariabler for objektene room
    private String name;
    private int width;
    private int length;

    // constructor for room
    public Room(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    //        Metode som printer
    public String printDescription() {
        String ut = "\nRoom: " + name +
                "\nWidth: " + width +
                "\nlength: " + length
                + "\nArea: " + length * width + " m2\n";
        return ut;
    }

    // ikke bruk toString fra klassen Object, bruk heller vår versjon
    @Override
    public String toString() {
        return printDescription();
    }

    //  Getters og setters for instansvariablene
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
