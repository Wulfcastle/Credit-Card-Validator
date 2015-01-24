
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
    public int sum = 0;
    
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
    
    public void multiplyOdd (JTextArea txtOutput) {
        int temp;
        for (int i=0; i < cardNumber.size() ; i++) {
            if (i % 2 != 0) { // If i mod 2 is not equal to 0 (i.e. it has a remainder) then the number is odd.
                temp = cardNumber.get(i); // Setting temp int value to that of the current element in the ArrayList.
                temp = temp * 2; // Multiplying temp int value by 2 (as per Luhn's formula).
                cardNumber.set(i, temp); // Setting the new value of the current/same element in the ArrayList, to that of the multiplied temp int value.
            }
        }
        txtOutput.append(this.toString("Multiply Odd Digits by 2", cardNumber));
    }
    
    public void subtract9 (JTextArea txtOutput) {
        int temp;
        /* for (int number : cardNumber) { // Alternate for-loop to the method above
            if (number > 9) {
                temp = cardNumber.get(number); // Setting temp int value to that of the current element in the ArrayList.
                temp = temp - 9; // Multiplying temp int value by 2 (as per Luhn's formula).
                cardNumber.set(number, temp); // Setting the new value of the current/same element in the ArrayList, to that of the multiplied temp int value.
            }
        } */
        for (int i=0; i < cardNumber.size(); i++) { 
            if (cardNumber.get(i) > 9) {
                temp = cardNumber.get(i); // Setting temp int value to that of the current element in the ArrayList.
                temp = temp - 9; // Multiplying temp int value by 2 (as per Luhn's formula).
                cardNumber.set(i, temp); // Setting the new value of the current/same element in the ArrayList, to that of the multiplied temp int value.
            }
        }
        txtOutput.append(this.toString("Subtract 9 from numbers bigger than 9", cardNumber));
    }
    
    public void addAllNumbers (JTextArea txtOutput) {        
        for (int number : cardNumber ) {
            sum = sum + number;
        }
        txtOutput.append(this.toString("Add all Numbers", cardNumber) + "=" + sum);
    }
    
    public String toString (String Step, ArrayList<Integer> numbers) {
        String output = "";
        String title = Step;
        String outputnumbers = "";
       // for (int number : numbers) {
       //     outputnumbers = number + "";
       // } 
        output = title + ": " + numbers + "\n";
        return output;
    }
    
    
    
  
            
           
    
}
