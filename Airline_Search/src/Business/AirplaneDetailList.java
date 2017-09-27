/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Arihant
 */
public class AirplaneDetailList {
    private ArrayList<AirplaneDetails> details;
    
    
    public AirplaneDetailList()
    {
    
        details = new ArrayList<AirplaneDetails>();
    
    }

    public ArrayList<AirplaneDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<AirplaneDetails> details) {
        this.details = details;
    }
    
    public AirplaneDetails addDetails()
    {
    
    AirplaneDetails as = new AirplaneDetails();
    details.add(as);
    return as;
    
    }
    public AirplaneDetails updatedetails(int row, String serial, String model, String date, String time, String manu, String manu_year, String timestamp, String max, String min, String expiry, String airport, String dest){
        AirplaneDetails as = new AirplaneDetails();
        as.setSerialNo(serial);
        as.setModelNo(model);
        as.setDate(date);
        as.setTime(time);
        as.setManufacturer(manu);
        as.setManufacturingYear(manu_year);
        as.setCatlougeUpdateTime(timestamp);
        as.setSeatsNo(max);
        as.setMinSeatNo(min);
        as.setManExpDate(expiry);
        as.setAirport(airport);
        as.setDestination(dest);
        details.set(row, as);
        return as;
    }

    public AirplaneDetails deletedata(int row) {
        AirplaneDetails as = new AirplaneDetails();
        details.remove(row);
        return as;
    }

}
