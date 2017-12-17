/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author arihant
 */
public class Airline {
    private int SerialNo;
    private String ModelNo, company, airline, source, destination, time;
    private int total_seats, booked = 0;
    private int window, total_flight, middle, aisle;
    private int win_cost, mid_cost, ais_cost;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCompany() {
        System.out.println("Reading flight");
        return company;
    }

    public void setCompany(String company) {
        System.out.println("Storing value");
        this.company = company;
    }

    public int getTotal_flight() {
        return total_flight;
    }

    public void setTotal_flight(int total_flight) {
        this.total_flight = total_flight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String ModelNo) {
        this.ModelNo = ModelNo;
    }

    
    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked += booked;
    }
    
    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getWin_cost() {
        return win_cost;
    }

    public void setWin_cost(int win_cost) {
        this.win_cost = win_cost;
    }

    public int getMid_cost() {
        return mid_cost;
    }

    public void setMid_cost(int mid_cost) {
        this.mid_cost = mid_cost;
    }

    public int getAis_cost() {
        return ais_cost;
    }

    public void setAis_cost(int ais_cost) {
        this.ais_cost = ais_cost;
    }

}
