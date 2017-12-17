/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewForm;

import java.util.ArrayList;

/**
 *
 * @author arihant
 */
public class ReviewList {
    private ArrayList<ReviewForm> reviewform_arraylist;

    public ReviewList() {
            reviewform_arraylist = new ArrayList<ReviewForm>();
    }
    
    public ArrayList<ReviewForm> getReviewform_arraylist() {
        return reviewform_arraylist;
    }

}
