package Model;

import java.time.LocalDate;

public class PickledFood extends Food{
    private FoodType type = FoodType.Pickled;

    public PickledFood(int code, int d, int m, int y){
        super(code, d, m, y);
    }

    @Override
    public int getCode(){
        return super.getCode();
    }

    @Override
    public LocalDate getDate(){
        return super.getDate();
    }

    public FoodType getFoodType(){
        return this.type;
    }

    public String calExpirationDate(LocalDate date){
        // before or in same mount of expiration date
        if(date.getMonthValue() <= super.getDate().getMonthValue() && date.getYear() <= super.getDate().getYear()){
            return "This food did't expired";
        // after mount of expiration date
        } else {
            return "This food has expired";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " type=" + type;
    }

    
}