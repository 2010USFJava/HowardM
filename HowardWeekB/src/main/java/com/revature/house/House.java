package com.revature.house;

//Console app-Make a bean of your choosing (at least 4 fields)
// -Make an ArrayList to store those objects to(i.e. saving warriors to roster)
// -Make a menu which allows users to make a new object (use Scanner to take in user input)
// -Persist the data to a file and load the data when app starts-Log the creation of a new bean object to a file.
// Push your project to your lastName repo by 6 pm EST Today Nov 2Name the project LastNameWeekB


public class House {
    private String streetNumber;
    private String streetName;
    private boolean isMultiStory;
    private short rooms;
    private double squareFeet;

    public House() {
    }

    public House( String streetNumber, String streetName, boolean isMultiStory, short rooms, double squareFeet) {
        this.rooms = rooms;
        this.squareFeet = squareFeet;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.isMultiStory = isMultiStory;
    }

    public short getRooms() {
        return rooms;
    }

    public void setRooms(short rooms) {
        this.rooms = rooms;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public boolean isMultiStory() {
        return isMultiStory;
    }

    public void setMultiStory(boolean multiStory) {
        isMultiStory = multiStory;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", squareFeet=" + squareFeet +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", isMultiStory=" + isMultiStory +
                '}';
    }
}
