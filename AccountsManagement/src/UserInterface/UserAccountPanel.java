/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author bothr
 */
public class UserAccountPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserAccountPanel
     */
    JPanel panel;
    Business business;
    String username, name, role;
    public UserAccountPanel(JPanel panel, Business business) {
        initComponents();
        this.panel = panel;
        this.business = business;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    void populate(){
        userid.setText(username);
        name_op.setText(name);
        role_op.setText(role);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        role_op = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        name_op = new javax.swing.JLabel();
        manageperson = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 30));

        jLabel2.setText("User Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 30));

        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 30));
        add(role_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 30));
        add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, 30));
        add(name_op, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, 30));

        manageperson.setText("Manage Person Accounts -->");
        manageperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepersonActionPerformed(evt);
            }
        });
        add(manageperson, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void managepersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepersonActionPerformed
        PersonDirectory persondirectory = new PersonDirectory(panel, business);
        panel.add("PersonDirectory", persondirectory);
        CardLayout layout = (CardLayout)panel.getLayout();
        layout.next(panel);
    }//GEN-LAST:event_managepersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageperson;
    private javax.swing.JLabel name_op;
    private javax.swing.JLabel role_op;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}