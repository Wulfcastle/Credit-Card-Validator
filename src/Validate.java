
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nov Exam
 */
public class Validate {
    
    public ArrayList<Integer> cardNumber = new ArrayList<Integer>(); 
    
    public int digit = 0;
    
    public Boolean LuhnFormula (JTextField txtCard) {
        Boolean flag = null;
        // Rest of the methods will fit in here. Once completed.       
        return flag;
    }
    

    
    public void addNumber (JTextField txtCard, JTextArea txtOutput) { // Steps 1 & 2 of Luhn's Formula
        String number = txtCard.getText();        
        for (int i=0; i < number.length() - 1; i++) {
            cardNumber.add(Integer.parseInt(number.substring(i, i+1))); // Adding numbers from String found in textfield, one by one, using SubString method.
        }
        txtOutput.append(this.toString("Original Number", cardNumber)); 
        digit = cardNumber.get(cardNumber.size() - 1); // Getting last digit and storing it for use later for the check part of Luhn's Formula
        cardNumber.remove(cardNumber.size() - 1); // Dropping last digit
        txtOutput.append(this.toString("Dropping Last Number", cardNumber));
    }
    
    public void reverseDigits(JTextArea txtOutput) {
        Collections.reverse(cardNumber);
        txtOutput.append(this.toString("Reverse the Digits", cardNumber));
    }
    

    
    public String toString (String Step, ArrayList<Integer> numbers) {
        String output = "";
        String title = Step;
        String outputnumbers = "";
        for (int number : numbers) {
            outputnumbers = number + "";
        }
        output = title + ": " + numbers + "\n";
        return output;
    }
    
    
    
  
            
           
    
}
