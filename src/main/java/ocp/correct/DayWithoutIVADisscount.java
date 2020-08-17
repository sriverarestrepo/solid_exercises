package ocp.correct;

public class DayWithoutIVADisscount implements Disscount{

    public double apply(double price){
        return price * 0.19;
    }
}
