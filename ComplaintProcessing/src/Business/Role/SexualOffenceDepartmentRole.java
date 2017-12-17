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
import Business.Organization.SexualOffenceDepartmentOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.EmployeeHelpSubRoles.RacismWorkAreaJPanel;
import UserInterface.EmployeeHelpSubRoles.SexualOffenceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class SexualOffenceDepartmentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SexualOffenceWorkAreaJPanel(userProcessContainer, account,(SexualOffenceDepartmentOrganization)organization,business,enterprise);
    }
    
}
