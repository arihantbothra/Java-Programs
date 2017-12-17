/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MarketingDepartmentRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GlassdoorEnterprise;
import Business.Organization.GlassDoorAdminOrganization;
import Business.Organization.GlassdoorManagerOrganization;
import Business.Organization.ITDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.network.Network;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.RGBImageFilter;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class ReviewCompanyJPanel extends javax.swing.JPanel implements MouseListener, MouseMotionListener{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karuna
 */


    /**
     * Creates new form ReviewCompanyJPanel
     */
    private Employee employee;
    private EmployeeDirectory employeeList;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ITDepartmentOrganization organization;
    private int gap;
  protected List< ImageIcon > iconList;
  protected List< JLabel > labelList = Arrays.asList(
    new JLabel(),new JLabel(),new JLabel(),new JLabel(),new JLabel()
  );
  protected ImageIcon defaultIcon;
  private int clicked = -1;
    /**
     *
     * @param userProcessContainer
     * @param organization
     * @param employee
     * @param employeeList
     * @param business
     * @param userAccount
     * @param enterprise
     */
    public ReviewCompanyJPanel(ImageIcon defaultIcon, List< ImageIcon> iconList, int gap,JPanel userProcessContainer,Organization organization,Employee employee,EmployeeDirectory employeeList,EcoSystem business, UserAccount userAccount,Enterprise enterprise){
       super(new GridLayout(1, 5, gap*2, gap*2)); 
       initComponents();
         
    this.defaultIcon = defaultIcon;
    this.iconList = iconList;
    this.gap = gap;
        //this.employee=employee;
        this.userProcessContainer=userProcessContainer;
        this.employeeList=employeeList;
        this.enterprise=enterprise;
        this.business=business;
        this.userAccount=userAccount;
        this.organization=(ITDepartmentOrganization)organization;
        this.employee=employee;
        lblCompany.setText(enterprise.getName());
        lblDepartment.setText(organization.getName());
        lblName.setText(userAccount.getUsername());
        //System.out.println(organization.getName());
        for(JLabel l:labelList) {
      l.setIcon(defaultIcon);
      add(l);
    }
    addMouseListener(this);
    addMouseMotionListener(this);
    }

  public void clear() {
    clicked = -1;
    repaintIcon(clicked);
  }
  public int getLevel() {
    return clicked;
  }
  public void setLevel(int l) {
    clicked = l;
    repaintIcon(clicked);
  }
  private int getSelectedIconIndex(Point p) {
    for(int i=0;i < labelList.size();i++) {
      Rectangle r = labelList.get(i).getBounds();
      r.grow(gap, gap);
      if(r.contains(p)) return i;
    }
    return -1;
  }
  protected void repaintIcon(int index) {
    for(int i=0;i < labelList.size();i++) {
      labelList.get(i).setIcon(i <= index?iconList.get(i):defaultIcon);
    }
    repaint();
  }
  public void mouseMoved(MouseEvent e) {
    repaintIcon(getSelectedIconIndex(e.getPoint()));
  }
  public void mouseEntered(MouseEvent e) {
    repaintIcon(getSelectedIconIndex(e.getPoint()));
  }
  public void mouseClicked(MouseEvent e) {
    clicked = getSelectedIconIndex(e.getPoint());
  }
  public void mouseExited(MouseEvent e) {
    repaintIcon(clicked);
  }
  public void mouseDragged(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}

class SelectedImageFilter extends RGBImageFilter {
  private final float[] filter;
  public SelectedImageFilter(float[] filter) {
    this.filter = filter;
    canFilterIndexColorModel = true;
  }
  public int filterRGB(int x, int y, int argb) {
    Color color = new Color(argb, true);
    float[] array = new float[4];
    color.getComponents(array);
    return new Color(array[0]*filter[0],
                     array[1]*filter[1],
                     array[2]*filter[2],
                     array[3]).getRGB();
  }
}
//         for(Employee emp:organization.getEmployeeDirectory().getEmployeeList()){
//            // lblName.setText(employee.getEmployeeName());
//         }
    


        //lblName.setText(employee.getEmployeeName());
      //  valueLabel.setText(enterprise.getName());
     
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
        jLabel4 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        txtReview = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();

        jLabel1.setText("Name: ");

        jLabel2.setText("Company: ");

        jLabel3.setText("Position:");

        jLabel4.setText("Rating:");

        Submit.setText("Complete the review");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        lblName.setText("jLabel5");

        lblCompany.setText("jLabel6");

        lblDepartment.setText("jLabel5");

        jLabel5.setText("Department");

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        back.setText(">>Back");

        jLabel6.setText("Review");

        lblRating.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRating)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblName)
                                .addComponent(lblCompany)
                                .addComponent(lblDepartment)
                                .addComponent(txtPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(txtReview)))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(back)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDepartment))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(txtReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblRating)
                .addGap(27, 27, 27)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

String position=txtPosition.getText();
String review=txtReview.getText();
       
     for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
     request.setReview(review);
     request.setPosition(position);
 }

        GlassdoorEnterprise glassdoorEnterprise =null;
        LabTestWorkRequest request =new LabTestWorkRequest();
        
   
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
          
        }


     JOptionPane.showMessageDialog(null,"Review Submitted Successfully");  

   System.out.println(position);
   
    }//GEN-LAST:event_SubmitActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRating;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtReview;
    // End of variables declaration//GEN-END:variables

    

   
}


