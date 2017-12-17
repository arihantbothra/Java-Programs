/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import ReviewForm.ReviewList;
import UserInterface.Doctor.TestList;
import com.csvreader.CsvReader;
import java.io.IOException;
import java.util.ArrayList;



public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ReviewList reviewList;
    private TestList testList;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        CompanyAdmin("Company Admin Organization"), HRManager("Hr Manager Organization"), ITDepartment("IT department Organization"),
        MarketingDepartment("Marketing department organization"),EmployeeHelpAgencyAdmin("Employee help agency Admin Organization"),
        Headoffice("head office Organization"),
         RacismDepartment("Racism department organization"),GenderInequalityDepartment("Gender Inequality Department organization"),
        SexualOffenceDepartment("Sexual offence department Organization"),
        GlassDoorAdmin("glass door admin"),GlassdoorManager("Manager"),
        DoctorAdmin("Doctor"), AnalysisDepartment("Analysis Department");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) throws CsvReader.FinalizedException, CsvReader.CatastrophicException, IOException {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        reviewList = new ReviewList();
        testList = new TestList();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public TestList getTestList() {
        return testList;
    }

    public ReviewList getReviewList() {
        return reviewList;
    }
 
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
