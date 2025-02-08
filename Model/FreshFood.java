package Model;

import java.time.LocalDate;

public class FreshFood extends Food{
    private FoodType type = FoodType.Fresh;

    public FreshFood(int code, int d, int m, int y) {
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
        // before expiration date
        if(date.isBefore(super.getDate())){
            return "This food did't expired";
        // after expiration date
        } else {
            return "This food has expired";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " type = " + type;
    }

}
