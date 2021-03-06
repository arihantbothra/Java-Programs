/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccountDirectory;

/**
 *
 * @author bothr
 */

public class UserDirectory extends javax.swing.JPanel {

    /**
     * Creates new form UserDirectory
     */
    JPanel panel;
    private Business business;
    public UserDirectory(JPanel panel, Business business) {
        initComponents();
        this.panel = panel;
        this.business = business;
        populate();
    }

    void populate(){
        DefaultTableModel dtm = (DefaultTableModel)usertable.getModel();
        dtm.setRowCount(0);
        for(UserAccount ua : business.getUa().getUseraccount()){
            if(ua.getStatus().equals("Active")){
                if(ua.getRole()!=null){
                   Object [] row = new Object[3];
                    row[0] = ua.getUserName();
                    if(ua.getHashpassword() != null)
                        row[1] = ua.getHashpassword().replaceAll(ua.getHashpassword(), "********");
                    else
                        row[1] = "";
                    row[2] = ua.getRole();
                    dtm.addRow(row); 
                }
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        finduser = new javax.swing.JButton();
        newuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Password", "Account Role"
            }
        ));
        jScrollPane1.setViewportView(usertable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 90));

        finduser.setText("Find User Account");
        finduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finduserActionPerformed(evt);
            }
        });
        add(finduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, -1));

        newuser.setText("New User Account");
        newuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserActionPerformed(evt);
            }
        });
        add(newuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 210, 140, -1));

        updateuser.setText("Update User Account");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        add(updateuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("User Account Directory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 40));

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 160, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void finduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finduserActionPerformed
        String name = JOptionPane.showInputDialog("Enter Username");
        DefaultTableModel dtm = (DefaultTableModel)usertable.getModel();
        dtm.setRowCount(0);
        for(UserAccount ua : business.getUa().getUseraccount()){
            if(ua.getUserName().equals(name)){
                Object [] row = new Object[3];
                row[0] = ua.getUserName();
                row[1] = ua.getHashpassword().replaceAll(ua.getHashpassword(), "********");
                row[2] = ua.getRole();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_finduserActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        try{
        int i = usertable.getSelectedRow();
        
            String user = usertable.getValueAt(i, 0).toString();
            for(UserAccount ua : business.getUa().getUseraccount()){
                if(ua.getUserName().equals(user)){
                    if(ua.getPassword() == null){
                        JOptionPane.showMessageDialog(null, "This Person is not a user.");
                    }
                    else{
                        UpdateUserAccount updateuser = new UpdateUserAccount(panel, user, business);
                        panel.add("UpdateUserAccount", updateuser);
                        CardLayout layout = (CardLayout)panel.getLayout();
                        layout.next(panel);
                    }

                }
            }
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_updateuserActionPerformed

    private void newuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserActionPerformed
        for(UserAccount ua : business.getUa().getUseraccount()){
            if(ua.getUserName() != null && ua.getRole() == null){
                NewUserAccount newuser = new NewUserAccount(panel, business);
                panel.add("NewUserAccount", newuser);
                CardLayout layout = (CardLayout)panel.getLayout();
                layout.next(panel);
            }
        }
        
    }//GEN-LAST:event_newuserActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        populate();
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            int row = usertable.getSelectedRow();       
            if(usertable.getValueAt(row, 2).equals("System Admin")){
                JOptionPane.showMessageDialog(null, "Can't Remove Admin");
            }
            else{
                UserAccountDirectory uad = business.getUa();
                uad.deletedata(row);
                this.populate();
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton finduser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newuser;
    private javax.swing.JButton refresh;
    private javax.swing.JButton updateuser;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
