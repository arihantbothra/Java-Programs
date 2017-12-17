/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewForm;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class ReviewForm {
    UserAccount Employee;
    Organization org;
    double jobknowledge;
    double productivity;
    double workquality;
    double technical_skills;
    double work_consistency;
    double enthusiasm;
    double cooperation;
    double performance1, performance2;
    double attitude;
    double initiative;
    double work_relations;
    double creativity;
    double punctuality;
    double attendance;
    double dependability;
    double communication_skills;
    double overall_rating;
    String submit_status, responses;

    public String getSubmit_status() {
        return submit_status;
    }

    public void setSubmit_status(String submit_status) {
        this.submit_status = submit_status;
    }

    public double getPerformance1() {
        return performance1;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    
    public void setPerformance1() {
        this.performance1 += jobknowledge + productivity + workquality + technical_skills + work_consistency + enthusiasm + cooperation + attitude + initiative + work_relations + creativity + punctuality + attendance + dependability + communication_skills + overall_rating;
        
    }

    public double getPerformance2() {
        return performance2;
    }

    public void setPerformance2() {
        this.performance2 += jobknowledge + productivity + workquality + technical_skills + work_consistency + enthusiasm + cooperation + attitude + initiative + work_relations + creativity + punctuality + attendance + dependability + communication_skills + overall_rating;
    }

    
    public UserAccount getEmployee() {
        return Employee;
    }

    public void setEmployee(UserAccount Employee) {
        this.Employee = Employee;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public double getJobknowledge() {
        return jobknowledge;
    }

    public void setJobknowledge(double jobknowledge) {
        System.out.println(jobknowledge);
        this.jobknowledge = jobknowledge;
    }

    public double getProductivity() {
        return productivity;
    }

    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public double getWorkquality() {
        return workquality;
    }

    public void setWorkquality(double workquality) {
        this.workquality = workquality;
    }

    public double getTechnical_skills() {
        return technical_skills;
    }

    public void setTechnical_skills(double technical_skills) {
        this.technical_skills = technical_skills;
    }

    public double getWork_consistency() {
        return work_consistency;
    }

    public void setWork_consistency(double work_consistency) {
        this.work_consistency = work_consistency;
    }

    public double getEnthusiasm() {
        return enthusiasm;
    }

    public void setEnthusiasm(double enthusiasm) {
        this.enthusiasm = enthusiasm;
    }

    public double getCooperation() {
        return cooperation;
    }

    public void setCooperation(double cooperation) {
        this.cooperation = cooperation;
    }

    public double getAttitude() {
        return attitude;
    }

    public void setAttitude(double attitude) {
        this.attitude = attitude;
    }

    public double getInitiative() {
        return initiative;
    }

    public void setInitiative(double initiative) {
        this.initiative = initiative;
    }

    public double getWork_relations() {
        return work_relations;
    }

    public void setWork_relations(double work_relations) {
        this.work_relations = work_relations;
    }

    public double getCreativity() {
        return creativity;
    }

    public void setCreativity(double creativity) {
        this.creativity = creativity;
    }

    public double getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(double punctuality) {
        this.punctuality = punctuality;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public double getDependability() {
        return dependability;
    }

    public void setDependability(double dependability) {
        this.dependability = dependability;
    }

    public double getCommunication_skills() {
        return communication_skills;
    }

    public void setCommunication_skills(double communication_skills) {
        this.communication_skills = communication_skills;
    }

    public double getOverall_rating() {
        return overall_rating;
    }

    public void setOverall_rating(double overall_rating) {
        this.overall_rating = overall_rating;
    }

   
}
