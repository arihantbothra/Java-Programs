/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public abstract class Role {
    
    /**
     *
     */
    public enum RoleType{
        CompanyAdmin("Company Admin"),
        EmployeeHelpAgencyAdmin("Employee help Agency Admin"),
        GlassDoorAdmin("GlassDoor Admin"),
        HRManager("HR manager"),
        ITDepartment("IT department"),
        MarketingDepartment("Marketing department"),
        HeadOffice("Head office"),
        SexualOffenceDepartment("Sexual offence department"),
        GenderInequalityDepartment("Gender Inequality department"),
        RacismDepartment("Racism Department"),
        glassDoorManager("GlassDoor Manager"),
        AnalysisDepartment("Analysis Department");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}