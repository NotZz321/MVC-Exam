package Model;

import java.sql.Date;
import java.time.LocalDate;


public class Food{
    private int code;
    private Date expirationDate;

    public Food(int code, int d, int m, int y){
        this.code = code;
        LocalDate localDate = LocalDate.of(y, m, d);
        this.expirationDate = Date.valueOf(localDate);
    }

    public int getCode(){
        return this.code;
    }

    public Date getDate(){
        return this.expirationDate;
    }

    @Override
    public String toString() {
        return "Food [code = " + code + ", date = " + expirationDate + " ] ";
    }
}