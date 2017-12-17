/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HeadOfficeRole;

import Business.EcoSystem;
import Business.Enterprise.EmployeeHelpAgencyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GlassdoorEnterprise;
import Business.Organization.GenderInequalityDepartmentOrganization;
import Business.Organization.GlassdoorManagerOrganization;
import Business.Organization.HRManagerOrganization;
import Business.Organization.HeadOfficeOrganization;
import Business.Organization.ITDepartmentOrganization;
import Business.Organization.Organization;
import Business.Organization.RacismDepartmentOrganization;
import Business.Organization.SexualOffenceDepartmentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.network.Network;
import UserInterface.EmployeeHelpSubRoles.GenderInequalityWorkAreaJPanel;
import UserInterface.EmployeeHelpSubRoles.RacismWorkAreaJPanel;
import UserInterface.EmployeeHelpSubRoles.SexualOffenceWorkAreaJPanel;
import UserInterface.HRManagerRole.ProcessWorkRequestJPanel;
import UserInterface.ITDepartmentRole.RequestComplaintToHeadOffice;
import UserInterface.SystemAdminWorkArea.ManageNetworkJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arihant
 */
public class HeadOfficeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HeadOfficeWorkAreaJPanel
     */
     private JPanel userProcessContainer;
     private EcoSystem business;
     private UserAccount userAccount;
     private HeadOfficeOrganization headOfficeOrganization;
     private Enterprise enterprise;
     private Organization organization;
     private GenderInequalityDepartmentOrganization genderInequalityDepartmentOrganization;
  

    public HeadOfficeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise= enterprise;
        this.headOfficeOrganization= (HeadOfficeOrganization) organization;
        this.organization = organization;
       valueLabel.setText(enterprise.getName());
       populateTable();
       //populateSubTable();
       populateComboBox();
    }
    
    public void populateComboBox()
    {
        comboBoxEmployeeHelpSubAgencies.addItem(Organization.Type.GenderInequalityDepartment.toString());
        comboBoxEmployeeHelpSubAgencies.addItem(Organization.Type.SexualOffenceDepartment.toString() );
        comboBoxEmployeeHelpSubAgencies.addItem(Organization.Type.RacismDepartment.toString());
    }
    
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : headOfficeOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
            row[0]= request.getCompanyInfo();
            row[1] = request;
            row[2] = request.getSender().getEmployee().getEmployeeName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[4]= request.getComplaintAgainst();
            row[5] = request.getStatus();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[6] = result == null ? "Waiting" : result;
            row[7]= request.getComplaintType();
            model.addRow(row);
        }
    }
     
