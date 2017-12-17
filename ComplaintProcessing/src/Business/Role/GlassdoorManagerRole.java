/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GlassdoorManagerOrganization;
import Business.Organization.HRManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Glassdoor.GlassdoorAnalytics;
import UserInterface.HRManagerRole.HRManagerWorkAreaJPanel;
import com.csvreader.CsvReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class GlassdoorManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        try {
            return new GlassdoorAnalytics(userProcessContainer,account,(GlassdoorManagerOrganization)organization,business,enterprise,business);//To change body of generated methods, choose Tools | Templates.
        } catch (CsvReader.FinalizedException ex) {
            Logger.getLogger(GlassdoorManagerRole.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvReader.CatastrophicException ex) {
            Logger.getLogger(GlassdoorManagerRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
    
}
