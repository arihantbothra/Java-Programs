/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Analysis;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalysisDepartmnetOrganization;
import Business.Organization.GenderInequalityDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.network.Network;
import ReviewForm.ReviewForm;
import java.awt.FlowLayout;
import java.text.NumberFormat;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import javafx.application.Application;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;
/**
 *
 * @author arihant
 */
public class AnalysisJPanel extends javax.swing.JPanel {
public EmployeeDirectory empd;
public Object[] list;
DefaultPieDataset pieDataset;
JFreeChart pieChart;
JFreeChart barChart;
   int[] sensorData = new int[12];
   int[] DataSet = new int [20];
   
     private JPanel userProcessContainer;
     private EcoSystem business;
     private UserAccount userAccount;
     private AnalysisDepartmnetOrganization analysisDepartmnetOrganization;
     private Enterprise enterprise;
     private Organization org;
     final  String Amazon  = "Amazon";
    final  String Google = "Google";
    final  String Apple = "Apple";
    final String CasesSolved="cases solved";
    final String CasesPending="cases pending";
     final String CasesNotSolved="dissatisfactory cases";
    /**
     * Creates new form NewJPanel
     */
   

    public AnalysisJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
       
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount =account;
        this.business = business;
        this.analysisDepartmnetOrganization= (AnalysisDepartmnetOrganization) organization;
        this.enterprise=enterprise;
        this.empd =empd;
        this.org = organization;
        populateEnterpriseComboBox();
//        populate();
//        Analysis();
//        createDataset();
//        pieChart();
//        barChart();
        
    }
    
    
    
    private void populateEnterpriseComboBox(){
        company.removeAllItems();
        
        for (Network net : business.getNetworkList()){
            for (Enterprise enterprise : net.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getName().equals("OnePlus"))
                    company.addItem(enterprise.toString());
        }
        }
    }
    
    
    public void populate(){
        list= org.getEmployeeDirectory().getcompanydetails();
        for(int i =0; i< list.length - 1; i ++)
            System.out.println(list[i].toString());
    }
    
public  void Analysis() {

     JFreeChart   barChart = ChartFactory.createBarChart(
                "company", // pieChart title
                "Category", // domain axis label
                "Value", // range axis label
                createDataset(), // data
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
                ChartPanel chartPanel = new ChartPanel(barChart);        
                chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ));        
                barPanel.add( chartPanel ); 
       
}
 
  public void barChart(){
     
        final DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
      
        for (int i = 0; i < 12; i++) {
          int j = i;
          barDataset.addValue(4.0, Google,CasesSolved);
        barDataset.addValue(5.0, Google,CasesPending);
        barDataset.addValue(2.0, Google,CasesNotSolved);
        
           barDataset.addValue(7.0, Amazon,CasesSolved);
        barDataset.addValue(3.0, Amazon,CasesPending);
        barDataset.addValue(1.0, Amazon,CasesNotSolved);
        
           barDataset.addValue(6.0, Apple,CasesSolved);
        barDataset.addValue(4.0, Apple,CasesPending);
        barDataset.addValue(7.0, Apple,CasesNotSolved);
        
    
            // barDataset.setValue(sensorData[i], "Consumer" + (j + 1) + "", cmbxMonthCombo.getSelectedItem() + "");
           
          
        }
        barChart = ChartFactory.createBarChart3D(
                "Company issue Analysis ", // pieChart title
                "Company", // domain axis label
                "Value", // range axis label
                barDataset, // data
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanelBar = new ChartPanel(barChart);
        barPanel.removeAll();
        barPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        barPanel.add(chartPanelBar);
    }

    public void pieChart() {
        pieDataset = new DefaultPieDataset();
        for (int i = 0; i < 5; i++) {
            int j = i;
            pieDataset.setValue("Amazon",8);
            pieDataset.setValue("Apple",3); 
            pieDataset.setValue("Google",5);         
        }
        pieChart = ChartFactory.createPieChart("Cases Solved", // pieChart title                   
                pieDataset, // data 
                true, // include legend                   
                true,
                false);
        ChartPanel chartPanel = new ChartPanel(pieChart);
         piePanel.removeAll();
        piePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        piePanel.add(chartPanel);
      
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setCircular(true);
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0} = {2}", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()
        ));
    }
private CategoryDataset createDataset( ) {
    final String amazon = "amzaon";
    final String apple = "apple";
    final String casesSolved = "cases solved";
    final String casesPending ="cases pending";
    final DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 
    dataset.addValue( 1.0 , amazon , casesPending);        
      dataset.addValue( 3.0 , amazon , casesSolved );        
      dataset.addValue( 5.0 ,  apple,casesPending ); 
      dataset.addValue( 5.0 ,  apple , casesSolved);           
    
      
    return dataset;

}
    

    void plot(String company){
        
        for (Network net : business.getNetworkList()){
            for (Enterprise enterprise : net.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise.getName().equals(company)){
                    System.out.println(enterprise.getName());
                    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                        for(ReviewForm review : org.getReviewList().getReviewform_arraylist()){
                            dataset.setValue(review.getPerformance1(), "Before", review.getEmployee().toString());
                            dataset.setValue(review.getPerformance2(), "After", review.getEmployee().toString());
                        }
                        JFreeChart chart = ChartFactory.createBarChart("Performance", "Employee", "Efficiency", dataset, PlotOrientation.VERTICAL, false, true, false);
                        ChartPanel chartPanel = new ChartPanel(chart);
                        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ));
                        barPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                        barPanel.add(chartPanel);
                    }
                }
//                company.addItem(enterprise.toString());
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        piePanel = new javax.swing.JPanel();
        barPanel = new javax.swing.JPanel();
        company = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout piePanelLayout = new javax.swing.GroupLayout(piePanel);
        piePanel.setLayout(piePanelLayout);
        piePanelLayout.setHorizontalGroup(
            piePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        piePanelLayout.setVerticalGroup(
            piePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("pie", piePanel);

        javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
        barPanel.setLayout(barPanelLayout);
        barPanelLayout.setHorizontalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        barPanelLayout.setVerticalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bar", barPanel);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, 370));

        company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        String comp = (String) company.getSelectedItem();
        if (comp != null){
            plot(comp);
        }
    }//GEN-LAST:event_companyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barPanel;
    private javax.swing.JComboBox<String> company;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel piePanel;
    // End of variables declaration//GEN-END:variables
}
