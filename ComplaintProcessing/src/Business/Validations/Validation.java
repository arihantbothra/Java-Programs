/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author arihant
 */
public class Validation {
      public void checkPassword(String password, JProgressBar jProgressBar1, JLabel jLabel7) {
        KeyStroke delKey = KeyStroke.getKeyStroke(KeyEvent.VK_BACKSPACE, InputEvent.META_MASK);
        jProgressBar1.setVisible(true);
        jProgressBar1.setStringPainted(true);
        int strengthPercentage = 0;
        String[] partialRegexChecks = {".*[a-z]+.*", // lower
            ".*[A-Z]+.*", // upper
            ".*[\\d]+.*", // digits
            ".*[@#$%]+.*" // symbols
    };
        if (password.equals(delKey)) {
            jProgressBar1.setValue(0);
            jLabel7.setText("Weaker");
        }
        if (password.matches(partialRegexChecks[0])) {
            strengthPercentage += 25;
        }
        if (password.matches(partialRegexChecks[1])) {
            strengthPercentage += 25;
        }
        if (password.matches(partialRegexChecks[2])) {
            strengthPercentage += 25;
        }
        if (password.matches(partialRegexChecks[3])) {
            strengthPercentage += 25;
        }
        if (strengthPercentage > 20) {
            jProgressBar1.setBackground(Color.red);
            jProgressBar1.setValue(strengthPercentage);
            jLabel7.setText("");
        }
        if (password.length() == 0) {
            strengthPercentage += 0;
            jProgressBar1.setValue(0);
            jLabel7.setText("");
        }
        if (strengthPercentage == 0) {
            jProgressBar1.setBackground(Color.red);
            jProgressBar1.setValue(0);
            jLabel7.setText("");
        }
        if (strengthPercentage > 0) {
            jProgressBar1.setValue(25);
            jProgressBar1.setBackground(Color.red);
            jLabel7.setText("Weak");
        }
        if (strengthPercentage > 26) {
            jProgressBar1.setBackground(Color.pink);
            jProgressBar1.setValue(strengthPercentage);
            jLabel7.setText("Fine");
        }
        if (strengthPercentage > 51) {
            jProgressBar1.setBackground(Color.orange);
            jProgressBar1.setValue(strengthPercentage);
            jLabel7.setText("Strong");
        }
        if (strengthPercentage > 76) {
            jProgressBar1.setBackground(Color.green);
            jProgressBar1.setValue(strengthPercentage);
            jLabel7.setText("Very Strong");
        }
    }
    
    
    public void digitOnlyAllowCheck(java.awt.event.KeyEvent evt,JLabel label){
        JTextField jt = (JTextField)evt.getSource();
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch) || jt.getText().trim().length()>=5||!Character.isDigit(ch)){
            evt.consume();
            jt.setBackground(Color.yellow);
            label.setText("ZipCode is invalid!!");
        }else if(jt.getText().trim().length()<=5){
            jt.setBackground(Color.white);
            label.setText("");
        }else{
            jt.setBackground(Color.white);
        }
    }
    public void alphabetOnlyAllowCheck(java.awt.event.KeyEvent evt,JLabel label){
//        JTextField textField = (JTextField)evt.getSource();
//        String str = textField.getText();
//        Pattern p = Pattern.compile("[a-zA-Z]");
//        if ((p.matcher(str).matches())) {
//            textField.setBackground(Color.white);
//            label.setText("");
//        }
//        else{
//             evt.consume();
//            textField.setBackground(Color.yellow);
//            label.setText("Error: Digits not allowed!!");
//        }
        JTextField textField = (JTextField)evt.getSource();
        char ch = evt.getKeyChar();
        
        if(!Character.isLetter(ch)){
            evt.consume();
            textField.setBackground(Color.yellow);
            label.setText("Error: Only Alphabets allowed!!");
        }else{
            textField.setBackground(Color.white);
            label.setText("");
        
        }
    }
    public void emailIdCheck(java.awt.event.KeyEvent evt,JLabel label){
        JTextField textField = (JTextField)evt.getSource();
        char ch = evt.getKeyChar();
        if(!Character.isLetter(ch)){
            evt.consume();
            textField.setBackground(Color.yellow);
            label.setText("Error: Not valid email address!!");
        }else{
            textField.setBackground(Color.white);
            label.setText("");
        } 
    }
    
    public Boolean checkForUniqueness(String value, String[] array){
        Boolean flag=true;
        int b=array.length;
        for(int a=0;a<b;a++){
            if(array[a]==value);
            {
                flag=false;
            }
        }
        return flag;
    }
    public String checkForUniqueness(String value, ArrayList array){
        String val = "unique";
        int b=array.size();
        for(int a=0;a<b;a++){
            if(array.get(a)==value)
            {
                val="unique";
            }
            else val="notUnique";
        }
        return val;
    }
}
    

