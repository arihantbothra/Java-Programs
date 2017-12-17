/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Glassdoor;

import Business.Analytics.SalaryComparator;
import Business.EcoSystem;
import java.io.BufferedReader;
import java.io.FileReader;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.CompanyList;
import Business.Enterprise.Enterprise;
import Business.Organization.GlassdoorManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.SexualOffenceDepartmentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.HRManagerRole.ProcessWorkRequestJPanel;
import com.csvreader.CsvReader;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.CardLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arihant
 */
public class GlassdoorAnalytics extends javax.swing.JPanel {

    /**
     * Creates new form GlassdoorAnalytics
     */
    private CompanyList companyList;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private GlassdoorManagerOrganization glassDoorOrganization;
    private Enterprise enterprise;
    private List<CompanyList> opList;
    LabTestWorkRequest request;
    //public GlassdoorAnalytics(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {

    public GlassdoorAnalytics(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise, EcoSystem business0) throws CsvReader.FinalizedException, CsvReader.CatastrophicException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.glassDoorOrganization = (GlassdoorManagerOrganization) organization;
        this.enterprise = enterprise;
        companyList = new CompanyList();
        request=request;

        String csvFile = "Analysis.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        ArrayList<String> positions = new ArrayList<>();
        ArrayList<String> positionsFinal;
        //  CompanyList list = new CompanyList()
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] companyElement = line.split(csvSplitBy);
                CompanyEnterprise company = companyList.addCompany(line);// = companyList.addCompany
                company.setName(companyElement[0]);
                company.setPosition(companyElement[1]);
                company.setSalary(Integer.parseInt(companyElement[2]));
                positions.add(companyElement[1]);
                populateTable();
            }
            
            Set<String> positionsMain = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
            positionsMain.addAll(positions);
            positionsFinal = new ArrayList<>(positionsMain);
            
            for(int i = 0; i < positionsFinal.size(); i++) {
                comboBox.addItem(positionsFinal.get(i));
            }
            
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        populateGlassdoortable();
        populateTable();
    }  //To change body of generated methods, choose Tools | Templates.
 //Collections.sort(opList, new Salary);
//    opList = new ArrayList<>();
//        for (CompanyEnterprise ce : companyList.get) {
//            opList.add(sm);
//        }
//
//        // SORT THE LIST BY REVENUE FIRST
//        Collections.sort(opList, new CompareByRevenue());
//        // THEN SORT THE LIST BY MARKET
//        Collections.sort(opList, CompareByMarket.marketComparator);
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAnalytics.getModel();
        dtm.setRowCount(0);

        for (CompanyEnterprise company : companyList.getCompanyList()) {
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = company;
            row[1] = company.getSalary();

            dtm.addRow(row);
        }
    }
public void populateGlassdoortable(){
    DefaultTableModel model1 = (DefaultTableModel)workRequestJTable.getModel();
        
        model1.setRowCount(0);
        
        for(WorkRequest request : glassDoorOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0]= request.getCompanyInfo();
            row[1] = request.getMessage();
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[2] = result == null ? "Waiting" : result;
           // row[2] = request.get
            model1.addRow(row);
    
} 
}
public void populateReviewTable(){
    DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
       // String name=employee.getEmployeeName();
       
        for(WorkRequest request: glassDoorOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0]= request.getSender();
            
            row[1] = request.getCompanyInfo();
           row[2]=request.getReview();
            row[3]=request.getPosition();
          //  String result = ((LabTestWorkRequest) request).getTestResult();
//            row[2] = emp.getPosition();
//            row[3]=emp.getRating();
           // row[2] = request.get
            model.addRow(row); 
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
        tblAnalytics = new javax.swing.JTable();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReview = new javax.swing.JTable();

        tblAnalytics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Salary"
            }
        ));
        jScrollPane1.setViewportView(tblAnalytics);

        jLabel1.setText("Position");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Complaint", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        tblReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company", "Rating", "Review"
            }
        ));
        jScrollPane3.setViewportView(tblReview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(33, 33, 33)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(375, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(374, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAnalytics;
    private javax.swing.JTable tblReview;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
