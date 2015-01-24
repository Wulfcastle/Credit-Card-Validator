
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shimal
 */
public class Format {

    public void checkFormat(JTextField txtName, JTextField SecurityCode, JSpinner Year, JTextField cardNumber, JRadioButton Visa, JRadioButton MasterCard, JRadioButton Amex) {
        if (checkSecurityCode(SecurityCode) && checkCreditCard(cardNumber, Visa, MasterCard, Amex) && checkName(txtName) == true) {
            // Check the (checkYear) Method tomorrow
            JOptionPane.showMessageDialog(null, "Everything is in order");
        } else {
            JOptionPane.showMessageDialog(null, "Please edit your details and try again");
        }
    }

    public Boolean checkSecurityCode(JTextField SecurityCode) {
        Boolean flag = null;
        if (SecurityCode.getText().length() == 4) {
            flag = true;
        } else {
            flag = false;
            JOptionPane.showMessageDialog(null, "Please enter a correct Security Code");
        }
        return flag;
    }

    public Boolean checkYear(JSpinner Year) {
        Boolean flag = null;
        int currentTime = Calendar.getInstance().get(Calendar.YEAR);
        if (Integer.parseInt((String) Year.getValue()) < currentTime) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Please enter a correct Expiry Date");
        } else {
            flag = true;
        }
        return flag;
    }

    public Boolean checkCreditCard(JTextField cardNumber, JRadioButton Visa, JRadioButton MasterCard, JRadioButton Amex) {
        Boolean flag = null;
        int number = cardNumber.getText().length();
        if (Visa.isSelected() == false && MasterCard.isSelected() == false && Amex.isSelected() == false) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Please select a Credit Card Type");
        } else {
            if (Visa.isSelected() || MasterCard.isSelected()) {
                if (16 != number) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Please enter a correct Credit Card number of 16 length");
                } else {
                    flag = true;
                }

            } else if (Amex.isSelected()) {
                if (number != 15) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Please enter a correct Credit Card number of 15 length for American Express");
                } else {
                    flag = true;
                }
            }

        }
        return flag;
    }

    public Boolean checkName(JTextField txtName) {
        Boolean flag;
        if (txtName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Surname and Initials");
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

}
