package airlinerevenue;

import java.awt.event.ActionEvent;
import java.io.File;


public class AirplaneDetails {

    private int SerialNo;
    private String ModelNo, airline;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    private String airline_name;
    private int total_seats;
    private int window, middle, aisle;
    private int win_cost, mid_cost, ais_cost;
    private int other_expenses;
    private int cost_of_flight;

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

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
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

    public int getOther_expenses() {
        return other_expenses;
    }

    public void setOther_expenses(int other_expenses) {
        this.other_expenses = other_expenses;
    }

    public int getCost_of_flight() {
        return cost_of_flight;
    }

    public void setCost_of_flight(int cost_of_flight) {
        this.cost_of_flight = cost_of_flight;
    }
   
  }
