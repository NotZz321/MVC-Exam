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

    @Override
    public String toString() {
        return super.toString() +  "type = " + type;
    }

    
}
