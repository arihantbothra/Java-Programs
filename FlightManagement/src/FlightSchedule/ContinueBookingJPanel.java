/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightSchedule;

import Business.Agent;
import Business.Airline;
import Business.Airline_Access;
import Business.Customer;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class ContinueBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContinueBookingJPanel
     */
    JPanel panel;
    private Agent agent;
    String custId;
    String booking;
    public ContinueBookingJPanel(JPanel panel, Agent agent, String custid, String booking) {
        this.panel = panel;
        this.agent = agent;
        this.custId = custid;
        this.booking = booking;
        initComponents();
    }
    
    String flight;
    public void setFlight(String flightno) {
        this.flight = flightno;
    }
      

    public void setdata(){
        for(Airline air : agent.getAirplane()) {
            if(air.getModelNo().equals(flight)){
                airline.setText(air.getAirline());
                model.setText(air.getModelNo());
                source.setText(air.getSource());
                destination.setText(air.getDestination());
                time.setText(air.getTime());
            }
        }
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airline = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        source = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        window = new javax.swing.JComboBox<>();
        middle = new javax.swing.JComboBox<>();
        aisle = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        window.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0","1","2","3","4","5","6","7","8" }));

        middle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0","1","2","3","4","5","6","7","8" }));

        aisle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0","1","2","3","4","5","6","7","8" }));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        jLabel1.setText("    Window");

        jLabel2.setText("     Middle");

        jLabel3.setText("       Aisle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(airline, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proceed))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(window, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(aisle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airline, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(window, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aisle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(proceed))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        try{int win = Integer.parseInt(window.getSelectedItem().toString());
        int mid = Integer.parseInt(middle.getSelectedItem().toString());
        int ais = Integer.parseInt(aisle.getSelectedItem().toString());
        
        if((win + mid + ais) > 8){
            JOptionPane.showMessageDialog(null, "Cannot book more than 8 seats");
        }
        else{
            for(Airline air : agent.getAirplane()) {
                if(air.getModelNo().equals(flight)){
                    if(air.getWindow() < win)
                        JOptionPane.showMessageDialog(null, "Limited Window seats" + air.getWindow());
                    else if(air.getMiddle()< mid)
                        JOptionPane.showMessageDialog(null, "Limited Middle seats" + air.getMiddle());
                    else if(air.getAisle()< ais)
                        JOptionPane.showMessageDialog(null, "Limited Aisle seats" + air.getAisle());
                    else{
                        air.setWindow(air.getWindow() - win);
                        air.setMiddle(air.getMiddle() - mid);
                        air.setAisle(air.getAisle() - ais);
                        air.setBooked(win + mid + ais);
                        
                        boolean status = book(air, win, mid, ais);
                        
                        if(status){
                            JOptionPane.showMessageDialog(null, "Bookings Done");
                        }
                        else{
                            air.setWindow(air.getWindow() + win);
                            air.setMiddle(air.getMiddle() + mid);
                            air.setAisle(air.getAisle() + ais);
                            air.setBooked(-(win + mid + ais));
                            JOptionPane.showMessageDialog(null, "Booking Failed");
                        }
                        
                    }
                }
            }
        }
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_proceedActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        panel.remove(this);
        CardLayout layout = (CardLayout)panel.getLayout();
        layout.previous(panel);
    }//GEN-LAST:event_cancelActionPerformed

    
    public boolean book(Airline air, int win, int mid, int ais){
        Customer cs = agent.addcustomer();
        cs.setCustId(custId);
        cs.setAirline(air.getAirline());
        cs.setSource(air.getSource());
        cs.setDestination(air.getDestination());
        cs.setFlight(air.getModelNo());
        cs.setTime(air.getTime());
        cs.setNo_of_seats(win + mid + ais);
        cs.setWindow(win);
        cs.setMiddle(mid);
        cs.setAisle(ais);
        cs.setBooking(booking);
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airline;
    private javax.swing.JComboBox<String> aisle;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> middle;
    private javax.swing.JLabel model;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel source;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> window;
    // End of variables declaration//GEN-END:variables

    

    
}
