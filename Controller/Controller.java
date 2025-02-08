package Controller;

import java.util.ArrayList;
import Model.*;

public class Controller {
    ArrayList<Food> arrFood = new ArrayList<>();

    public String verifyCode(String input){
        int intInput = Integer.parseInt(input);
        if(input.length() != 6){
            return "Your input code did't have 6 digit";

        } else if(input.charAt(0) == 0) {
            return "Your input code first digit must be 0";

        } else {
            for(Food f : arrFood){
                if(f.getCode() == intInput){
                    return "Your code have verify";
                }            
            }
            return "Your code not found"; 
        }
    }

    
}
