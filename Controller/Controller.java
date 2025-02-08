package Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import Model.*;

public class Controller {
    private ArrayList<Food> arrFood = new ArrayList<>();
    
    private ArrayList<Food> freshValid = new ArrayList<>();
    private ArrayList<Food> freshExpired = new ArrayList<>();
    private ArrayList<Food> pickledValid = new ArrayList<>();
    private ArrayList<Food> pickledExpired = new ArrayList<>();
    private ArrayList<Food> cannedValid = new ArrayList<>();
    private ArrayList<Food> cannedExpired = new ArrayList<>();
    
    private Food currentFood;

    public String verifyCode(String input){
        int intInput = Integer.parseInt(input);
        // length != 6
        if(input.length() != 6){
            return "Your input code did't have 6 digit";

        // First digit != 0
        } else if(input.charAt(0) == 0) {
            return "Your input code first digit must be 0";

        } else {
            for(Food f : arrFood){
                if(f.getCode() == intInput){
                    currentFood = f;
                    return "Your code have verify";
                }            
            }
            return "Your code not found"; 
        }
    }

    public void getInput(String input){
        String resultVerify = verifyCode(input);
        String foodStatus;
        if(currentFood instanceof FreshFood){
            FreshFood food = (FreshFood)currentFood;
            foodStatus = food.calExpirationDate(LocalDate.now());
        }

        if(currentFood instanceof PickledFood){
            PickledFood food = (PickledFood)currentFood;
            foodStatus = food.calExpirationDate(LocalDate.now());
        }

        if(currentFood instanceof CannedFood){
            CannedFood food = (CannedFood)currentFood;
            foodStatus = food.calExpirationDate(LocalDate.now());
        }
    }

    


}
