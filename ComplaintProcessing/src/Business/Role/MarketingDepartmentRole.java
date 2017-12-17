/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.MarketingDepartmentOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.MarketingDepartmentRole.MarketingDepartmentComplaintWorkAreaJPanel;
import UserInterface.MarketingDepartmentRole.MarketingWorkAreaJPanel;
//import UserInterface.PHDInventoryManagerRole.PHDInventoryManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class MarketingDepartmentRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MarketingWorkAreaJPanel(userProcessContainer, account, (MarketingDepartmentOrganization)organization,business,enterprise);
    }
    
}
