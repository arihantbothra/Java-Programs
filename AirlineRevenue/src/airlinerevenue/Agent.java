/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinerevenue;

import java.util.ArrayList;
import airlinerevenue.AirplaneDetails;
import airlinerevenue.Customer;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 *
 * @author Devyani
 */
public class Agent {
    
    private static ArrayList<AirplaneDetails> airplane = new ArrayList<AirplaneDetails>();
    private static ArrayList<Customer> customer = new ArrayList<Customer>();
    
    
    public static ArrayList<AirplaneDetails> getAirplane() {
        return airplane;
    }
    public static void setAirplane(ArrayList<AirplaneDetails> airplane) {
        Agent.airplane = airplane;
    }

    
    public static ArrayList<Customer> getCustomer() {
        return customer;
    }
    public static void setCustomer(ArrayList<Customer> customer) {
        Agent.customer = customer;
    }
       

    
    public static AirplaneDetails addairplane()
    {    
        AirplaneDetails ad = new AirplaneDetails();
        airplane.add(ad);
        return ad;
    }
    
    public static Customer addcustomer()
    {
        Customer cust = new Customer();
        customer.add(cust);
        return cust;
    }
    
    
    public static void array_customer() throws FileNotFoundException, IOException{
        CsvReader csv = new CsvReader("C:\\Users\\ariha\\Documents\\NetBeansProjects\\AirlineRevenue\\src\\airlinerevenue\\Cutomer.csv");
        csv.readHeaders();
        while(csv.readRecord()){
            Object [] row = new Object[10];
            row[0] = csv.get("Name");
            row[1] = csv.get("Contact");
            row[2] = csv.get("Airline");
            row[3] = csv.get("Source");
            row[4] = csv.get("Destination");
            row[5] = csv.get("Flight No.");
            row[6] = csv.get("Total Seats");
            row[7] = csv.get("Window");
            row[8] = csv.get("Middle");
            row[9] = csv.get("Aisle");
            
            Customer cs = addcustomer();
            cs.setName(row[0].toString());
            cs.setContact(Integer.parseInt(row[1].toString()));
            cs.setAirline(row[2].toString());
            cs.setSource(row[3].toString());
            cs.setDestination(row[4].toString());
            cs.setFlight(row[5].toString());
            cs.setNo_of_seats(Integer.parseInt(row[6].toString()));
            cs.setWindow(Integer.parseInt(row[7].toString()));
            cs.setMiddle(Integer.parseInt(row[8].toString()));
            cs.setAisle(Integer.parseInt(row[9].toString()));
        }
    }
    
    public static void array_airplane() throws FileNotFoundException, IOException{
        CsvReader csv = new CsvReader("C:\\Users\\ariha\\Documents\\NetBeansProjects\\AirlineRevenue\\src\\airlinerevenue\\Airplane.csv");
        csv.readHeaders();
        while(csv.readRecord()){
            Object [] row = new Object[11];
            row[0] = csv.get("Serial No.");
            row[1] = csv.get("Airline");
            row[2] = csv.get("Model No.");
            row[3] = csv.get("Seating Capacity");
            row[4] = csv.get("Window_seat");
            row[5] = csv.get("Middle_seat");
            row[6] = csv.get("Aisle_seat");
            row[7] = csv.get("Window_cost");
            row[8] = csv.get("Middle_cost");
            row[9] = csv.get("Aisle_cost");
            row[10] = csv.get("Total Cost");
            
            AirplaneDetails airplane = addairplane();
            airplane.setSerialNo(Integer.parseInt(row[0].toString()));
            airplane.setAirline(row[1].toString());
            airplane.setModelNo(row[2].toString());
            airplane.setTotal_seats(Integer.parseInt(row[3].toString()));
            airplane.setWindow(Integer.parseInt(row[4].toString()));
            airplane.setMiddle(Integer.parseInt(row[5].toString()));
            airplane.setAisle(Integer.parseInt(row[6].toString()));
            airplane.setWin_cost(Integer.parseInt(row[7].toString()));
            airplane.setMid_cost(Integer.parseInt(row[8].toString()));
            airplane.setAis_cost(Integer.parseInt(row[9].toString()));
            airplane.setCost_of_flight(Integer.parseInt(row[10].toString()));
        }
    }
        
    public static Object [] getairlinedetails(){
        String [] str = new String[7];
        int i = 0;
        for(AirplaneDetails air : getAirplane()){
            str[i] = air.getAirline();
            i++;
        }
        List list = Arrays.asList(str);
        Set set = new HashSet(list);        
        Object[] airline_name = set.toArray();        
        
        return airline_name;
    }

