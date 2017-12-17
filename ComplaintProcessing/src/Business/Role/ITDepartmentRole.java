/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ITDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ITDepartmentRole.ITDepartmentComplaintWorkAreaJPanel;
import UserInterface.ITDepartmentRole.ITWorkAreaJPanel;
//import UserInterface.DistributorInventoryManagerRole.DistributorInventoryManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class ITDepartmentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return new ITWorkAreaJPanel(userProcessContainer, account, (ITDepartmentOrganization)organization,business,enterprise);
    }
    
}
