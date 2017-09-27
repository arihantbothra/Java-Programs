package Business;

import java.awt.event.ActionEvent;
import java.io.File;


public class AirplaneDetails {

    public static boolean readRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String SerialNo;
    private String ModelNo;
    private String Date;
    private String Time;
    private String Manufacturer;
    private String ManufacturingYear;
    private String CatlougeUpdateTime;
    private String SeatsNo;
    private String ManExpDate;
    private String Airport;
    private String Destination;
    private String MinSeatNo;

    public String getMinSeatNo() {
        return MinSeatNo;
    }

    public void setMinSeatNo(String MinSeatNo) {
        this.MinSeatNo = MinSeatNo;
    }
    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getModelNo() {
        return ModelNo;
    }

    public void setModelNo(String ModelNo) {
        this.ModelNo = ModelNo;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getManufacturingYear() {
        return ManufacturingYear;
    }

    public void setManufacturingYear(String ManufacturingYear) {
        this.ManufacturingYear = ManufacturingYear;
    }

    public String getCatlougeUpdateTime() {
        return CatlougeUpdateTime;
    }

    public void setCatlougeUpdateTime(String CatlougeUpdateTime) {
        this.CatlougeUpdateTime = CatlougeUpdateTime;
    }

    public String getSeatsNo() {
        return SeatsNo;
    }

    public void setSeatsNo(String SeatsNo) {
        this.SeatsNo = SeatsNo;
    }

    public String getManExpDate() {
        return ManExpDate;
    }

    public void setManExpDate(String ManExpDate) {
        this.ManExpDate = ManExpDate;
    }

    public String getAirport() {
        return Airport;
    }

    public void setAirport(String Airport) {
        this.Airport = Airport;
    }

    
    
    @Override
    
    public String toString()
            
    {
     return this.SerialNo;
    
    }
   
   
  }
