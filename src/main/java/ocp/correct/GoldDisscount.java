package ocp.correct;

public class GoldDisscount implements Disscount{

    public double apply(double price){
        return price * 0.3;
    }

}
