package Model;

import java.time.LocalDate;


public class CannedFood extends Food{
    private FoodType type = FoodType.Canned;

    public CannedFood(int code, int d, int m, int y){
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
        // before mount 10th of next year (plus 9 mount after last day of year)
        if(date.isBefore(LocalDate.of(date.getYear() + 1, 10, 1))){
            return "This food did't expired";
        // after or same mount 10th of next year    
        } else {
            return "This food has expired";
        }
    }

    @Override
    public String toString() {
        return super.toString() +  "type = " + type;
    }

    
}
