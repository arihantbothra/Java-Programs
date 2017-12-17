/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author arihant
 */
public class Airline_Access {
    private ArrayList<Airline> airplane;

    
    public Airline_Access() {
        airplane  = new ArrayList<Airline>();
    }

    public void setAirplane(ArrayList<Airline> airplane) {
        this.airplane = airplane;
    }
    
    public ArrayList<Airline> getAirplane() {
        return airplane;
    }

    public Airline addairplane()
    {    
        Airline ad = new Airline();
        airplane.add(ad);
        return ad;
    }
    
    public void array_airplane() throws FileNotFoundException, IOException{
        CsvReader csv = new CsvReader("C:\\Users\\ariha\\Documents\\NetBeansProjects\\HomeWork4\\HomeWork4\\src\\Input\\Airplane.csv");
        csv.readHeaders();
        while(csv.readRecord()){
            Object [] row = new Object[13];
            row[0] = csv.get("Serial No.");
            row[1] = csv.get("Airline");
            row[2] = csv.get("Source");
            row[3] = csv.get("Destination");
            row[4] = csv.get("Model No.");
            row[5] = csv.get("Seating Capacity");
            row[6] = csv.get("Window_seat");
            row[7] = csv.get("Middle_seat");
            row[8] = csv.get("Aisle_seat");
            row[9] = csv.get("Window_cost");
            row[10] = csv.get("Middle_cost");
            row[11] = csv.get("Aisle_cost");
            row[12] = csv.get("Time");
            
            Airline airplane = addairplane();
            airplane.setSerialNo(Integer.parseInt(row[0].toString()));
            airplane.setAirline(row[1].toString());
            airplane.setSource(row[2].toString());
            airplane.setDestination(row[3].toString());
            airplane.setModelNo(row[4].toString());
            airplane.setTotal_seats(Integer.parseInt(row[5].toString()));
            airplane.setWindow(Integer.parseInt(row[6].toString()));
            airplane.setMiddle(Integer.parseInt(row[7].toString()));
            airplane.setAisle(Integer.parseInt(row[8].toString()));
            airplane.setWin_cost(Integer.parseInt(row[9].toString()));
            airplane.setMid_cost(Integer.parseInt(row[10].toString()));
            airplane.setAis_cost(Integer.parseInt(row[11].toString()));
            airplane.setTime(row[12].toString());
        }
    }
    
    public Object [] getairlinedetails(){
        String [] str = new String[100];
        int i = 0;
        for(Airline air : getAirplane()){
            str[i] = air.getAirline();
            i++;
        }
        Set<Object> temp = new LinkedHashSet<Object>( Arrays.asList(str));
        Object[] airline_name = temp.toArray( new Object[temp.size()] );
        return airline_name;
    }
   
    public Airline deletedata(int row) {
        Airline as = new Airline();
        airplane.remove(row);
        return as;
    }
}
