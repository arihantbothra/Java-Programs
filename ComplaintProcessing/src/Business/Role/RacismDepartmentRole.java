/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GenderInequalityDepartmentOrganization;
import Business.Organization.Organization;
import Business.Organization.RacismDepartmentOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.EmployeeHelpSubRoles.GenderInequalityWorkAreaJPanel;
import UserInterface.EmployeeHelpSubRoles.RacismWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class RacismDepartmentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RacismWorkAreaJPanel(userProcessContainer, account,(RacismDepartmentOrganization)organization,business,enterprise);

    }
    
    
}