    public static int[] expectedflightcost(){
        int i = 0, cost = 0;
        int cost_data [] = new int[7];
        for(AirplaneDetails ad : getAirplane()){
            {
                int win = ad.getWindow() * ad.getWin_cost();
                int mid = ad.getMiddle()* ad.getMid_cost();
                int ais = ad.getAisle()* ad.getAis_cost();
                    cost = win + mid + ais;
                cost_data[i] = cost;
                i++;
            }
        }
        return cost_data;
    }
    
    
    public static int[] flightcost(){
        int i = 0, cost = 0;
        int cost_data [] = new int[7];
        String [] fno = new String[7];
        
       
        for(AirplaneDetails ad : getAirplane()){
            fno[i] = ad.getModelNo();
            cost_data[i] = 0;
                for(Customer cs : getCustomer()){
                    if(fno[i].equals(cs.getFlight())){
                            int win = cs.getWindow() * ad.getWin_cost();
                            int mid = cs.getMiddle() * ad.getMid_cost();
                            int ais = cs.getAisle() * ad.getAis_cost();
                            cost = win + mid + ais;
                            cost_data[i] += cost;
                    }
                        
                    }
                i++;
                }
                
                
        return cost_data;
    }
    
    
    public static int expectedairlinecost(String air){
        int i = 0, cost = 0;
                for(AirplaneDetails ad : getAirplane()){
                    if(ad.getAirline().equals(air)){
                        int win = ad.getWindow() * ad.getWin_cost();
                        int mid = ad.getMiddle()* ad.getMid_cost();
                        int ais = ad.getAisle()* ad.getAis_cost();
                        
                        cost += win + mid + ais;
                        i++;
                    }
                }
        return cost;
    }
    
    public static int airlinecost(String air){
        int i = 0, cost = 0;
        
            for(Customer cs : getCustomer()){
                for(AirplaneDetails ad : getAirplane()){
                    if(cs.getFlight().equals(ad.getModelNo())){
                        if(cs.getAirline().equals(air)){
                            int win = cs.getWindow() * ad.getWin_cost();

                            int mid = cs.getMiddle() * ad.getMid_cost();

                            int ais = cs.getAisle() * ad.getAis_cost();

                            cost += win + mid + ais;
                            i++;
                        }
                    }
                }
            }
          
        return cost;
    }
    
    public static void main(String [] args) throws IOException {
        int i = 0, j = 0;
        array_customer();
        array_airplane();
        Object [] air_name = getairlinedetails();
        String [] air = Arrays.copyOf(air_name, air_name.length, String[].class);
        
    //expected cost of each flight
        int [] expectedflight_cost = expectedflightcost();
        System.out.println("Expected Revenue for Flights:");
        for(AirplaneDetails ad : getAirplane()){
                System.out.println("Flight:\t" + ad.getAirline() + " - " + ad.getModelNo() + "\tCost:   " + "$"+ expectedflight_cost[i]);
                i++;
        }
        
    //expected cost of each airline    
        int ideal_emirates_cost = expectedairlinecost(air[1]);
        int ideal_qatar_cost = expectedairlinecost(air[0]);
        System.out.println("\nExpected Revenue for Emirates:\t" + "$"+ ideal_emirates_cost + "." +  "\tExpected Revenue for Qatar:\t" + "$"+ ideal_qatar_cost + ".");    
        
        int tot = ideal_emirates_cost + ideal_qatar_cost;
        System.out.println("Expected Total Revenue for all Airline for all flight:\t" + "$"+ tot + ".");
        
        
    //cost of each flight
        int [] flight_cost = flightcost();
        System.out.println("\nActual Revenue for Flights:");
        
        for(AirplaneDetails ad : getAirplane()){
            System.out.println("Flight:\t" + ad.getAirline()+ " - " + ad.getModelNo()+ "\tCost:   " + "$"+ flight_cost[j]);
            j++;

        }
        
    //actual cost of each airline    
        int emirates_cost = airlinecost(air[1]);
        int qatar_cost = airlinecost(air[0]);
        System.out.println("\nActual Revenue for Emirates:\t" + "$"+ emirates_cost + "." + "\tActual Revenue for Qatar:\t" + "$"+ qatar_cost + ".");
        
        int exp_tot = emirates_cost + qatar_cost;
        System.out.println("Actual Total Revenue for all Airline for all flight:\t" + "$"+ exp_tot + ".");
        
        System.out.println("\nAnalysis:");
        
        
    //Loss in revenue for each flight
        int k = 0;
        System.out.println("\nLoss in Revenue for individual Flights:");
        for(AirplaneDetails ad : getAirplane()){
            int seen = flight_cost[k];
            int exp = expectedflight_cost[k];
            int total = exp-seen;
                System.out.println("Flight:\t" + ad.getAirline() + " - " + ad.getModelNo() + "\tLoss:   " + "$"+ total);
                k++;            
        }
        
    //Loss in revenue for each airline    
        int emirates_loss = ideal_emirates_cost - emirates_cost;
        int qatar_loss = ideal_qatar_cost - qatar_cost;
        System.out.println("\nLoss in Revenue for Emirates:\t" + "$"+ emirates_loss + "." + "\tLoss in Revenue for Qatar:\t" + "$"+ qatar_loss + ".");
       
        
    //total loss in revenue
        int tot_loss = tot - exp_tot;
        System.out.println("\nTotal Loss in Revenue for all Airline for all flight:\t" + "$"+ tot_loss + ".");
        
    }

}
