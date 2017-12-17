/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.Enterprise.CompanyEnterprise;
import java.util.Comparator;

/**
 *
 * @author arihant
 */
public class SalaryComparator implements Comparator<CompanyEnterprise> {

//    @Override
//    public int compare(Company o1, Company o2) {
//        if (o1.getSalary() < o2.getSalary()) {
//            return 1;
//        } 
//        else {
//            return -1;
//        }
//    }

    @Override
    public int compare(CompanyEnterprise o1, CompanyEnterprise o2) {
         if (o1.getSalary() < o2.getSalary()) {
            return 1;
        } 
        else {
            return -1;
        }
    }
}
