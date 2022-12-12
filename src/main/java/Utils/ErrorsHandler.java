package Utils;

import javax.swing.JLabel;

public class ErrorsHandler {

    public void CheckErrors(String name, String age, String gender, String race, JLabel errorLabel) {
        if (name.equals("") || name.charAt(0) == ' ')
            errorLabel.setText("You can't leave the name empty");
        else if (age.equals(""))
            errorLabel.setText("You can't leave the age empty");
                
        else if(gender.equals("Choose a gender"))
            errorLabel.setText("Please choose a gender");
        
        else if(race.equals("Choose a race"))
            errorLabel.setText("Please choose a race");
        else
            errorLabel.setText("");
    }
}
