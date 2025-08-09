package com.spring;

public class Adress {
    private String falt_no;
    private String location;
    private String city;
    private String state;

    public String getFalt_no() {
        return falt_no;
    }

    public void setFalt_no(String falt_no) {
        this.falt_no = falt_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adress [falt_no=" + falt_no + ", location=" + location + ", city=" + city + ", state=" + state + "]";
    }
}
