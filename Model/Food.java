package Model;

import java.time.LocalDate;


public class Food{
    private int code;
    private LocalDate expirationDate;

    public Food(int code, int d, int m, int y){
        this.code = code;
        expirationDate = LocalDate.of(y, m, d);
    }

    public int getCode(){
        return this.code;
    }

    public LocalDate getDate(){
        return this.expirationDate;
    }

    @Override
    public String toString() {
        return "Food [code = " + code + ", date = " + expirationDate + " ] ";
    }
}