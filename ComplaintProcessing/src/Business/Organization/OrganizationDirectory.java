/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import com.csvreader.CsvReader;
import java.io.IOException;

import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) throws CsvReader.CatastrophicException, CsvReader.FinalizedException, IOException {
        Organization organization = null;
        if (type.getValue().equals(Type.HRManager.getValue())) {
            organization = new HRManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ITDepartment.getValue())) {
            organization = new ITDepartmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.MarketingDepartment.getValue())) {
            organization = new MarketingDepartmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Headoffice.getValue())) {
            organization = new HeadOfficeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RacismDepartment.getValue())) {
            organization = new RacismDepartmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GenderInequalityDepartment.getValue())) {
            organization = new GenderInequalityDepartmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SexualOffenceDepartment.getValue())) {
            organization = new SexualOffenceDepartmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GlassdoorManager.getValue())) {
            organization = new GlassdoorManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DoctorAdmin.getValue())) {
            organization = new DoctorAdmin();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AnalysisDepartment.getValue())) {
            organization = new AnalysisDepartmnetOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