//     public void populateSubTable()
//     {
//         DefaultTableModel model1 = (DefaultTableModel)workRequestJTable.getModel();
//        
//        model1.setRowCount(0);
//        
//        for(WorkRequest request1 : userAccount.getWorkQueue().getWorkRequestList()){
//            Object[] row1 = new Object[8];
//            row1[0]= request1.getCompanyInfo();
//            row1[1] = request1;
//            row1[2] = request1.getSender().getEmployee().getEmployeeName();
//            row1[3] = request1.getReceiver() == null ? null : request1.getReceiver().getEmployee().getEmployeeName();
//            row1[4]= request1.getComplaintAgainst();
//            row1[5] = request1.getStatus();
//            String result = ((LabTestWorkRequest) request1).getTestResult();
//            row1[6] = result == null ? "Waiting" : result;
//            row1[7]= request1.getComplaintType();
//            model1.addRow(row1);
//            
//        }
//   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxEmployeeHelpSubAgencies = new javax.swing.JComboBox();
        btnForward = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnForwardGlassdoor = new javax.swing.JButton();

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Enterprise:");

        valueLabel.setText("jLabel3");

        jLabel1.setText("Forward complaint to :");

        btnForward.setText("Forward");
        btnForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForwardActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "company", "Message", "Sender", "Receiver", "Complaint Against", "Status", "Result", "complaint Typre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnForwardGlassdoor.setText("Forward Complaint To Glassdoor");
        btnForwardGlassdoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForwardGlassdoorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(comboBoxEmployeeHelpSubAgencies, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnForward)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnForwardGlassdoor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(assignJButton)
                                    .addGap(180, 180, 180)
                                    .addComponent(processJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(298, 298, 298)
                                    .addComponent(refreshJButton))))
                        .addGap(168, 168, 168))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel3)
                    .addGap(75, 75, 75)
                    .addComponent(valueLabel)
                    .addContainerGap(587, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForwardGlassdoor)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxEmployeeHelpSubAgencies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnForward)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel)
                        .addComponent(jLabel3))
                    .addContainerGap(483, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

       int selectedRow = workRequestJTable.getSelectedRow();
                
        if (selectedRow < 0){
           JOptionPane.showMessageDialog(null,"please select a row");
            return;
        }
        
       if (!workRequestJTable.getValueAt(selectedRow,7).equals("Other")) 
            {
                JOptionPane.showMessageDialog(null,"please forward the msg to the appropriate department");
            }
       else{
        
        System.out.println("user name"+userAccount);
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
       }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"please select a row");
            return;
        }
            if (!workRequestJTable.getValueAt(selectedRow,7).equals("Other")) 
            {
                JOptionPane.showMessageDialog(null,"please forward the msg to the appropriate department");
            }
       else{

        LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);

        request.setStatus("Processing");

        ProcessHeadOfficeWorkRequestJPanel processHeadOfficeWorkRequestJPanel = new ProcessHeadOfficeWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processHeadOfficeWorkRequestJPanel", processHeadOfficeWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable(); 
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForwardActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRow = workRequestJTable.getSelectedRow();
     
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }
            
        if(comboBoxEmployeeHelpSubAgencies.getSelectedItem().equals(Organization.Type.SexualOffenceDepartment.toString()))
        {
        
        EmployeeHelpAgencyEnterprise employeeHelpAgencyEnterprise = null;
        LabTestWorkRequest request =  new LabTestWorkRequest();
        LabTestWorkRequest selectedRequest = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);
        System.out.println("selected request:"+selectedRequest);
       request.setMessage(selectedRequest.getMessage());
        request.setSender(selectedRequest.getSender());
                System.out.println("sender"+selectedRequest.getSender());
                System.out.println("sender is ho? :"+userAccount );
        request.setStatus("Sent");
        request.setCompanyInfo(selectedRequest.getCompanyInfo());
                System.out.println("comp info"+selectedRequest.getCompanyInfo());
        request.setComplaintType(selectedRequest.getComplaintType());
             System.out.println("comp info"+selectedRequest.getComplaintType());
        request.setComplaintAgainst(selectedRequest.getComplaintAgainst());
        
        Organization org = null;
        for(Network network : business.getNetworkList() )
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(  enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.EmployeeHelpAgency))
                {
                    employeeHelpAgencyEnterprise = (EmployeeHelpAgencyEnterprise)enterprise;
                }
            }
        }

        for (Organization organization : employeeHelpAgencyEnterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof SexualOffenceDepartmentOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
             JOptionPane.showMessageDialog(null, "complaint forwarded to sexual Offence department");
        }
       
        }
        else
        if(comboBoxEmployeeHelpSubAgencies.getSelectedItem().equals(Organization.Type.RacismDepartment.toString()))
        {
          EmployeeHelpAgencyEnterprise employeeHelpAgencyEnterprise = null;
        LabTestWorkRequest request = new LabTestWorkRequest();
        LabTestWorkRequest selectedRequest = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);
         System.out.println("selected request:"+selectedRequest);
       request.setMessage(selectedRequest.getMessage());
        request.setSender(selectedRequest.getSender());
                System.out.println("sender"+selectedRequest.getSender());
                System.out.println("sender is ho? :"+userAccount );
        request.setStatus("Sent");
        request.setCompanyInfo(selectedRequest.getCompanyInfo());
                System.out.println("comp info"+selectedRequest.getCompanyInfo());
        request.setComplaintType(selectedRequest.getComplaintType());
             System.out.println("comp info"+selectedRequest.getComplaintType());
        request.setComplaintAgainst(selectedRequest.getComplaintAgainst());

        Organization org = null;
        for(Network network : business.getNetworkList() )
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(  enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.EmployeeHelpAgency))
                {
                    employeeHelpAgencyEnterprise = (EmployeeHelpAgencyEnterprise)enterprise;
                }
            }
        }

        for (Organization organization : employeeHelpAgencyEnterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RacismDepartmentOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
             JOptionPane.showMessageDialog(null, "complaint forwarded to Racism department");
        }
        }
        else
            if(comboBoxEmployeeHelpSubAgencies.getSelectedItem().equals(Organization.Type.GenderInequalityDepartment.toString()))
            {
        EmployeeHelpAgencyEnterprise employeeHelpAgencyEnterprise = null;
        LabTestWorkRequest request = new LabTestWorkRequest();
        LabTestWorkRequest selectedRequest = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);
        System.out.println("selected request:"+selectedRequest);
       request.setMessage(selectedRequest.getMessage());
        request.setSender(selectedRequest.getSender());
                System.out.println("sender"+selectedRequest.getSender());
                System.out.println("sender is ho? :"+userAccount );
        request.setStatus("Sent");
        request.setCompanyInfo(selectedRequest.getCompanyInfo());
                System.out.println("comp info"+selectedRequest.getCompanyInfo());
        request.setComplaintType(selectedRequest.getComplaintType());
             System.out.println("comp info"+selectedRequest.getComplaintType());
        request.setComplaintAgainst(selectedRequest.getComplaintAgainst());

        Organization org = null;
        for(Network network : business.getNetworkList() )
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(  enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.EmployeeHelpAgency))
                {
                    employeeHelpAgencyEnterprise = (EmployeeHelpAgencyEnterprise)enterprise;
                }
            }
        }

        for (Organization organization : employeeHelpAgencyEnterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof GenderInequalityDepartmentOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
             JOptionPane.showMessageDialog(null, "complaint forwarded to Gender inequality department");
        }
            }
        else 
                JOptionPane.showMessageDialog(null,"Select and organization to forward the complaint too");
                
    }//GEN-LAST:event_btnForwardActionPerformed

    private void btnForwardGlassdoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForwardGlassdoorActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }
        GlassdoorEnterprise glassdoorEnterprise =null;
        LabTestWorkRequest request =new LabTestWorkRequest();
        LabTestWorkRequest selReq = (LabTestWorkRequest) (WorkRequest) workRequestJTable.getValueAt(selectedRow,1);
        request.setCompanyInfo(selReq.getCompanyInfo());
        System.out.println("co-"+selReq.getCompanyInfo());
        request.setMessage(selReq.getMessage());
        System.out.println("msg-"+selReq.getMessage());
        request.setTestResult(selReq.getTestResult());
        System.out.println("tr-"+selReq.getTestResult());

        //   EmployeeHelpAgencyEnterprise employeeHelpAgencyEnterprise = null;
        //LabTestWorkRequest request =  new LabTestWorkRequest();
        //  LabTestWorkRequest selectedRequest = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 1);
        //System.out.println("selected request:"+selectedRequest);
        //  request.setCompanyInfo();
        //request.setCompanyInfo();

        Organization org = null;

        for(Network network : business.getNetworkList() )
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(  enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.glassdoor))
                {
                    glassdoorEnterprise = (GlassdoorEnterprise) enterprise;
                }
            }
        }

        for (Organization organization : glassdoorEnterprise.getOrganizationDirectory().getOrganizationList()){

            if (organization instanceof GlassdoorManagerOrganization){
                org = organization;
                break;
            }

        }

        if (org!=null){

            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Details sent to glassDoor");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnForwardGlassdoorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnForward;
    private javax.swing.JButton btnForwardGlassdoor;
    private javax.swing.JComboBox comboBoxEmployeeHelpSubAgencies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
