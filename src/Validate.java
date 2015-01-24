
import java.util.ArrayList;
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
        
        
        return flag;
    }
    
    public void addNumber (JTextField txtCard) {
        String number = txtCard.getText();        
        for (int i=0; i > number.length(); i++) {
            cardNumber.add(Integer.parseInt(number.substring(i, i+1)));
        }
        digit = cardNumber();
        cardNumber.remove(cardNumber.size() - 1);
    }
    
    
    
  
            
           
    
}
